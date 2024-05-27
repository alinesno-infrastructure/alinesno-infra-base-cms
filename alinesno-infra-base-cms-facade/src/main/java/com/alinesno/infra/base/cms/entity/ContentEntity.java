package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * 数据表：content 表备注：
 * 栏目实体类
 *
 * @TableName("content")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("content")
@Data
public class ContentEntity extends InfraBaseEntity {

    /**
     * 内容ID
     */
	@ColumnType(length=255)
	@ColumnComment("内容ID")
	@TableField("content_id")
    private Long contentId;

    /**
     * 所属站点ID
     */
	@ColumnType(length=255)
	@ColumnComment("所属站点ID")
	@TableField("site_id")
    private Long siteId;

    /**
     * 所属栏目ID
     */
	@ColumnType(length=255)
	@ColumnComment("所属栏目ID")
	@TableField("catalog_id")
    private Long catalogId;

    /**
     * 所属栏目祖级IDs
     */
	@ColumnType(length=255)
	@ColumnComment("所属栏目祖级IDs")
	@TableField("catalog_ancestors")
    private String catalogAncestors;

    /**
     * 所属顶级栏目
     */
	@ColumnType(length=255)
	@ColumnComment("所属顶级栏目")
	@TableField("top_catalog")
    private Long topCatalog;

    /**
     * 部门ID
     */
	@ColumnType(length=255)
	@ColumnComment("部门ID")
	@TableField("dept_id")
    private Long deptId;

    /**
     * 部门编码
     */
	@ColumnType(length=255)
	@ColumnComment("部门编码")
	@TableField("dept_code")
    private String deptCode;

    /**
     * 内容类型
     */
	@ColumnType(length=255)
	@ColumnComment("内容类型")
	@TableField("content_type")
    private String contentType;

    /**
     * 标题
     */
	@ColumnType(length=255)
	@ColumnComment("标题")
	@TableField("title")
    private String title;

    /**
     * 副标题
     */
	@ColumnType(length=255)
	@ColumnComment("副标题")
	@TableField("sub_title")
    private String subTitle;

    /**
     * 短标题
     */
	@ColumnType(length=255)
	@ColumnComment("短标题")
	@TableField("short_title")
    private String shortTitle;

    /**
     * 标题样式
     */
	@ColumnType(length=255)
	@ColumnComment("标题样式")
	@TableField("title_style")
    private String titleStyle;

    /**
     * logo
     */
	@ColumnType(length=255)
	@ColumnComment("logo")
	@TableField("logo")
    private String logo;

    /**
     * 来源
     */
	@ColumnType(length=255)
	@ColumnComment("来源")
	@TableField("source")
    private String source;

    /**
     * 来源URL
     */
	@ColumnType(length=255)
	@ColumnComment("来源URL")
	@TableField("source_url")
    private String sourceUrl;

    /**
     * 是否原创
     */
	@ColumnType(length=255)
	@ColumnComment("是否原创")
	@TableField("original")
    private String original;

    /**
     * 作者
     */
	@ColumnType(length=255)
	@ColumnComment("作者")
	@TableField("author")
    private String author;

    /**
     * 编辑
     */
	@ColumnType(length=255)
	@ColumnComment("编辑")
	@TableField("editor")
    private String editor;

    /**
     * 投稿会员Id
     */
	@ColumnType(length=255)
	@ColumnComment("投稿会员Id")
	@TableField("contributor_id")
    private Long contributorId;

    /**
     * 摘要
     */
	@ColumnType(length=255)
	@ColumnComment("摘要")
	@TableField("summary")
    private String summary;

    /**
     * 自定义静态化文件路径
     */
	@ColumnType(length=255)
	@ColumnComment("自定义静态化文件路径")
	@TableField("static_path")
    private String staticPath;

    /**
     * 内容状态
     */
	@ColumnType(length=255)
	@ColumnComment("内容状态")
	@TableField("status")
    private String status;

    /**
     * 内容属性
     */
	@ColumnType(length=255)
	@ColumnComment("内容属性")
	@TableField("attributes")
    private Integer attributes;

    /**
     * 是否链接内容
     */
	@ColumnType(length=255)
	@ColumnComment("是否链接内容")
	@TableField("link_flag")
    private String linkFlag;

