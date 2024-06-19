<template>
  <div class="view">
    <n-button @click="ss()">按钮请求</n-button>
  <n-result
    status="500"
    title="500 服务器错误"
    description="服务器出错可能说明该雇更多程序员了"
  >
    <template #footer>
      <n-button>散财消灾</n-button>
    </template>
  </n-result>
    <!-- <echarts /> -->
  </div>
</template>

<script lang="ts" setup>
// import { unref } from 'vue'
import echarts from '@/components/echarts/index.vue'
import { selectByUserMobile } from '@/api/account'
const ss = () => {
  selectByUserMobile('15130422583').then(res => {
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
