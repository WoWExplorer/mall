import {type App, computed, ref} from 'vue';
import {
    createDiscreteApi,
    ConfigProviderProps,
    darkTheme,
    lightTheme
} from 'naive-ui'
/**
 * 挂载 Naive-ui 脱离上下文的 API
 * 如果你想在 setup 外使用 useDialog、useMessage、useNotification、useLoadingBar，可以通过 createDiscreteApi 来构建对应的 API。
 * https://www.naiveui.com/zh-CN/dark/components/discrete
 */

export function naiveDiscrete(app: App<Element>) {


    const themeRef = ref<'light' | 'dark'>('light')
    const configProviderPropsRef = computed<ConfigProviderProps>(() => ({
        theme: darkTheme
    }))

    const { message, notification, dialog, loadingBar, modal } = createDiscreteApi(
        ['message', 'dialog', 'notification', 'loadingBar', 'modal'],
        {
            configProviderProps: configProviderPropsRef
        })

    window['$message'] = message;
    window['$dialog'] = dialog;
    window['$notification'] = notification;
    window['$loading'] = loadingBar;
}
