import axios, { AxiosInstance, AxiosResponse } from 'axios';
import { renewTimeout } from '@/api/user'
import {storage} from "@/utils/Storage";
import { useUserStore } from "@/stores/modules/useUser";

const pattern: RegExp = /^\/(login|register|renewTimeout)$/;
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
    async (config: any) => {
        const token = storage.get('token');
    // 在发送请求之前做些什么
      if (!pattern.test(config.url)) {
          const expire = storage.getExpire('token');
          // 10分钟之内
          if (expire - 600000 <= Date.now()) {
              await renewTimeout(token).then((res: any) => {
                  const { code, data, message } = res
                  if (code === 200) {
                      storage.set('token', data, data.tokenTimeout)
                  } else {
                  }
              })
          }
        if (token) {
          // 让每个请求携带 token
          config.headers['token'] = token;
        } else {
            const userStore = useUserStore();
            location.reload();
            window.$message.warning('认证超时');
           return userStore.loginOut();
        }
      }

    return config;
  },
  (error: any) => {
    // 处理请求错误
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
      if (res.code === 400 || res.code === 1022 || res.code === 1025) {
        // 重新登录
        //   userStore.loginOut();
      }
      const userStore = useUserStore();
      userStore.loginOut();
      location.reload()
      // return window.$message.error(res.message);
      // return Promise.reject(new Error(res.message || 'Error'));
    } else {
      return res;
    }
  },
  (error: any) => {
    return Promise.reject(error);
  }
);

export default service;
