import Http from '@/utils/http';

const api = new Http('http://localhost:8081/account')

export function login(data: any){
  return api.post('/login', data)
}

