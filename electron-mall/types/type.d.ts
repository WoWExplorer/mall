declare interface Window {
  ipcRenderer: any
}
declare global {
  interface Window {
    $message: {
      error: (msg: string) => void;
      success: (msg: string) => void;
      warning: (msg: string) => void;
    };
  }
}
