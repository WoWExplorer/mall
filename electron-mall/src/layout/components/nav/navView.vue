<template>
  <div class="nav-module">
    <div class="nav-item" @click="refresh">
      <div class="nav">
        <n-icon size="18" color="#3b8eed">
          <IconRefresh />
        </n-icon>
      </div>
    </div>
    <div class="nav-item">
      <div class="nav active">
        <n-icon size="18">
          <IconAlert />
        </n-icon>
      </div>
    </div>
  </div>
</template>
<script setup lang="ts">
import { useRoute, useRouter } from "vue-router";
import "./index.less";
import IconAlert from "@/components/icons/IconAlert.vue";
import IconRefresh from "@/components/icons/IconRefresh.vue";
const route = useRoute();
const router = useRouter();

const refresh = () => {
  console.log('刷新')
  console.log(route.fullPath)
  router.push({
    path: route.fullPath,
  });
};
</script>
