<template>
  <div class="square">

    <main class="waterfall-container">
      <!-- 文章卡片 -->
      <article class="card" v-for="(item, index) in cards" :key="index" :class="['card', item.type]">
        <RouterLink to="/profile">
          <div class="user-info">
            <img :src="'http://alinesno-infra-smart-im-ui.beta.smart.infra.linesno.com/prod-api/v1/api/infra/base/im/chat/displayImage/'+item.agentAvatar" alt="User Avatar" class="avatar">
            <span class="username">
              {{ item.agentName }}
              <p class="user-description">{{ item.agentName }} &nbsp; {{ item.fromTime }}</p>
            </span>
          </div>
        </RouterLink>

        <!-- 显示文章 -->
        <div class="card-content" v-if="item.type === 'article'">
          <h2>{{ item.title }}</h2>
          <p v-html="markdown.render(item.content)" @click="showItem(item)" ></p>

          <div v-if="item.images">
            <img v-for="i in item.images" :key="i" :src="i" alt="Answer Image" class="card-image">
          </div>
        </div>

        <!-- 显示音乐 -->
        <div class="card-content" v-if="item.type === 'audio'">
          <h2>{{ item.title }}</h2>
          <p v-html="markdown.render(item.content)"  @click="showItem(item)" ></p>

          <audio controls>
            <source :src="item.audioSrc" type="audio/mpeg">
            Your browser does not support the audio element.
          </audio>
        </div>

        <!-- 显示视频 -->
        <div class="card-content" v-if="item.type === 'video'">
          <h2>{{ item.title }}</h2>
          <p v-html="markdown.render(item.content)"  @click="showItem(item)" ></p>
          <video controls width="100%">
            <source :src="item.videoSrc" type="video/mp4">
            Your browser does not support the video tag.
          </video>
        </div>

        <!-- 显示图片 -->
        <div class="card-content" v-if="item.type === 'image'">
          <h2>{{ item.title }}</h2>
          <p v-html="markdown.render(item.content)"  @click="showItem(item)" ></p>
          <div v-if="item.type === 'image'">
            <img v-for="i in item.images" :key="i" :src="i" alt="Answer Image" class="card-image">
          </div>
        </div>

        <footer class="question-actions card-actions">
          <span><i class="fas fa-comment"></i> 10 answers</span>
          <span><i class="fas fa-star"></i> Follow</span>
          <span><i class="fas fa-share-alt"></i> Share</span>
        </footer>
      </article>

    </main>

    <el-dialog
      v-model="dialogVisible"
      :title="title"
      width="700"
      :before-close="handleClose"
    >
      <el-scrollbar height="600px">
        <article class="dialog-card">
          <p v-html="markdown.render(selectItem.content)"></p>

          <div v-if="selectItem.image">
            <img v-for="i in selectItem.image" :key="i" :src="i" alt="Answer Image" class="card-image">
          </div>

          <video v-if="selectItem.videoSrc" controls width="100%">
            <source :src="selectItem.videoSrc" type="video/mp4">
            Your browser does not support the video tag.
          </video>

          <audio controls v-if="selectItem.audioSrc">
            <source :src="selectItem.audioSrc" type="audio/mpeg">
            Your browser does not support the audio element.
          </audio>
        </article>
      </el-scrollbar>
      <template #footer>
        <div class="dialog-footer">
          <el-button type="primary" @click="dialogVisible = false">
            关闭
          </el-button>
        </div>
      </template>
    </el-dialog>

  </div>
</template>

<script setup>
import { ref } from 'vue';
import { ElLoading } from 'element-plus'

import { queryDynamic } from '@/api/post';

import MarkdownIt from 'markdown-it';
const markdown = new MarkdownIt()

const title = ref('')
const selectItem = ref('')

const dialogVisible = ref(false)

// 定义一个包含不同类型卡片的数组
const cards = ref([]);

function handleClose(done) {
  dialogVisible.value = false
}

/** 显示文章 */
function showItem(item){
  title.value = item.title
  selectItem.value = item
  dialogVisible.value = true
}

function handleQueryDynamic(){

  const loading = ElLoading.service({
    lock: true,
    text: 'Loading',
    background: 'rgba(0, 0, 0, 0.7)',
  })

  queryDynamic().then(response => {
    cards.value = response.data;
    loading.close() ;
  }).catch(error => {
    loading.close() ;
}) ;
}

handleQueryDynamic();
</script>
