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
 * 文章评论信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_comments")
@Table(comment = "文章评论信息表")
public class WpCommentsEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long commentId;

    /**
     * 对应文章ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("对应文章ID")
    private Long commentPostId;

    /**
     * 评论者
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("评论者")
    private String commentAuthor;

    /**
     * 评论者邮箱
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 100)
    @ColumnComment("评论者邮箱")
    private String commentAuthorEmail;

    /**
     * 评论者网址
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 200)
    @ColumnComment("评论者网址")
    private String commentAuthorUrl;

    /**
     * 评论者IP
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 100)
    @ColumnComment("评论者IP")
    private String commentAuthorIp;

    /**
     * 评论时间
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("评论时间")
    private Date commentDate;

    /**
     * 评论时间（GMT+0时间）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("评论时间（GMT+0时间）")
    private Date commentDateGmt;

    /**
     * 评论正文
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("评论正文")
    private String commentContent;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.INT, length = 11)
    @ColumnComment("未知")
    private Integer commentKarma;

    /**
     * 评论是否被批准
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("评论是否被批准")
    private String commentApproved;

    /**
     * 评论者的USER AGENT
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("评论者的USER AGENT")
    private String commentAgent;

    /**
     * 评论类型
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 20)
    @ColumnComment("评论类型")
    private String commentType;

    /**
     * 父评论ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("父评论ID")
    private Long commentParent;

    /**
     * 评论者用户ID（不一定存在）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("评论者用户ID（不一定存在）")
    private Long userId;

}