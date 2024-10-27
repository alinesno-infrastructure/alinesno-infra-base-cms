<template>
  <aside class="right-sidebar">
    <h3>博主</h3>
    <ul class="top-writers">
      <li v-for="(item, index) in userList" :key="index">
        <a href="#">
          <img :src="item.avatar" alt="User Avatar" class="avatar">
          <div class="writer-info">
            <span class="username">{{ item.username }}</span>
            <p class="user-description">{{ item.description }}</p>
          </div>
        </a>
      </li>
    </ul>

    <h3>热门主题</h3>
    <ul class="trending-topics">
      <li v-for="(topic, index) in trendingTopics" :key="index">
        <a href="#">
          <i :class="topic.icon"></i>
          <div class="topic-info">
            <span class="topic-title">{{ topic.title }}</span>
            <p class="topic-description">{{ topic.description }}</p>
          </div>
        </a>
      </li>
    </ul>

  </aside>
</template>

<script setup>
import { ref } from 'vue';

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

const trendingTopics = ref([
  {
    icon: "fas fa-code",
    title: "编程",
    description: "关于编码、软件开发和编程语言的讨论。"
  },
  {
    icon: "fas fa-heart",
    title: "健康与养生",
    description: "保持健康生活方式和福祉的提示和讨论。"
  },
  {
    icon: "fas fa-globe-americas",
    title: "旅行",
    description: "通过旅行故事、技巧和体验探索世界。"
  }
])

</script>