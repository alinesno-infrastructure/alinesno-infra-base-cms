<template>
    <header>
        <div class="header-container">
            <div class="logo">
                <img src="http://data.linesno.com/logo_2.png" alt="Logo" class="logo-img" />
                <span class="platform-name">
                    <RouterLink to="/" class="link">
                        AIP内容运营
                    </RouterLink>
                </span>
            </div>
            <nav>
                <ul>
                    <li>
                        <RouterLink to="/">
                            <i class="fas fa-home"></i> 广场
                        </RouterLink>
                    </li>
                    <li>
                        <RouterLink to="/dynamic">
                            <i class="fas fa-hashtag"></i> 动态
                        </RouterLink>
                    </li>
                </ul>
            </nav>
        </div>
    </header>
</template>

<script setup>
import { RouterLink } from 'vue-router'
</script>

<style lang="scss" scoped>
// 定义一些基础变量
$primary-color: #333;

.header-container {

    .logo {
        display: flex;
        align-items: center; // 垂直居中对齐

        .logo-img {
            width: 30px; // 设置logo宽度
            height: auto; // 保持纵横比
        }

        .platform-name {
            margin-left: 10px; // 在logo和文本之间留出一些空间
            font-size: 1.3rem; // 文字大小
            color: $primary-color; // 文字颜色
            font-weight: bold; // 加粗文字

            .link {
                text-decoration: none;
                color: $primary-color; // 文字颜色
            }
        }
    }

}
</style>