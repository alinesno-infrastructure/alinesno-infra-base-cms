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
                          <img :src="item.user.avatar" alt="User Avatar" class="avatar">
                          <span class="username">{{ item.user.username }}</span>
                          <p class="user-description" style="margin-left:10px">{{ item.user.description }}</p>
                      </div>
                    </RouterLink>

                    <!-- 卡片内容 -->
                    <div class="card-content">
                        <h2>{{ item.title }}</h2>
                        <p class="answer-details">Answered 1 day ago</p>
                        <p class="answer-content">
                            {{ item.content }}
                        </p>

                        <audio controls v-if="item.type === 'music'" style="margin-top:5px">
                            <source :src="item.audioSrc" type="audio/mpeg">
                            Your browser does not support the audio element.
                        </audio>

                        <video width="320" height="240" controls v-if="item.type === 'video'">
                            <source :src="item.videoSrc" type="video/mp4">
                            Your browser does not support the video tag.
                        </video>

                        <img v-if="item.type === 'image'" :src="item.image" alt="Answer Image" class="answer-image">
                        <!-- <p class="answer-content">This is an answer provided as an image.</p> -->
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

import DynamicLeftPanel from '@/components/dynamicLeftPanel.vue'
import DynamicRightPanel from '@/components/dynamicRightPanel.vue'

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
const cards = ref([
{
    type: 'article',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-20240313-033056.webp',
      username: '鲍勃·布朗',
      description: '作家与博主'
    },
    title: '讲故事的艺术',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'http://portal.infra.linesno.com/product/aip_all_product_01.jpg',
    answers: 10
  },
  {
    type: 'music',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '约翰·多伊',
      description: '音乐爱好者与DJ'
    },
    title: '我最喜欢的播放列表',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'http://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '简·史密斯',
      description: '视频博主与旅行爱好者'
    },
    title: '探索大自然',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    videoSrc: 'http://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-fbff7e50-1460-4834-83f5-9235821105ca.webp',
      username: '爱丽丝·约翰逊',
      description: '摄影师与自然爱好者'
    },
    title: '美丽的日落',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'http://portal.infra.linesno.com/product/aip_all_product_01.jpg'
  },
  {
    type: 'article',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '玛丽·格林',
      description: '自由撰稿人'
    },
    title: '如何在家工作时保持高效',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'http://via.placeholder.com/200x200',
    answers: 5
  },
  {
    type: 'music',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '李华',
      description: '独立音乐人'
    },
    title: '我的原创歌曲集',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'http://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '张伟',
      description: '健身教练'
    },
    title: '家庭健身指南',
    videoSrc: 'http://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '王丽',
      description: '风景摄影师'
    },
    title: '秋日的美景',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'http://via.placeholder.com/200x200',
  },
  {
    type: 'article',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'Bob Brown',
      description: 'Writer and Blogger'
    },
    title: 'The Art of Storytelling',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'http://portal.infra.linesno.com/product/aip_all_product_01.jpg',
    answers: 10
  },
  {
    type: 'music',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'John Doe',
      description: 'Music Lover and DJ'
    },
    title: 'My Favorite Playlist',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'http://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: 'Jane Smith',
      description: 'Vlogger and Travel Enthusiast'
    },
    title: 'Exploring the Great Outdoors',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    videoSrc: 'http://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'Alice Johnson',
      description: 'Photographer and Nature Lover'
    },
    title: 'A Beautiful Sunset',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'http://portal.infra.linesno.com/product/aip_all_product_01.jpg'
  }
  // 可以继续添加更多的卡片对象
]);
</script>
