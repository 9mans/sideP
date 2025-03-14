import {createApp} from "vue";
import App from "@/App.vue";
import {createPinia} from "pinia";
import router from "@/router/index.js";

const app = createApp(App);

app.use(createPinia());
app.use(router);

router.isReady().then(() => {
    app.mount('#app');
});