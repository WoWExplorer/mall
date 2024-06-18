<script setup lang="ts">
import { darkTheme } from "naive-ui";
import { useUserStore } from "./stores/modules/useUser";
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
