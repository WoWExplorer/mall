import { defineStore } from 'pinia'
import { storage } from '@/utils/Storage';
import router from "@/router";
// 你可以任意命名 `defineStore()` 的返回值，但最好使用 store 的名字，同时以 `use` 开头且以 `Store` 结尾。
// (比如 `useUserStore`，`useCartStore`，`useProductStore`)
// 第一个参数是你的应用中 Store 的唯一 ID。
export const useUserStore = defineStore({
  id: 'user',
  // 其他配置...
  state: () => ({
    count: 0,
    info: {},
    token: storage.get('token') || ''
  }),
  getters: {
    double: (state) => state.count * 2,
  },
  actions: {
    increment() {
      this.count++
    },
    setToken(token: string) {
      this.$state.token = token;
      storage.set('token', token);
      router.push({path: '/home'});
      window.ipcRenderer.send('login-success');
    },
    setInfo() {
      
    }
  }
})