    /**
     * 链接
     */
	@ColumnType(length=255)
	@ColumnComment("链接")
	@TableField("redirect_url")
    private String redirectUrl;

    /**
     * 置顶标识
     */
	@ColumnType(length=255)
	@ColumnComment("置顶标识")
	@TableField("top_flag")
    private Long topFlag;

    /**
     * 置顶结束时间
     */
	@ColumnType(length=255)
	@ColumnComment("置顶结束时间")
	@TableField("top_date")
    private LocalDateTime topDate;

    /**
     * 排序字段
     */
	@ColumnType(length=255)
	@ColumnComment("排序字段")
	@TableField("sort_flag")
    private Long sortFlag;

    /**
     * 关键词
     */
    @TableField(exist = false)
	@ColumnType(length=255)
	@ColumnComment("关键词")
    private String[] keywords;

    /**
     * TAGs
     */
	@TableField(exist = false)
	@ColumnType(length=255)
	@ColumnComment("TAGs")
    private String[] tags;

    /**
     * 复制类型
     */
	@ColumnType(length=255)
	@ColumnComment("复制类型")
	@TableField("copy_type")
    private Integer copyType;

    /**
     * 复制源ID
     */
	@ColumnType(length=255)
	@ColumnComment("复制源ID")
	@TableField("copy_id")
    private Long copyId;

    /**
     * 发布时间
     */
	@ColumnType(length=255)
	@ColumnComment("发布时间")
	@TableField("publish_date")
    private LocalDateTime publishDate;

    /**
     * 下线时间
     */
	@ColumnType(length=255)
	@ColumnComment("下线时间")
	@TableField("offline_date")
    private LocalDateTime offlineDate;

    /**
     * 点赞数
     */
	@ColumnType(length=255)
	@ColumnComment("点赞数")
	@TableField("like_count")
    private Long likeCount;

    /**
     * 评论数
     */
	@ColumnType(length=255)
	@ColumnComment("评论数")
	@TableField("comment_count")
    private Long commentCount;

    /**
     * 收藏数
     */
	@ColumnType(length=255)
	@ColumnComment("收藏数")
	@TableField("favorite_count")
    private Long favoriteCount;

    /**
     * 文章浏览数
     */
	@ColumnType(length=255)
	@ColumnComment("文章浏览数")
	@TableField("view_count")
    private Long viewCount;

    /**
     * 是否锁定
     */
	@ColumnType(length=255)
	@ColumnComment("是否锁定")
	@TableField("is_lock")
    private String isLock;

    /**
     * 锁定用户名
     */
	@ColumnType(length=255)
	@ColumnComment("锁定用户名")
	@TableField("lock_user")
    private String lockUser;

    /**
     * SEO标题
     */
	@ColumnType(length=255)
	@ColumnComment("SEO标题")
	@TableField("seo_title")
    private String seoTitle;

    /**
     * SEO关键词
     */
	@ColumnType(length=255)
	@ColumnComment("SEO关键词")
	@TableField("seo_keywords")
    private String seoKeywords;

    /**
     * SEO描述
     */
	@ColumnType(length=255)
	@ColumnComment("SEO描述")
	@TableField("seo_description")
    private String seoDescription;

    /**
     * 发布通道
     */
    @TableField(exist = false)
	@ColumnType(length=255)
	@ColumnComment("发布通道")
    private String[] publishPipe;

    /**
     * 发布通道属性
     */
    @TableField(exist = false)
	@ColumnType(length=255)
	@ColumnComment("发布通道属性")
    private Map<String, Map<String, Object>> publishPipeProps;

    /**
     * 扩展属性
     */
    @TableField(exist = false)
	@ColumnType(length=255)
	@ColumnComment("扩展属性")
    private Map<String, Object> configProps;

    /**
     * 备用字段1
     */
	@ColumnType(length=255)
	@ColumnComment("备用字段1")
	@TableField("prop1")
    private String prop1;

    /**
     * 备用字段2
     */
	@ColumnType(length=255)
	@ColumnComment("备用字段2")
	@TableField("prop2")
    private String prop2;

    /**
     * 备用字段3
     */
	@ColumnType(length=255)
	@ColumnComment("备用字段3")
	@TableField("prop3")
    private String prop3;

    /**
     * 备用字段4
     */
	@ColumnType(length=255)
	@ColumnComment("备用字段4")
	@TableField("prop4")
    private String prop4;
}
