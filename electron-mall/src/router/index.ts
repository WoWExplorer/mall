import { type App } from 'vue'
import { createRouter, createWebHistory, type RouteRecordRaw } from 'vue-router'
import layoutView from '@/layout/layoutView.vue'
import type { IModuleType } from './types';
import { storage } from '@/utils/Storage';

const modules = import.meta.glob<IModuleType>('./modules/**/*.ts', { eager: true });

const routeModuleList: RouteRecordRaw[] = Object.keys(modules).reduce((list: RouteRecordRaw[], key: string) => {

  // console.log(key)

  const regex = /\.\/modules\/([^.]+)\./; // 匹配.modules/之后和.之前的任何内容
  const match = key.match(regex);
  const name: any = match?.[1]

  console.log(name.charAt(0).toUpperCase() + name.slice(1) + 'AdminController')
  const mod = modules[key].default ?? {};
  const modList = Array.isArray(mod) ? [...mod] : [mod];
  return [...list, ...modList];
}, []);

function sortRoute(a:any, b: any) {
  return (a.meta?.sort ?? 0) - (b.meta?.sort ?? 0);
}

routeModuleList.sort(sortRoute);
/*

  title: string;
  // 是否忽略权限
  ignoreAuth?: boolean;
  // 权限
  permissions?: string[];
  // 是否不缓存
  noKeepAlive?: boolean;
  // 是否固定在tab上
  affix?: boolean;
  // tab上的图标
  icon?: string;
  // 跳转地址
  frameSrc?: string;
  // 外链跳转地址
  externalLink?: string;
  //隐藏
  hidden?: boolean;
*/
export const RootRoute: RouteRecordRaw = {
  path: '/',
  name: 'Root',
  redirect: 'Home',
  meta: {
    title: 'Root',
    // icon: 'IconAlert',
  },
};

export const LoginRoute: RouteRecordRaw = {
  path: '/login',
  name: 'Login',
  component: () => import('@/views/login/indexView.vue'),
  meta: {
    title: '登录',
    // icon: 'IconAlert',
  },
};

export const HomeRoute: RouteRecordRaw = {
  path: '/home',
  name: 'Home',
  redirect: 'homeView',
  component: layoutView,
  meta: {
    title: '首页',
    // icon: 'IconAlert',
  },
  children: [
    {
      path: '/homeView',
      name: 'homeView',
      meta: {
        title: '工作台',
        // icon: 'IconAlert'
      },
      component: () => import('@/views/home/indexView.vue'),
    }
  ]
};

export const constantRouter: RouteRecordRaw[] = [LoginRoute, RootRoute, HomeRoute, ...routeModuleList];

const router = createRouter({
  history: createWebHistory(),
  routes: constantRouter,
  strict: true,
  scrollBehavior: () => ({ left: 0, top: 0 }),
});
export function setupRouter(app: App) {
  app.use(router);
  // 创建路由守卫
  router.beforeEach((to, from, next) => {
    const token = storage.get('token');


    if (token) {
      window.ipcRenderer.send('login-success');
      if (to.path === '/login') {
        return next({ path: '/' });
      } else {
        return next();
      }
    } else {
      if (to.path === '/login') {
        next();
      } else {
        next(`/login?redirect=${to.path}`)
        window.$message.error('请重新登录')
      }
      window.ipcRenderer.send('no-login');
    }
  })
}

export default router;
