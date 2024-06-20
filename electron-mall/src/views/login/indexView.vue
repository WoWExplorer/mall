<template>
  <div class="title-bar">
    <div class="items">
      <div class="item" @click="handler('close')"></div>
      <div class="item" @click="handler('maximize')"></div>
    </div>
    <div class="bar"></div>
  </div>
  <div class="info">
    <div class="title"><div class="text">王同學のtools</div></div>
    <n-form
      ref="formRef"
      label-placement="left"
      :model="formValue"
      :rules="rules"
      :size="size"
    >
      <n-form-item path="user.name" label-align="left">
        <n-input
          v-model:value="formValue.user.name"
          placeholder="输入账号"
        />
      </n-form-item>
      <n-form-item path="user.password">
        <n-input
          v-model:value="formValue.user.password"
          type="password"
          show-password-on="mousedown"
          placeholder="输入密码"
        />
      </n-form-item>
      <n-form-item>
        <n-button
        class="login-button"
          attr-type="button"
          color="#8a2be2"
          type="info"
          style="margin-left: auto; margin-right: auto"
          @click="handleValidateClick"
          >登陆</n-button
        >
      </n-form-item>
    </n-form>
  </div>
</template>

<script lang="ts" setup>
import { ref } from "vue";
import { useUserStore } from '@/stores/modules/useUser'
import { login } from '@/api/user'
import { type FormInst, useMessage } from "naive-ui";
const userStore = useUserStore();
const formRef = ref<FormInst | null>(null);
const size = ref<"small" | "medium" | "large">("medium");
const message = useMessage();
const formValue = ref({
  user: {
    name: "",
    password: "",
  }
});
const rules = {
  user: {
    name: {
      required: true,
      message: "请输入账号",
      trigger: "blur",
    },
    password: {
      required: true,
      message: "请输入密码",
      trigger: ["input", "blur"],
    },
  },
};
const handleValidateClick = (e: MouseEvent) => {
  e.preventDefault();
  formRef.value?.validate((errors) => {
    if (!errors) {
      login({userMobile: formValue.value.user.name, loginPassword: formValue.value.user.password}).then((res: any) => {
        if (res.code == 200) {
          userStore.setToken(res.data)
          message.success(res.message)
        } else {
          message.error(res.message)
        }
      })
    } else {
      message.warning("请输入账号和密码");
    }
  });
};
const handler = (type: string) => {
  window.ipcRenderer.send(type);
};
</script>

<style lang="less" scoped>
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
        transition: all 0.4s;
      }
      &:hover {
        cursor: pointer;
      }
      &:nth-child(2) {
        background-color: #28c940;
      }
    }
  }
  .bar {
    width: calc(100% - 102px);
    height: 40px;
    -webkit-app-region: drag;
  }
}
.info {
  width: 100%;
  box-sizing: border-box;
  padding: var(--wow-page-padding-3);
  position: absolute;
  left: 50%;
  bottom: 0;
  transform: translate(-50%, 0);
  .title {
    .text {
      width: 100%;
      height: 80px;
      text-align: center;
      font-size: 22px;
      font: 22px/80px '';
      font-weight: bold;
      background-image: linear-gradient(to right, var(--wow-purple), var(--wow-blue-dark));
      -webkit-background-clip: text;
      background-clip: text;
      color: transparent;
    }
  }
}
.login-button{
  width: 100%;
}
</style>
