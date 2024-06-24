import { defineStore } from 'pinia'
import { storage } from '@/utils/Storage';
// import router from "@/router";
import { login } from '@/api/user';

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
    setToken(token: any, expire: number) {
      this.$state.token = token;
      storage.set('token', token, expire);
    },
    loginOut() {
      this.$state.token = '';
      storage.clear();
      window.ipcRenderer.send('no-login');
    },
    // 登录
    login(data: any) {
      return new Promise((resolve: any, reject: any) => {
        login(data).then((res: any) =>{
          const { code, data, message } = res;
          if (code === 200) {
            window.$message.success('登录成功')
            this.setToken(data.tokenValue, data.tokenTimeout)
            window.ipcRenderer.send('login-success');
            resolve()
          } else {
            reject(message)
            window.$message.error(message)
          }
        })
      })
    }
  }
})
