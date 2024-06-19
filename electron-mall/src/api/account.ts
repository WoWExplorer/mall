import Http from '@/utils/http';

const api = new Http('http://localhost:8000/common/register')

export function login(data: any){
  return api.post('/login', data)
}

