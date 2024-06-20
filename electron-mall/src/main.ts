import './assets/main.css'
import { createApp } from 'vue'
import App from './App.vue'
import router, { setupRouter } from './router'
import { setupStore } from './stores'
import { setupNaive } from './plugins/naive'
import { naiveDiscrete } from './plugins/naiveDiscreteApi'

async function bootstrap() {
  const app = createApp(App)

  setupStore(app)

  setupRouter(app)

  setupNaive(app)

  naiveDiscrete(app)

  await router.isReady()
  app.mount('#app', true)

}

void bootstrap()
