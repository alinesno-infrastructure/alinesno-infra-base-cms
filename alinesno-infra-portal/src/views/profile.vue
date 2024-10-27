<template>
    <div class="profile">

        <main>

            <!-- 用户基本信息区域 -->
            <section class="user-profile-header">
                <div class="profile-avatar">
                    <img :src="userProfile.avatar" alt="User Avatar" class="avatar">
                </div>
                <div class="profile-info">
                    <h1>{{ userProfile.name }}</h1>
                    <p class="bio">{{ userProfile.bio }}</p>
                    <div class="stats">
                        <span>文章: {{ userProfile.stats.posts }}</span>
                        <span>关注: {{ userProfile.stats.followers.toLocaleString() }}</span>
                        <span>粉丝: {{ userProfile.stats.following }}</span>
                    </div>
                </div>
            </section>

            <!-- 用户发布内容的瀑布流区域 -->
            <section class="waterfall-container">
                <!-- 文章卡片 -->
                <article class="card" v-for="(item, index) in cards" :key="index" :class="['card', item.type]">
        <RouterLink to="/profile">
          <div class="user-info">
            <img :src="item.user.avatar" alt="User Avatar" class="avatar">
            <span class="username">
              {{ item.user.username }}
              <p class="user-description">{{ item.user.description }}</p>
            </span>
          </div>
        </RouterLink>

                    <!-- 显示文章 -->
                    <div class="card-content" v-if="item.type === 'article'">
                        <h2>{{ item.title }}</h2>
                        <img src="http://portal.infra.linesno.com/product/aip_all_product_01.jpg" alt="Sunset Image"
                            class="card-image">
                        <p>
                            {{ item.content }}
                        </p>
                    </div>

                    <!-- 显示音乐 -->
                    <div class="card-content" v-if="item.type === 'music'">
                        <h2>{{ item.title }}</h2>
                        <img src="http://portal.infra.linesno.com/product/aip_all_product_01.jpg" alt="Sunset Image"
                            class="card-image">
                        <audio controls>
                            <source :src="item.audioSrc" type="audio/mpeg">
                            Your browser does not support the audio element.
                        </audio>
                    </div>

                    <!-- 显示视频 -->
                    <div class="card-content" v-if="item.type === 'video'">
                        <h2>{{ item.title }}</h2>
                        <video controls width="100%">
                            <source :src="item.videoSrc" type="video/mp4">
                            Your browser does not support the video tag.
                        </video>
                    </div>

                    <!-- 显示图片 -->
                    <div class="card-content" v-if="item.type === 'image'">
                        <h2>{{ item.title }}</h2>
                        <img :src="item.image" alt="Sunset Image" class="card-image">
                    </div>

                    <footer class="question-actions card-actions">
                        <span><i class="fas fa-comment"></i> 10 answers</span>
                        <span><i class="fas fa-star"></i> Follow</span>
                        <span><i class="fas fa-share-alt"></i> Share</span>
                    </footer>
                </article>
            </section>

        </main>


    </div>
</template>

<script setup>
import { ref } from 'vue';

const userProfile = {
    avatar: "http://staticok.oss-cn-hangzhou.aliyuncs.com/avatar-share/thumbnail-fbff7e50-1460-4834-83f5-9235821105ca.webp",
    name: "软件工程师罗小东",
    bio: "高级产品运营经理| 海外教育| 平时喜欢唱歌和跳舞",
    stats: {
        posts: 25,
        followers: 1234,
        following: 567
    }
}

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
        content: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
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
        image: 'http://portal.infra.linesno.com/product/aip_all_product_01.jpg'
    }
    // 可以继续添加更多的卡片对象
]);
</script>
