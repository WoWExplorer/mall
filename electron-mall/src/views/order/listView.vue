<template>
  <div class="view">
      <n-result
        status="404"
        title="404 资源不存在"
        description="生活总归带点荒谬"
      >
        <template #footer>
          <n-button @click="ss()">按钮请求</n-button>
          <n-button>找点乐子吧</n-button>
        </template>
      </n-result>
  </div>
</template>

<script setup lang="ts">
import { ref } from "vue";
import { userselectByUserMobile } from '@/api/user'
const value = ref<any>();
const ss = () => {
  userselectByUserMobile('15130422583').then(res => {
    console.log(res)
  })
}
</script>

<style scoped lang="less">
.view {
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: center;
  align-items: center;
}
</style>
