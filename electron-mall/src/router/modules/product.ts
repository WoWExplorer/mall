import type { RouteRecordRaw } from 'vue-router'
import layoutView from '@/layout/layoutView.vue'

const routeName = 'product';

/**
 * @param name 路由名称, 必须设置,且不能重名
 * @param meta 路由元信息（路由附带扩展信息）
 * @param redirect 重定向地址, 访问这个路由时,自定进行重定向
 * @param meta.disabled 禁用整个菜单
 * @param meta.permissions 权限
 * @param meta.title 菜单名称
 * @param meta.icon 菜单图标
 * @param meta.keepAlive 缓存该路由
 * @param meta.sort 排序越小越排前
 * */
const routes: Array<RouteRecordRaw> = [
  {
    path: '/product',
    name: routeName,
    redirect: `${routeName}_list`,
    component: layoutView,
    meta: {
      title: '产品管理',
      permissions: ['dashboard_console', 'dashboard_console', 'dashboard_workplace'],
      sort: 1,
      // icon: 'IconAlert'
    },
    children: [
      {
        path: 'list',
        name: `${routeName}_list`,
        meta: {
          title: '产品列表',
          permissions: ['dashboard_console'],
          affix: true,
          // icon: 'IconAlert'
        },
        component: () => import('@/views/setting/listView.vue'),
      },
      {
        path: 'desc',
        name: `${routeName}_desc`,
        meta: {
          title: '产品详情',
          permissions: ['dashboard_console'],
          affix: true,
          // icon: 'IconAlert'
        },
        component: () => import('@/views/setting/listView.vue'),
      },
      {
        path: 'create',
        name: `${routeName}_create`,
        meta: {
          title: '创建产品',
          keepAlive: true,
          permissions: ['dashboard_workplace'],
          // show: false
        },
        component: () => import('@/views/setting/IndexView.vue'),
      },
      {
        path: 'arae',
        name: `${routeName}_arae`,
        meta: {
          title: '区域管理',
          keepAlive: true,
          permissions: ['dashboard_workplace'],
          // show: false
        },
        redirect: `${routeName}_arae_list`,
        children: [
          {
            path: 'list',
            name: `${routeName}__arae_list`,
            meta: {
              title: '区域范围',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/setting/listView.vue'),
          },
          {
            path: 'desc',
            name: `${routeName}__arae_desc`,
            meta: {
              title: '区域范围详情',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/setting/listView.vue'),
          },
          {
            path: 'group',
            name: `${routeName}_arae_group`,
            meta: {
              title: '区域组合',
              keepAlive: true,
              permissions: ['dashboard_workplace'],
              // show: false
            },
            component: () => import('@/views/setting/IndexView.vue'),
          },
        ],
      },
    ],
    
  },
];

export default routes;
