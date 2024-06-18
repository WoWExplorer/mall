import axios, { AxiosInstance, AxiosRequestConfig, AxiosResponse, AxiosError } from 'axios';

// 定义接口，用于描述 API 返回的数据结构
interface ApiResponse<T> {
  success: boolean;
  message: string;
  data: T;
}

// 创建一个自定义的 Axios 实例
class Http {
  private axiosInstance: AxiosInstance;

  constructor(baseURL: string) {
    this.axiosInstance = axios.create({
      baseURL,
      timeout: 5000, // 设置超时时间
      headers: {
        'Content-Type': 'application/json', // 设置请求头
      },
    });

    // 添加请求拦截器
    this.axiosInstance.interceptors.request.use(
      (config) => {
        // 在发送请求之前做些什么
        // 可以在这里添加认证信息等
        return config;
      },
      (error) => {
        // 对请求错误做些什么
        return Promise.reject(error);
      }
    );

    // 添加响应拦截器
    this.axiosInstance.interceptors.response.use(
      (response) => {
        // 对响应数据做点什么
        // 在这里可以处理统一的错误信息，或者对返回的数据做一些统一处理
        return response.data;
      },
      (error) => {
        // 对响应错误做点什么
        // 在这里可以处理网络错误等
        return Promise.reject(error);
      }
    );
  }

  // 发送 GET 请求
  async get<T>(url: string, config?: AxiosRequestConfig) {
    const response = await this.axiosInstance.get<ApiResponse<T>>(url, config);
    return response;
  }

  // 发送 POST 请求
  async post<T>(url: string, data?: any, config?: AxiosRequestConfig) {
    const response = await this.axiosInstance.post<ApiResponse<T>>(url, data, config);
    return response;
  }
}

export default Http;
