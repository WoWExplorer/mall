import axios, { AxiosInstance, AxiosResponse } from 'axios';
import { useUserStore } from '@/stores/modules/useUser';
import { renewTimeout } from '@/api/user'
import {storage} from "@/utils/Storage";
const userStore = useUserStore();

const $message = window['$message'];
const pattern: RegExp = /^\/(login|register, renewTimeout)$/;
// 创建一个 Axios 实例
const service: AxiosInstance = axios.create({
  // baseURL: process.env.VUE_APP_BASE_API, // url = base url + request url
  baseURL: 'http://localhost:8000', // url = base url + request url
  headers: {
    'Content-Type': 'application/json'
  },
  // withCredentials: true, // 发送跨域请求时是否需要凭据
  timeout: 5000 // 请求超时时间
});

// 请求拦截器
service.interceptors.request.use(
  (config: any) => {
      console.log(userStore.$state.token.tokenTimeout * 1000 + 10000 , Date.now())
    // 在发送请求之前做些什么
      if (!pattern.test(config.url)) {
          if (userStore.$state.token.tokenTimeout * 1000 + 10000 >= Date.now()) {
              renewTimeout('').then((res: any) => {
                  if (res.code == 200) {
                      userStore.setToken(res.data)
                      // message.success(res.message)
                  } else {
                      // message.error(res.message)
                  }
              })
          }
        if (userStore.$state.token) {
          // 让每个请求携带 token
          config.headers['token'] = userStore.$state.token.tokenValue;
        } else {
            window.$message.warning('认证超时');
           return userStore.loginOut();
        }
      }

    return config;
  },
  (error: any) => {
    // 处理请求错误
    console.log(error); // 调试用
    return Promise.reject(error);
  }
);

// 响应拦截器
service.interceptors.response.use(
  (response: AxiosResponse) => {
    const res = response.data;

    // 如果自定义 code 不是 20000，则判断为错误
    if (res.code !== 200) {

      // 400: 非法的 token; 50012: 其他客户端登录了; 1025: Token 过期了;
      if (res.code === 50008 || res.code === 50012 || res.code === 1025) {
        // 重新登录
          userStore.loginOut();
      }
      return Promise.reject(new Error(res.message || 'Error'));
    } else {
      return res;
    }
  },
  (error: any) => {
    console.log('err' + error); // 调试用
    return Promise.reject(error);
  }
);

export default service;
