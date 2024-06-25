<template>
  <div class="view">
    <n-button @click="ss()">按钮请求</n-button>

    <n-upload
    multiple
    directory-dnd
    action="http://localhost:8000/file/banner"
    :headers="{
      'token': token
    }"
  >
      <n-button>上传文件</n-button>
  </n-upload>
<!--  <n-result-->
<!--    status="500"-->
<!--    title="500 服务器错误"-->
<!--    description="服务器出错可能说明该雇更多程序员了"-->
<!--  >-->
<!--    <template #footer>-->
<!--      <n-button>散财消灾</n-button>-->
<!--      <n-button @click="getUserList()">查询所有</n-button>-->
<!--    </template>-->
<!--  </n-result>-->
    <!-- <echarts /> -->
  </div>
</template>

<script lang="ts" setup>
import { unref, ref } from 'vue'
import {storage} from "@/utils/Storage";
// import echarts from '@/components/echarts/index.vue'
import { areaSelectListByCondition } from '@/api/area'
import { userselectByUserMobile, userSelectListByCondition } from '@/api/user'
import { ArchiveOutline as ArchiveIcon } from '@vicons/ionicons5'
const token = ref<string>(storage.get('token'));

const ss = () => {
  // selectByUserMobile('15130422583').then(res => {
  //   console.log(res)
  // })
  areaSelectListByCondition({ level: 1 }).then(res => {
    console.log(res)
  })
}
const getUserList = () => {
  const requestData: UserParam = {
    userId: '',
    userIdFuzzy: '',
    nickName: '',
    nickNameFuzzy: '',
    realName: '',
    realNameFuzzy: '',
    userMail: '',
    userMailFuzzy: '',
    loginPassword: '',
    loginPasswordFuzzy: '',
    payPassword: '',
    payPasswordFuzzy: '',
    userMobile: '',
    userMobileFuzzy: '',
    modifyTime: undefined,
    modifyTimeStart: '',
    modifyTimeEnd: '',
    userRegtime: undefined,
    userRegtimeStart: '',
    userRegtimeEnd: '',
    userRegip: '',
    userRegipFuzzy: '',
    userLasttime: undefined,
    userLasttimeStart: '',
    userLasttimeEnd: '',
    userLastip: '',
    userLastipFuzzy: '',
    userMemo: '',
    userMemoFuzzy: '',
    sex: '',
    sexFuzzy: '',
    birthDate: '',
    birthDateFuzzy: '',
    pic: '',
    picFuzzy: '',
    status: undefined,
    score: undefined,
  };
  userSelectListByCondition(requestData).then((res: any) => {
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
