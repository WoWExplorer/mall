<template>
  {{ tag }}
</template>

<script setup lang="ts">
import { ref, watch } from 'vue'
import { useRoute, useRouter } from "vue-router"
const tag = ref<any>()
const currentRoute = useRoute();
const router = useRouter();
const matched = currentRoute.matched;
const getOpenKeys = matched && matched.length ? matched.map((item) => item.meta.title) : [];
tag.value = getOpenKeys.join('/');
watch(
  () => currentRoute.fullPath,
  (to) => {
    const temp = currentRoute.matched && currentRoute.matched.length ? currentRoute.matched.map((item) => item.meta.title) : [];
    tag.value = temp.join('/');
  },
  { immediate: true }
)

</script>
