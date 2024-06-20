<script setup lang="ts">
import { useUserStore } from "./stores/modules/useUser";
import { darkTheme } from 'naive-ui'
const userStore = useUserStore();
if (userStore.token) {
  window.ipcRenderer.send('login-success');
}
</script>

<template>
  <n-message-provider>
    <NConfigProvider :theme="darkTheme">
      <RouterView />
    </NConfigProvider>
  </n-message-provider>
</template>
