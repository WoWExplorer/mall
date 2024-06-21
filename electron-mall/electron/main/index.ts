import { app, BrowserWindow, shell, ipcMain, globalShortcut, Menu, Tray } from 'electron'
import { createRequire } from 'node:module'
import { fileURLToPath } from 'node:url'
import path from 'node:path'
import os from 'node:os'

const require = createRequire(import.meta.url)
const __dirname = path.dirname(fileURLToPath(import.meta.url))

// The built directory structure
//
// ├─┬ dist-electron
// │ ├─┬ main
// │ │ └── index.js    > Electron-Main
// │ └─┬ preload
// │   └── index.mjs   > Preload-Scripts
// ├─┬ dist
// │ └── index.html    > Electron-Renderer
//
process.env.APP_ROOT = path.join(__dirname, '../..')

export const MAIN_DIST = path.join(process.env.APP_ROOT, 'dist-electron')
export const RENDERER_DIST = path.join(process.env.APP_ROOT, 'dist')
export const VITE_DEV_SERVER_URL = process.env.VITE_DEV_SERVER_URL

process.env.VITE_PUBLIC = VITE_DEV_SERVER_URL
  ? path.join(process.env.APP_ROOT, 'public')
  : RENDERER_DIST

// Disable GPU Acceleration for Windows 7
if (os.release().startsWith('6.1')) app.disableHardwareAcceleration()

// Set application name for Windows 10+ notifications
if (process.platform === 'win32') app.setAppUserModelId(app.getName())

if (!app.requestSingleInstanceLock()) {
  app.quit()
  process.exit(0)
}

let win: BrowserWindow | null = null
let tray = null
let isBlinking = false
let blinkInterval = null

const preload = path.join(__dirname, '../preload/index.mjs')
const indexHtml = path.join(RENDERER_DIST, 'index.html')

async function createWindow() {

  // win = new BrowserWindow({ titleBarStyle: 'hidden' })
  win = new BrowserWindow({
    title: 'Main window',
    icon: path.join(process.env.VITE_PUBLIC, 'favicon.ico'),
    width: 280,
    height: 380,
    // width: 1000,
    // height: 800,
    autoHideMenuBar: true,
    frame: false,
    webPreferences: {
      preload,
      webSecurity: false // 禁用同源策略
      // Warning: Enable nodeIntegration and disable contextIsolation is not secure in production
      // nodeIntegration: true,

      // Consider using contextBridge.exposeInMainWorld
      // Read more on https://www.electronjs.org/docs/latest/tutorial/context-isolation
      // contextIsolation: false,
    },
  })

  if (VITE_DEV_SERVER_URL) { // #298
    win.loadURL(VITE_DEV_SERVER_URL)
    // Open devTool if the app is not packaged
    win.webContents.openDevTools()
  } else {
    win.loadFile(indexHtml)
  }



  // Test actively push message to the Electron-Renderer
  win.webContents.on('did-finish-load', () => {
    win?.webContents.send('main-process-message', new Date().toLocaleString())
  })

  // Make all links open with the browser, not with the application
  win.webContents.setWindowOpenHandler(({ url }) => {
    if (url.startsWith('https:')) shell.openExternal(url)
    return { action: 'deny' }
  })
  globalShortcut.register('Ctrl+Shift+A', () => {
    // 发送键盘事件到渲染进程
    win?.webContents.send('global-shortcut', 'CommandOrControl+X pressed');
  });
  // win.webContents.on('will-navigate', (event, url) => { }) #344

  const icon = path.join(__dirname, '../preload/logo.png');
  tray = new Tray(icon)
  const contextMenu = Menu.buildFromTemplate([
    { label: '打开', type: 'radio' },
    { label: '关闭', type: 'radio' },
    { label: '设置', type: 'radio', checked: true },
    { label: '退出', type: 'radio' }
  ])
  tray.setToolTip('This is my application.')
  tray.setContextMenu(contextMenu)
}

app.whenReady().then(createWindow)


app.on('window-all-closed', () => {
  win = null
  if (process.platform !== 'darwin') app.quit()
})

app.on('second-instance', () => {
  if (win) {
    // Focus on the main window if the user tried to open another
    if (win.isMinimized()) win.restore()
    win.focus()
  }
})

app.on('activate', () => {
  const allWindows = BrowserWindow.getAllWindows()
  if (allWindows.length) {
    allWindows[0].focus()
  } else {
    createWindow()
  }
})

let falgMax = false;
ipcMain.on('close', (event, arg) => {
  win.close() // 关闭
})
ipcMain.on('minimize', (event, arg) => {
  console.log('aaa')
  win.minimize() // 最小化
})
ipcMain.on('maximize', (event, arg) => {
  if (falgMax) {
    win.unmaximize()
    falgMax = false
  } else {
    win.maximize() // 最大化
    falgMax = true
  }
})

ipcMain.on('no-login', () => {
  if (win.isMaximized()) {
    win.unmaximize()
    falgMax = false
  }
  win.setSize(280, 380, true) // 设置窗口
  win.center()
})
ipcMain.on('login-success', (event, arg) => {
  const size = win.getSize();
  if (size[0] <= 480 || size[1] <= 580) {
    win.setSize(1200, 800, true) // 设置窗口
    win.center()
  }
  // win.setFullScreen(true) // 全屏
  // win.maximize() // 最大化
  // win.minimize() // 最小化
  // win.close() // 关闭
  // win.setAlwaysOnTop(true); // 置顶
  // win.flashFrame(true) // 闪烁
  // win.setSkipTaskbar(false)
  // startBlinking() // 系统托盘闪烁
})
let alwaysOnTopFlag = false;
// 置顶切换
ipcMain.on('setAlwaysOnTop', () => {
  if (!alwaysOnTopFlag) {
    win.setAlwaysOnTop(!alwaysOnTopFlag);
    alwaysOnTopFlag = true;
  } else {
    win.setAlwaysOnTop(!alwaysOnTopFlag)
    alwaysOnTopFlag = false
  }
})

ipcMain.on('blinking', function() {
  if (!isBlinking) {
    startBlinking()
  } else {
    stopBlinking()
  }
})
function startBlinking() {
  isBlinking = true
  const icon = path.join(__dirname, '../preload/logo.png');
  const icon_a = path.join(__dirname, '../preload/logo_1.png');
  let temp = 'b'
  blinkInterval = setInterval(() => {
    if (temp == 'a') {
      tray.setImage(icon)
      temp = 'b'
    } else {
      temp = 'a'
      tray.setImage(icon_a)
    }
  }, 500) // 每500毫秒闪烁一次
}

function stopBlinking() {
  isBlinking = false
  if (blinkInterval) {
    clearInterval(blinkInterval)
  }
  tray.setImage(path.join(__dirname, '../preload/logo.png'))
}

ipcMain.on('request-global-shortcut', (event, arg) => {
  // 在这里可以处理渲染进程发送过来的请求
  // 可以选择性地向渲染进程发送一些信息
});

// New window example arg: new windows url
ipcMain.handle('open-win', (_, arg) => {
  const childWindow = new BrowserWindow({
    webPreferences: {
      preload,
      nodeIntegration: true,
      contextIsolation: false,
    },
  })

  if (VITE_DEV_SERVER_URL) {
    childWindow.loadURL(`${VITE_DEV_SERVER_URL}#${arg}`)
  } else {
    childWindow.loadFile(indexHtml, { hash: arg })
  }
})
