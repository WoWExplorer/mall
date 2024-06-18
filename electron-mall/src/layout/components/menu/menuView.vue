<template>
  <div class="menu">
    <n-menu
      :value="path"
      :collapsed="false"
      :collapsed-width="64"
      :collapsed-icon-size="22"
      :options="menuOptions"
      key-field="key"
      @update:value="updateHandle"
    />
  </div>
</template>

<script setup lang="ts">
import { ref, unref } from "vue";
import { useRoute, useRouter } from "vue-router";
import type { MenuOption } from "naive-ui";
import "./menu.less";
import { generatorMenu } from "@/tools/menu";
const currentRoute = useRoute();
const router = useRouter();
const { options } = router;
const { routes } = options;
const path = ref();
const menuOptions = ref<MenuOption[]>([]);
const matched = currentRoute.matched;
const getOpenKeys =
  matched && matched.length ? matched.map((item) => item.name) : [];
path.value = getOpenKeys[getOpenKeys.length - 1];
menuOptions.value = generatorMenu([...unref(routes)]);
const updateHandle = (key: string) => {
  router.push({ name: key });
  path.value = key;
};
</script>
