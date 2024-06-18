<template>
  <div class="header">
    <div class="items">
      <div class="item">
        <logoView />
      </div>
      <div class="item">
        <tagsView />
      </div>
      <div class="item">
        <navView />
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import logoView from '../logo/logoView.vue'
import tagsView from '../tags/tagsView.vue'
import navView from '../nav/navView.vue'
import './header.less'
</script>
