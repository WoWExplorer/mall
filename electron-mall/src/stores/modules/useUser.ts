import { defineStore } from 'pinia'
import { storage } from '@/utils/Storage';
import router from "@/router";

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
    token: (state) => state.token
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
