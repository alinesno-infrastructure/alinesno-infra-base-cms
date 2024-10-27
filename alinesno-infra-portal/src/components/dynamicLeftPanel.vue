<template>
  <aside>
    <div class="sidebar">

      <h3>推荐内容</h3>
      <ul class="recommended-questions">
        <li v-for="(question, index) in recommendedQuestions" :key="index">
          <a :href="question.href">
            <span class="question-title">{{ question.title }}</span>
            <span class="question-details" v-html="question.details"></span>
          </a>
        </li>
      </ul>

      <h3>话题列表</h3>
      <ul class="followed-spaces">
        <li v-for="(space, index) in followedSpaces" :key="index">
          <a :href="space.href" class="topic-item">
            {{ space.title }} 
            <span class="discussion-count">({{ space.discussions }} 讨论)</span>
          </a>
        </li>
      </ul>

      <h3>最受欢迎</h3>
      <ul class="popular-questions">
        <li v-for="(question, index) in popularQuestions" :key="index">
          <a :href="question.href">
            <span class="question-title">{{ question.title }}</span>
            <span class="question-details" v-html="question.details"></span>
          </a>
        </li>
      </ul>
    </div>
  </aside>
</template>

<script setup>

import { ref } from "vue";

const followedSpaces = ref([
  {
    title: "科技",
    discussions: 120,
    href: "#"
  },
  {
    title: "科学",
    discussions: 85,
    href: "#"
  },
  {
    title: "健康",
    discussions: 200,
    href: "#"
  }
])

const recommendedQuestions = ref([
  {
    title: "如何提高我的公众演讲技巧？",
    details: "2天前在 <span class='category'>公众演讲</span> 类别下提问",
    href: "#"
  },
  {
    title: "如何成为一名更好的作家？有哪些技巧和资源可以帮助提高写作技能？",
    details: "5天前在 <span class='category'>动机</span> 类别下提问",
    href: "#"
  },
  {
    title: "如何快速学习一门新语言？",
    details: "1周前在 <span class='category'>语言学习</span> 类别下提问",
    href: "#"
  }
]);

const popularQuestions = ref([
  {
    title: "创业的最佳方式是什么？如何找到一个好的商业想法并成功启动它？",
    details: "1个月前在 <span class='category'>创业</span> 类别下提问",
    href: "#"
  },
  {
    title: "保持动力的最佳方法是什么？",
    details: "2周前在 <span class='category'>写作</span> 类别下提问",
    href: "#"
  },
  {
    title: "有哪些好书值得阅读？推荐一些能够启发思考和个人成长的好书。",
    details: "3个月前在 <span class='category'>书籍</span> 类别下提问",
    href: "#"
  }
])

</script>
