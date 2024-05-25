import { createI18n } from 'vue-i18n';
import Cache from '@/plugins/cache'

// 自定义语言包
import zhCNLocale from './lang/zh-CN'
import zhTWLocale from './lang/zh-TW'
import enLocale from './lang/en'
import App from "@/App.vue";


const messages = {
  'zh-CN': {
    ...zhCNLocale
  },
  'zh-TW': {
    ...zhTWLocale
  },
  'en': {
    ...enLocale
  }
}

export const defaultLang = Cache.local.get('lang') || 'zh-CN';

const i18n = new createI18n({
    legacy: false,
    locale: defaultLang, // 通过this.$i18n.locale的值实现语言切换
    fallbackLocale: defaultLang,
    messages,
});

export default i18n;
