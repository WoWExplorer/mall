import { defineComponent, ref, unref, onComputed } from 'vue'
import './style/index.less'

/**
 * label 表头
 * type 类型
 * sort 排序
 * options 值
 */

const Filtrate = defineComponent({
  name: 'FiltrateComponent',
  props: {
    option: {
      type: Array,
      default: () => []
    }
  },
  setup(props) {
    const data = ref(props.option)
    console.log(unref(data))
    unref(data).sort(sortData)

    function sortData(a, b) {
      return (a.sort ?? 0) - (b?.sort ?? 0)
    }

    const getClass = (type) => {
      if (type === 'datetimerange') {
        return 'filtrate-item date-picker '
      } else {
        return 'filtrate-item'
      }
    }
    const regTel = () => {
      
    }
    return { data, getClass, regTel }
  },
  render() {
    const { data, getClass, regTel } = this
    return (
        <div className="filtrate">
          {data.map((item, index) => {
            return (
              <div className={getClass(item.type)} key={index}>
                <div className="filtrate-label">{item.label}</div>
                <div className="filtrate-value">
                  {item.type === 'input' ? (
                    <n-input v-model:value={item.value} type="text" size="tiny" placeholder={item.placeholder} />
                  ) : item.type === 'tel' ? (
                    <n-input v-model:value={item.value} type="number" maxlength={item.maxlength} allowInput={regTel} show-count size="tiny" placeholder={item.placeholder} />
                  ) : item.type === 'datetimerange' ? (
                    <n-date-picker v-model:value={item.value} size="tiny" type="datetimerange" clearable placeholder={item.placeholder} />
                  ) : item.type === 'select' ? (
                    <n-select v-model:value={item.value} size="tiny" options={item.options} placeholder={item.placeholder} />
                  ) : (
                    <n-input v-model:value={item.value} type="text" size="tiny" placeholder={item.placeholder} />
                  )}
                </div>
              </div>
            )
          })}
        </div>
    )
  }
})

export default Filtrate
