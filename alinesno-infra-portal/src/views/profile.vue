<template>
    <div class="profile">

        <main>
            <!-- 用户基本信息区域 -->
            <section class="user-profile-header">
                <div class="profile-avatar">
                    <img src="https://via.placeholder.com/150" alt="User Avatar" class="avatar">
                </div>
                <div class="profile-info">
                    <h1>John Doe</h1>
                    <p class="bio">Music Lover and DJ | Travel Enthusiast | Photographer and Nature Lover</p>
                    <div class="stats">
                        <span>Posts: 25</span>
                        <span>Followers: 1,234</span>
                        <span>Following: 567</span>
                    </div>
                </div>
            </section>

            <!-- 用户发布内容的瀑布流区域 -->
            <section class="waterfall-container">
                <!-- 音乐卡片 -->
                <article class="card music">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Music Lover and DJ</p>
                    </div>
                    <h2>My Favorite Playlist</h2>
                    <audio controls>
                        <source src="https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3" type="audio/mpeg">
                        Your browser does not support the audio element.
                    </audio>
                </article>

                <!-- 视频卡片 -->
                <article class="card video">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Vlogger and Travel Enthusiast</p>
                    </div>
                    <h2>Exploring the Great Outdoors</h2>
                    <video controls width="100%">
                        <source src="https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
                            type="video/mp4">
                        Your browser does not support the video tag.
                    </video>
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 视频卡片 -->
                <article class="card video">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Vlogger and Travel Enthusiast</p>
                    </div>
                    <h2>Exploring the Great Outdoors</h2>
                    <video controls width="100%">
                        <source src="https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
                            type="video/mp4">
                        Your browser does not support the video tag.
                    </video>
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 视频卡片 -->
                <article class="card video">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Vlogger and Travel Enthusiast</p>
                    </div>
                    <h2>Exploring the Great Outdoors</h2>
                    <video controls width="100%">
                        <source src="https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
                            type="video/mp4">
                        Your browser does not support the video tag.
                    </video>
                </article>

                <!-- 图片卡片 -->
                <article class="card image">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Photographer and Nature Lover</p>
                    </div>
                    <h2>A Beautiful Sunset</h2>
                    <img src="https://portal.infra.linesno.com/product/aip_all_product_01.jpg" alt="Sunset Image"
                        class="card-image">
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 图片卡片 -->
                <article class="card image">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Photographer and Nature Lover</p>
                    </div>
                    <h2>A Beautiful Sunset</h2>
                    <img src="https://portal.infra.linesno.com/product/aip_all_product_01.jpg" alt="Sunset Image"
                        class="card-image">
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 视频卡片 -->
                <article class="card video">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Vlogger and Travel Enthusiast</p>
                    </div>
                    <h2>Exploring the Great Outdoors</h2>
                    <video controls width="100%">
                        <source src="https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
                            type="video/mp4">
                        Your browser does not support the video tag.
                    </video>
                </article>

                <!-- 图片卡片 -->
                <article class="card image">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Photographer and Nature Lover</p>
                    </div>
                    <h2>A Beautiful Sunset</h2>
                    <img src="https://portal.infra.linesno.com/product/aip_all_product_01.jpg" alt="Sunset Image"
                        class="card-image">
                </article>

                <!-- 文章卡片 -->
                <article class="card article">
                    <div class="user-info">
                        <img src="https://via.placeholder.com/50" alt="User Avatar" class="avatar">
                        <span class="username">John Doe</span>
                        <p class="user-description">Writer and Blogger</p>
                    </div>
                    <h2>The Art of Storytelling</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.</p>
                </article>

                <!-- 更多卡片... -->
            </section>
        </main>

    </div>
</template>
