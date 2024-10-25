<template>
    <div class="dynamic">

        <main class="content-container">
            <aside>
                <div class="sidebar">

                    <h3>Recommended for You</h3>
                    <ul class="recommended-questions">
                        <li>
                            <a href="#">
                                <span class="question-title">How can I improve my public speaking skills?</span>
                                <span class="question-details">Asked 2 days ago in <span class="category">Public
                                        Speaking</span></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="question-title">What are the best ways to stay motivated?</span>
                                <span class="question-details">Asked 5 days ago in <span
                                        class="category">Motivation</span></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="question-title">How do I learn a new language quickly?</span>
                                <span class="question-details">Asked 1 week ago in <span class="category">Language
                                        Learning</span></span>
                            </a>
                        </li>
                    </ul>

                    <h3>Followed Spaces</h3>
                    <ul class="followed-spaces">
                        <li><a href="#">Technology</a></li>
                        <li><a href="#">Science</a></li>
                        <li><a href="#">Health</a></li>
                    </ul>

                    <h3>Popular Questions</h3>
                    <ul class="popular-questions">
                        <li>
                            <a href="#">
                                <span class="question-title">What is the best way to start a business?</span>
                                <span class="question-details">Asked 1 month ago in <span
                                        class="category">Entrepreneurship</span></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="question-title">How can I become a better writer?</span>
                                <span class="question-details">Asked 2 weeks ago in <span
                                        class="category">Writing</span></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="question-title">What are some good books to read?</span>
                                <span class="question-details">Asked 3 months ago in <span
                                        class="category">Books</span></span>
                            </a>
                        </li>
                    </ul>
                </div>
            </aside>

            <section class="question-list">

                <!-- 图片回答的示例 -->
                <article class="question-item image-answer"  v-for="(item , index) in cards" :key="index" >
                    <div class="user-info">
                        <img :src="item.user.avatar" alt="User Avatar" class="avatar">
                        <span class="username">{{ item.user.username }}</span>
                        <p class="user-description" style="margin-left:10px">{{ item.user.description }}</p>
                    </div>
                    
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

            <aside class="right-sidebar">
                <h3>Top Writers</h3>
                <ul class="top-writers">
                    <li v-for="(item , index) in userList" :key="index">
                        <a href="#">
                            <img :src="item.avatar" alt="User Avatar" class="avatar">
                            <div class="writer-info">
                                <span class="username">{{ item.username }}</span>
                                <p class="user-description">{{ item.description }}</p>
                            </div>
                        </a>
                    </li>
                </ul>

                <h3>Trending Topics</h3>
                <ul class="trending-topics">
                    <li>
                        <a href="#">
                            <i class="fas fa-code"></i>
                            <div class="topic-info">
                                <span class="topic-title">Programming</span>
                                <p class="topic-description">Discussions about coding, software development, and
                                    programming languages.</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fas fa-heart"></i>
                            <div class="topic-info">
                                <span class="topic-title">Health & Wellness</span>
                                <p class="topic-description">Tips and discussions on maintaining a healthy lifestyle and
                                    well-being.</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fas fa-globe-americas"></i>
                            <div class="topic-info">
                                <span class="topic-title">Travel</span>
                                <p class="topic-description">Explore the world through travel stories, tips, and
                                    experiences.</p>
                            </div>
                        </a>
                    </li>
                </ul>
            </aside>

        </main>

    </div>
</template>

<script setup>
import { ref } from 'vue';

const userList = ref([
  {
    avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
    username: '李华',
    description: '软件工程师与技术博主'
  },
  {
    avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
    username: '张伟',
    description: '数据科学家与AI爱好者'
  },
  {
    avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-d809e295-17bb-4247-9d3e-daafedefdf6e.webp' , 
    username: '王丽',
    description: '内容创作者与旅行作家'
  },
  {
    avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
    username: '赵敏',
    description: '前端开发者与开源贡献者'
  },
  {
    avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
    username: '陈静',
    description: '产品经理与用户体验设计师'
  }
]);

// 定义一个包含不同类型卡片的数组
const cards = ref([
{
    type: 'article',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-20240313-033056.webp',
      username: '鲍勃·布朗',
      description: '作家与博主'
    },
    title: '讲故事的艺术',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'https://portal.infra.linesno.com/product/aip_all_product_01.jpg',
    answers: 10
  },
  {
    type: 'music',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '约翰·多伊',
      description: '音乐爱好者与DJ'
    },
    title: '我最喜欢的播放列表',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '简·史密斯',
      description: '视频博主与旅行爱好者'
    },
    title: '探索大自然',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    videoSrc: 'https://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-fbff7e50-1460-4834-83f5-9235821105ca.webp',
      username: '爱丽丝·约翰逊',
      description: '摄影师与自然爱好者'
    },
    title: '美丽的日落',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'https://portal.infra.linesno.com/product/aip_all_product_01.jpg'
  },
  {
    type: 'article',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '玛丽·格林',
      description: '自由撰稿人'
    },
    title: '如何在家工作时保持高效',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'https://via.placeholder.com/200x200',
    answers: 5
  },
  {
    type: 'music',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '李华',
      description: '独立音乐人'
    },
    title: '我的原创歌曲集',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: '张伟',
      description: '健身教练'
    },
    title: '家庭健身指南',
    videoSrc: 'https://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: '王丽',
      description: '风景摄影师'
    },
    title: '秋日的美景',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'https://via.placeholder.com/200x200',
  },
  {
    type: 'article',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'Bob Brown',
      description: 'Writer and Blogger'
    },
    title: 'The Art of Storytelling',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    image: 'https://portal.infra.linesno.com/product/aip_all_product_01.jpg',
    answers: 10
  },
  {
    type: 'music',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'John Doe',
      description: 'Music Lover and DJ'
    },
    title: 'My Favorite Playlist',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    audioSrc: 'https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3'
  },
  {
    type: 'video',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-6046836d-7766-4bfd-a93d-85fd52d2b0e4.webp',
      username: 'Jane Smith',
      description: 'Vlogger and Travel Enthusiast'
    },
    title: 'Exploring the Great Outdoors',
    content: '故事讲述是一门古老的艺术，它能够激发人们的想象力并传递知识。一个好的故事可以跨越时空，触动人心。',
    videoSrc: 'https://www.w3school.com.cn/i/movie.mp4'
  },
  {
    type: 'image',
    user: {
      avatar: 'https://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-56d48d94-e821-45e4-8592-37981ac1a483.webp',
      username: 'Alice Johnson',
      description: 'Photographer and Nature Lover'
    },
    title: 'A Beautiful Sunset',
    content: '随着远程工作的普及，越来越多的人开始在家办公。这篇文章将为你提供一些实用的建议，帮助你在家中也能保持高效。',
    image: 'https://portal.infra.linesno.com/product/aip_all_product_01.jpg'
  }
  // 可以继续添加更多的卡片对象
]);
</script>
