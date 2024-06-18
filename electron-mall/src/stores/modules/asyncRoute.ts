import { defineStore } from 'pinia'

export const useAsyncRoute = defineStore({
  id: 'async-route',
  // 其他配置...
  state: () => ({
    menu: [],
  }),
  getters: {
    getMenu: (state) => state.menu
  },
  actions: {
    setMenu() {
    }
  }
})
