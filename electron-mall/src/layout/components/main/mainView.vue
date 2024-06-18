<template>
  <div class="main-module">
    <div class="main">
      <menuView />
      <div class="cenent">
        <RouterView v-slot="{ Component }">
          <keep-alive>
            <component :is="Component" />
          </keep-alive>
        </RouterView>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
import menuView from '../menu/menuView.vue'
import './index.less'
</script>
