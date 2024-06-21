<script setup lang="ts">
import { ref } from 'vue'
import { selectListByCondition } from '@/api/user'
import FiltrateComponent from '@/components/filtrate/Filtrate'
const options = ref<any>([
  { name: 'userId', label: '用户ID', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userIdFuzzy', label: '用户ID（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'nickName', label: '昵称', type: 'input', sort: 1, options: null, value: '' },
  { name: 'nickNameFuzzy', label: '昵称（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'realName', label: '真实姓名', type: 'input', sort: 1, options: null, value: '' },
  { name: 'realNameFuzzy', label: '真实姓名（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMail', label: '用户邮箱', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMailFuzzy', label: '用户邮箱（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'loginPassword', label: '登录密码', type: 'input', sort: 1, options: null, value: '' },
  { name: 'loginPasswordFuzzy', label: '登录密码（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'payPassword', label: '支付密码', type: 'input', sort: 1, options: null, value: '' },
  { name: 'payPasswordFuzzy', label: '支付密码（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMobile', label: '手机号码', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMobileFuzzy', label: '手机号码（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'modifyTime', label: '修改时间', type: 'datetimerange', sort: 100, options: null, value: null },
  { name: 'modifyTimeStart', label: '修改时间开始', type: 'input', sort: 1, options: null, value: '' },
  { name: 'modifyTimeEnd', label: '修改时间结束', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userRegtime', label: '注册时间', type: 'datetimerange', sort: 100, options: null, value: null },
  { name: 'userRegtimeStart', label: '注册时间开始', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userRegtimeEnd', label: '注册时间结束', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userRegip', label: '注册IP', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userRegipFuzzy', label: '注册IP（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userLasttime', label: '最后登录时间', type: 'datetimerange', sort: 100, options: null, value: null },
  { name: 'userLasttimeStart', label: '最后登录时间开始', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userLasttimeEnd', label: '最后登录时间结束', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userLastip', label: '最后登录IP', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userLastipFuzzy', label: '最后登录IP（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMemo', label: '备注', type: 'input', sort: 1, options: null, value: '' },
  { name: 'userMemoFuzzy', label: '备注（模糊）', type: 'input', sort: 1, options: null, value: '' },
  {
    name: 'sex',
    label: '性别',
    type: 'select',
    sort: 18,
    options: [
      { label: '男', value: 'M' },
      { label: '女', value: 'F' }
    ],
    value: null
  },
  { name: 'sexFuzzy', label: '性别（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'birthDate', label: '出生日期', type: 'input', sort: 1, options: null, value: '' },
  { name: 'birthDateFuzzy', label: '出生日期（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'pic', label: '头像图片路径', type: 'input', sort: 1, options: null, value: '' },
  { name: 'picFuzzy', label: '头像图片路径（模糊）', type: 'input', sort: 1, options: null, value: '' },
  { name: 'status', label: '状态', type: 'input', sort: 1, options: null, value: '' },
  { name: 'score', label: '用户积分', type: 'input', sort: 1, options: null, value: '' }
]);
const getList = () => {
  const requestData: UserParam = {}
  options.value.forEach((item: any) => {
    requestData[`${item.name}`] = item.value
  })
  selectListByCondition(requestData).then((res: any) => {
    const { data } = res
    console.log(data)
  })
}
getList()
</script>

<template>
  用户列表
  <div>
    <FiltrateComponent :option="options" />
    <n-button @click="getList()">请求一哈</n-button>
  </div>
</template>
