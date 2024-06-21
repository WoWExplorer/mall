<template>
  <div class="view">
    <n-result status="418" title="418 我是个杯具" description="一切尽在不言中">
      <template #footer>
        <n-button>接受真相就是这么简单</n-button>
        <br/>
        <n-button @click="ss()">按钮请求</n-button>
      </template>
    </n-result>
  </div>
</template>

<script setup lang="ts">
import { selectByUserMobile } from '@/api/user'
const ss = () => {
  selectByUserMobile('15130422583').then(res => {
    console.log(res)
  })
}
</script>

<style scoped lang="scss">
.view {
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: center;
  align-items: center;
}
</style>
