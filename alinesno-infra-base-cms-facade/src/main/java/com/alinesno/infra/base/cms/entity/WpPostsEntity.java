package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 文章信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_posts")
@Table(comment = "文章信息表，包括了日志、附件、页面等等信息")
public class WpPostsEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long id;

    // 文章类型
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("文章类型")
    private String type ;

    /**
     * 对应作者ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("对应作者ID")
    private Long postAuthor;

    /**
     * 发布时间
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("发布时间")
    private Date postDate;

    /**
     * 发布时间（GMT+0时间）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("发布时间（GMT+0时间）")
    private Date postDateGmt;

    /**
     * 正文
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.LONGTEXT)
    @ColumnComment("正文")
    private String postContent;

    /**
     * 标题
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("标题")
    private String postTitle;

    /**
     * 摘录
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("摘录")
    private String postExcerpt;

    /**
     * 文章状态（publish/auto-draft/inherit等）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("文章状态（publish/auto-draft/inherit等）")
    private String postStatus;

    /**
     * 评论状态（open/closed）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("评论状态（open/closed）")
    private String commentStatus;

    /**
     * PING状态（open/closed）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("PING状态（open/closed）")
    private String pingStatus;

    /**
     * 文章密码
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("文章密码")
    private String postPassword;

    /**
     * 文章缩略名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 200)
    @ColumnComment("文章缩略名")
    private String postName;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("未知")
    private String toPing;

    /**
     * 已经PING过的链接
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("已经PING过的链接")
    private String pinged;

    /**
     * 修改时间
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("修改时间")
    private Date postModified;

    /**
     * 修改时间（GMT+0时间）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("修改时间（GMT+0时间）")
    private Date postModifiedGmt;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.LONGTEXT)
    @ColumnComment("未知")
    private String postContentFiltered;

    /**
     * 父文章，主要用于PAGE
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("父文章，主要用于PAGE")
    private Long postParent;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("未知")
    private String guid;

    /**
     * 排序ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.INT, length = 11)
    @ColumnComment("排序ID")
    private Integer menuOrder;

    /**
     * 文章类型（post/page等）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("文章类型（post/page等）")
    private String postType;

    /**
     * MIME类型
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 100)
    @ColumnComment("MIME类型")
    private String postMimeType;

    /**
     * 评论总数
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("评论总数")
    private Long commentCount;

}