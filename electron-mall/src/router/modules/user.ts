import type { RouteRecordRaw } from 'vue-router'
import layoutView from '@/layout/layoutView.vue'

const routeName = 'user';

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
        path: '/user',
        name: routeName,
        redirect: `${routeName}_list`,
        component: layoutView,
        meta: {
            title: '用户管理',
            permissions: ['dashboard_console', 'dashboard_console', 'dashboard_workplace'],
            sort: 1,
            // icon: 'IconAlert'
        },
        children: [
            {
                path: 'list',
                name: `${routeName}_list`,
                meta: {
                    title: '用户列表',
                    permissions: ['dashboard_console'],
                    affix: true,
                    // icon: 'IconAlert'
                },
                component: () => import('@/views/user/ListView.vue'),
            }
        ],
    },
];

export default routes;
