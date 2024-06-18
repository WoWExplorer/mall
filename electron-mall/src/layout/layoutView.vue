<template>
  <div class="layout-module">
    <div class="title-bar">
      <div class="items">
        <div class="item" @click="handler('close')"></div>
        <div class="item" @click="handler('minimize')"></div>
        <div class="item" @click="handler('maximize')"></div>
        <!-- <div class="item" @click="handler('setAlwaysOnTop')"></div> -->
        <!-- <div class="item" @click="handler('blinking')"></div> -->
      </div>
      <div class="bar"><headerView /></div>
    </div>
    <div class="layout">
      <!-- <headerView /> -->
      <mainView />
    </div>
  </div>
</template>

<script setup lang="ts">
import headerView from './components/header/headerView.vue'
import mainView from './components/main/mainView.vue'
const handler = (type: string) => {
    window.ipcRenderer.send(type);
}
</script>
<style  scoped lang="less">
.title-bar {
  display: flex;
  height: 40px;
  width: 100%;
  justify-content: left;
  align-items: center;
  background-color: #333; /* 这里替换为你想要的颜色 */
  .items {
    display: flex;
    justify-content: left;
    align-items: center;
    &:hover {
      .item {
        .n-icon {
          opacity: 1;
        }
      }
    }
    .item {
      width: 16px;
      height: 16px;
      border-radius: 50%;
      background-color: #ff5f52;
      margin: 0 4px;
      position: relative;
      line-height: 16px;
      text-align: center;
      .n-icon {
        // color: #FFF;
        color: #333;
        opacity: 0;
        transition: all .4s;
      }
      &:hover {
        cursor: pointer; 
      }
      &:nth-child(2) {
        background-color: #ffbd2e;
      }
      &:nth-child(3) {
        background-color: #28c940;
      }
    }
  }
  .bar {
    width: 100%;
    height: 40px;
    // -webkit-app-region: drag;
  }
}
.layout-module {
  width: 100%;
  height: calc(100vh - 40px);
  .layout {
    width: 100%;
    height: 100%;
    background: var(--wow-bg-soft);
    border-radius: var(--wow-modules-border-radius);
    overflow: hidden;
  }
}
</style>
