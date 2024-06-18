import type { RouteRecordRaw } from 'vue-router'
import layoutView from '@/layout/layoutView.vue'

const routeName = 'order';

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
    path: '/order',
    name: routeName,
    redirect: `${routeName}_list`,
    component: layoutView,
    meta: {
      title: '订单管理',
      permissions: ['dashboard_console', 'dashboard_console', 'dashboard_workplace'],
      sort: 1,
      // icon: 'IconAlert'
    },
    children: [
      {
        path: 'list',
        name: `${routeName}_list`,
        meta: {
          title: '订单查询',
          permissions: ['dashboard_console'],
          affix: true,
          // icon: 'IconAlert'
        },
        component: () => import('@/views/order/listView.vue'),
      },
      {
        path: 'workpla',
        name: `${routeName}_workplace`,
        meta: {
          title: '失效订单',
          keepAlive: true,
          permissions: ['dashboard_workplace'],
        },
        component: () => import('@/views/order/indexView.vue'),
      },
      {
        path: 'history',
        name: `${routeName}_list_history`,
        meta: {
          title: '历史订单',
          keepAlive: true,
          permissions: ['dashboard_workplace'],
        },
        component: () => import('@/views/order/indexView.vue'),
      },
      {
        path: 'callback',
        name: `${routeName}_list_callback`,
        meta: {
          title: '订单回访',
          keepAlive: true,
          permissions: ['dashboard_workplace'],
        },
        component: () => import('@/views/order/indexView.vue'),
      },
      {
        path: 'list2',
        name: `${routeName}_list2`,
        meta: {
          title: '联名订单',
          permissions: ['dashboard_console'],
          affix: true,
          // icon: 'IconAlert'
        },
        redirect: '/order/list2/list-1',
        children: [
          {
            path: 'list-1',
            name: `${routeName}_list-yibao`,
            meta: {
              title: '熠保订单',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/order/indexView.vue'),
          },
          {
            path: 'list-2-2',
            name: `${routeName}_list_jd`,
            meta: {
              title: '京东订单',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/order/indexView.vue'),
          },
          {
            path: 'list-3-3',
            name: `${routeName}_list_mbh`,
            meta: {
              title: '梦百合',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/order/indexView.vue'),
          },
          {
            path: 'list-4-4',
            name: `${routeName}_list_mt`,
            meta: {
              title: '美团订单',
              permissions: ['dashboard_console'],
              affix: true,
              // icon: 'IconAlert'
            },
            component: () => import('@/views/order/indexView.vue'),
          },
        ]
      },
    ],
  },
];

export default routes;
