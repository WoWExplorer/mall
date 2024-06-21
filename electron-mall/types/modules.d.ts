/// <reference types="vite/client" />
declare module '*.vue' {
  import { DefineComponent } from 'vue';
  const Component: DefineComponent<{}, {}, any>;
  export default Component;
}

declare module 'virtual:*' {
  const result: any;
  export default result;
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
