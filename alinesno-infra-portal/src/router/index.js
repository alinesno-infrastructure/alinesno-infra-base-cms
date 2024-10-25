import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      redirect: '/square',
    },
    {
      path: '/square',
      name: 'square',
      component: () => import('@/views/square.vue')
    },
    {
      path: '/dynamic',
      name: 'dynamic',
      component: () => import('@/views/dynamic.vue')
    },
    {
      path: '/profile',
      name: 'profile',
      component: () => import('@/views/profile.vue')
    }
  ]
})

export default router
