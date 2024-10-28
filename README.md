# alinesno-infra-base-cms

集成通用的内容管理，用于做媒体内容信息的管理，用于政务媒体等

## 表结构设计

大多数数据表通过一个字段链接到了一个或多个数据表，这个字段一般是这个数据表的唯一数据，熟悉数据库的人肯定知道，这个数据就是 ID，如某个文章的 post_id，这些链接关系如下表：

数据表	存储的数据	关联到
wp_posts	文章、页面、附件、版本、导航菜单项目	wp_postmeta (通过post_id关联)
wp_term_relationships(通过post_id关联)
wp_postmeta	每个文章的元数据	wp_posts (通过 post_id关联)
wp_comments	评论	wp_posts (通过 post_id 关联)
wp_commentmeta	评论元数据	wp_comments (通过comment_id 关联)
wp_term_relationships	文章和自定义分类法之间的关系	wp_posts (通过 post_id 关联)
wp_term_taxonomy (通过term_taxonomy_id 关联)
wp_term_taxonomy	自定义分类法（包括默认的分类目录和标签）	wp_term_relationships(通过 term_taxonomy_id关联)
wp_terms	关联到分类法中的分类目录，标签和自定义分类项目	wp_term_taxonomy (通过term_id 关联)
wp_links	博客连接（已弃用，可以不用考虑）	wp_term_relationships(通过 link_id 关联)
wp_users	用户	wp_posts (通过post_author 关联)
wp_user_meta	每个用户的元数据	wp_users (通过 user_id 关联)
wp_options	网站设置和选项 (通过 WordPress 后台、主题、或插件设置)	独立的，不与其他任何数据表关联

## 体验

集成内容管理系统，并集成AIGC自动化运营

http://alinesno-infra-portal.beta.base.infra.linesno.com
