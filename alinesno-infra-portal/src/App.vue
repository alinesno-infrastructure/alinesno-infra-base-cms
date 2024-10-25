<template>

  <AipHeader />

  <RouterView />

  <AipFooter />
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'

import AipHeader from './components/header.vue'
import AipFooter from './components/footer.vue'

</script>
