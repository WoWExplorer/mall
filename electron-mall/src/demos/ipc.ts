
window.ipcRenderer.on('main-process-message', (_event: any, ...args: any) => {
  console.log('[Receive Main-process message]:', ...args)
})
window.ipcRenderer.on('global-shortcut', (event: any, message: any) => {
  console.log(message); // 这里可以对事件做出响应，例如在页面中显示通知等
});
