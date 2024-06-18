<template>
  <div class="view">
    <n-result status="404" title="大！大！啊" description="这么大" size="huge">
    <template #footer>
      <n-button>哦</n-button>
    </template>
  </n-result>
  </div>
</template>

<style scoped lang="less">
.view {
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: center;
  align-items: center;
}
</style>
