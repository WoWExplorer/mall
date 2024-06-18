<template>
  <FiltrateComponent :option="option" />
  <n-button type="primary" dashed @click="getValue">
  提交简历
  </n-button>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import FiltrateComponent from '@/components/filtrate/Filtrate'
const option = ref([
  {
    label: '姓名',
    type: 'input',
    sort: 1,
    options: null,
    value: '李白'
  },
  {
    label: '爱好',
    type: 'input',
    sort: 1,
    options: null,
    value: '摸鱼'
  },
  {
    label: '特长',
    type: 'input',
    sort: 1,
    options: null,
    value: '爱好'
  },
  {
    label: '牛马荣誉奖项',
    type: 'input',
    sort: 1,
    options: null,
    value: '168超长待机'
  },
  {
    label: '牛马编号',
    type: 'tel',
    sort: 2,
    options: null,
    maxlength: 11,
    value: null
  },
  {
    label: '是否超前吃草',
    type: 'tel',
    sort: 2,
    options: null,
    maxlength: 11,
    value: null,
    placeholder: ''
  },
  {
    label: '牛马父代',
    type: 'input',
    sort: 5,
    options: null,
    maxlength: 11,
    value: null
  },
  {
    label: '牛马拉地经验',
    type: 'datetimerange',
    sort: 100,
    options: null,
    value: null
  },
  {
    label: '牛马在岗经验',
    type: 'datetimerange',
    sort: 100,
    options: null,
    value: null
  },
  {
    label: '性别',
    type: 'select',
    sort: 18,
    options: [{
        label: '男',
        value: 1
      }, {
        label: '女',
        value: 2
      }],
    value: null
  },
  {
    label: '牲畜户籍性质',
    type: 'select',
    sort: 18,
    placeholder: '决定投喂草料',
    options: [{
        label: '农',
        value: 1
      }, {
        label: '城',
        value: 2
      }],
    value: null
  },
])

const getValue = () => {
  console.log(option.value)
}

</script>
