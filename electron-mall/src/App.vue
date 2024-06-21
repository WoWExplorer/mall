<script setup lang="ts">
import { darkTheme } from 'naive-ui'
</script>

<template>
  <n-message-provider>
    <NConfigProvider :theme="darkTheme">
      <RouterView />
    </NConfigProvider>
  </n-message-provider>
</template>
