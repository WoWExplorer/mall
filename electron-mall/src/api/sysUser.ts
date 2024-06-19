import Http from '@/utils/http';

const api = new Http('http://localhost:8000/user')

export function login(data: any){
  return api.post('/selectByUserMobile', data)
}

