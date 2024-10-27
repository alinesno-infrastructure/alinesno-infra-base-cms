<template>
    <footer class="footer-container-p">
        <div class="footer-container">
            <div v-for="(section, index) in footerSections" :key="index" class="footer-section">
                <h3>{{ section.title }}</h3>
                <ul>
                    <li v-for="(link, linkIndex) in section.links" :key="linkIndex">
                        <a :href="link.href">
                            <i v-if="link.icon" :class="link.icon"></i>
                            {{ link.text }}
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="footer-bottom">
            <p>{{ copyright }}</p>
            <p>语言:
                <span v-for="(lang, langIndex) in languages" :key="langIndex">
                    <a :href="lang.href">{{ lang.text }}</a>
                    <template v-if="langIndex < languages.length - 1"> | </template>
                </span>
            </p>
        </div>
    </footer>
</template>

<script setup>

import { ref } from "vue"

const footerSections = ref([
    {
      title: "为什么选择 AIP",
      links: [
        { text: "选择 AIP", href: "#" },
        { text: "信任与安全", href: "#" },
        { text: "开放的云", href: "#" },
        { text: "多云", href: "#" },
        { text: "全球基础架构", href: "#" },
        { text: "客户和案例研究", href: "#" },
        { text: "分析师报告", href: "#" },
        { text: "白皮书", href: "#" },
        { text: "博客", href: "#" }
      ]
    },
    {
      title: "产品和价格",
      links: [
        { text: "AIP 价格", href: "#" },
        { text: "AIP Workspace 价格", href: "#" },
        { text: "查看所有产品", href: "#" }
      ]
    },
    {
      title: "解决方案",
      links: [
        { text: "基础架构现代化", href: "#" },
        { text: "数据库", href: "#" },
        { text: "应用现代化改造", href: "#" },
        { text: "智能分析", href: "#" },
        { text: "人工智能", href: "#" },
        { text: "安全", href: "#" },
        { text: "Productivity & work transformation", href: "#" },
        { text: "Industry solutions", href: "#" },
        { text: "DevOps solutions", href: "#" },
        { text: "Small business solutions", href: "#" },
        { text: "查看所有解决方案", href: "#" }
      ]
    },
    {
      title: "资源",
      links: [
        { text: "AIP 文档", href: "#" },
        { text: "AIP 快速入门", href: "#" },
        { text: "AIP Marketplace", href: "#" },
        { text: "了解云计算", href: "#" },
        { text: "支持", href: "#" },
        { text: "代码示例", href: "#" },
        { text: "云架构中心", href: "#" },
        { text: "培训", href: "#" },
        { text: "认证", href: "#" },
        { text: "AIP for Developers", href: "#" },
        { text: "AIP 创业公司计划", href: "#" },
        { text: "系统状态", href: "#" },
        { text: "版本说明", href: "#" }
      ]
    },
    {
      title: "互动",
      links: [
        { text: "与销售人员联系", href: "#" },
        { text: "查找合作伙伴", href: "#" },
        { text: "成为合作伙伴", href: "#" },
        { text: "活动", href: "#" },
        { text: "播客", href: "#" },
        { text: "开发者中心", href: "#" },
        { text: "媒体资讯角", href: "#" }
      ]
    }
]);
const copyright = ref("2024 您的公司名称. 版权所有。")
const languages = ref([
    { text: "English", href: "#" },
    { text: "简体中文", href: "#" },
    { text: "Español", href: "#" },
    { text: "Français", href: "#" },
    { text: "Deutsch", href: "#" }
])
</script>