import axios, { AxiosInstance, AxiosResponse } from 'axios';
import { useUserStore } from '@/stores/modules/useUser'

const userStore = useUserStore();
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
    // 在发送请求之前做些什么
    if (userStore.$state.token) {
      // 让每个请求携带 token
      // ['X-Token'] 是一个自定义的 headers key，请根据实际情况修改
      config.headers['token'] = userStore.$state.token.tokenValue;
      // config.headers['token'] = 'f28af5eb-4cea-4694-8498-b964359d8ec2';
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

      // 50008: 非法的 token; 50012: 其他客户端登录了; 50014: Token 过期了;
      if (res.code === 50008 || res.code === 50012 || res.code === 50014) {
        // 重新登录
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
