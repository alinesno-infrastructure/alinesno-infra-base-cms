<template>
    <div class="dynamic">

        <main class="content-container">

           <!-- 左边面板-->
           <DynamicLeftPanel />

            <section class="question-list">

                <!-- 图片回答的示例 -->
                <article class="question-item image-answer"  v-for="(item , index) in cards" :key="index" >
                    <RouterLink to="/profile">
                      <div class="user-info">
                          <img :src="'http://alinesno-infra-smart-im-ui.beta.smart.infra.linesno.com/prod-api/v1/api/infra/base/im/chat/displayImage/'+item.agentAvatar" alt="User Avatar" class="avatar">
                          <span class="username">{{ item.agentName}}</span>
                          <p class="user-description" style="margin-left:10px">{{ item.agentName }}</p>
                      </div>
                    </RouterLink>

                    <!-- 卡片内容 -->
                    <div class="card-content">
                        <h2>{{ item.title }}</h2>
                        <p class="answer-details">Answered {{ item.fromTime }}</p>
                        <p class="answer-content" v-html="markdown.render(item.content)"></p>

                        <audio controls v-if="item.type === 'audio'" style="margin-top:5px">
                            <source :src="item.audioSrc" type="audio/mpeg">
                            Your browser does not support the audio element.
                        </audio>

                        <video width="320" height="240" controls v-if="item.type === 'video'">
                            <source :src="item.videoSrc" type="video/mp4">
                            Your browser does not support the video tag.
                        </video>

                        <div v-if="item.type === 'image'">
                          <img v-for="i in item.image" :key="i" :src="i" alt="Answer Image" class="answer-image">
                        </div>
                    </div>

                    <footer class="question-actions">
                        <span><i class="fas fa-comment"></i> 10 answers</span>
                        <span><i class="fas fa-star"></i> Follow</span>
                        <span><i class="fas fa-share-alt"></i> Share</span>
                    </footer>
                </article>

            </section>

            <!-- 右侧面板-->
            <DynamicRightPanel />
            
        </main>

    </div>
</template>

<script setup>
import { ref } from 'vue';
import { ElLoading } from 'element-plus'

import DynamicLeftPanel from '@/components/dynamicLeftPanel.vue'
import DynamicRightPanel from '@/components/dynamicRightPanel.vue'

import { queryDynamic } from '@/api/post';

import MarkdownIt from 'markdown-it';

const markdown = new MarkdownIt()

const userList = ref([
  {
    avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
    username: '李华',
    description: '软件工程师与技术博主'
  },
  {
    avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
    username: '张伟',
    description: '数据科学家与AI爱好者'
  },
  {
    avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-d809e295-17bb-4247-9d3e-daafedefdf6e.webp' ,
    username: '王丽',
    description: '内容创作者与旅行作家'
  },
  {
    avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
    username: '赵敏',
    description: '前端开发者与开源贡献者'
  },
  {
    avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
    username: '陈静',
    description: '产品经理与用户体验设计师'
  }
]);

// 定义一个包含不同类型卡片的数组
const cards = ref([]);

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
