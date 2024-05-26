package com.alinesno.infra.base.cms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据表：comment 表备注：
 *
 * 字段：
 * - commentid：评论ID
 * - siteid：站点ID
 * - title：标题
 * - url：URL
 * - total：总数
 * - square：正方数
 * - anti：反方数
 * - neutral：中立数
 * - displayType：显示类型
 * - tableid：表格ID
 * - lastupdate：最后更新时间
 *
 * @TableName("comment")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("comment")
@Data
public class CommentEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 评论ID
	 */
	@TableField("comment_id")
	@ColumnType(length=255)
	@ColumnComment("评论ID")
	private String commentId;

	/**
	 * 站点ID
	 */
	@TableField("site_id")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteId;

	/**
	 * 评论用户ID
	 */
	@TableField("uid")
	@ColumnType(length=255)
	@ColumnComment("评论用户ID")
	private Long uid;

	/**
	 * 父级评论ID，存在parentId表示这是一条回复
	 */
	@TableField("parent_id")
	@ColumnType(length=255)
	@ColumnComment("父级评论ID")
	private Long parentId;

	/**
	 * 如果是回复类型，且回复的也是回复类型评论，则需要设置回复的用户ID
	 */
	@TableField("reply_uid")
	@ColumnType(length=255)
	@ColumnComment("如果是回复类型，且回复的也是回复类型评论，则需要设置回复的用户ID")
	private Long replyUid;

	/**
	 * 回复数
	 */
	@TableField("reply_count")
	@ColumnType(length=255)
	@ColumnComment("回复数")
	private int replyCount;

	/**
	 * 来源分类，例如：cms:site_id
	 */
	@TableField("source_type")
	@ColumnType(length=255)
	@ColumnComment("来源分类")
	private String sourceType;

	/**
	 * 来源唯一标识
	 */
	@TableField("source_id")
	@ColumnType(length=255)
	@ColumnComment("来源唯一标识")
	private String sourceId;

	@TableField(exist = false)
	private String sourceTitle;

	@TableField(exist = false)
	private String sourceUrl;

	/**
	 * 评论内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("评论内容")
	private String content;

	/**
	 * 点赞数
	 */
	@TableField("like_count")
	@ColumnType(length=255)
	@ColumnComment("点赞数")
	private Integer likeCount;

	/**
	 * 评论审核状态（0=未审核，1=审核通过，2=审核未通过）
	 */
	@TableField("audit_status")
	@ColumnType(length=255)
	@ColumnComment("评论审核状态（0=未审核，1=审核通过，2=审核未通过）")
	private Integer auditStatus;

	/**
	 * IP
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("IP")
	private String ip;

	/**
	 * 属地
	 */
	@TableField("location")
	@ColumnType(length=255)
	@ColumnComment("属地")
	private String location;

	/**
	 * 客户端类型
	 */
	@TableField("client_type")
	@ColumnType(length=255)
	@ColumnComment("客户端类型")
	private String clientType;

	/**
	 * UA
	 */
	@TableField("user_agent")
	@ColumnType(length=255)
	@ColumnComment("UA")
	@JsonIgnore
	private String userAgent;

	/**
	 * 回复列表
	 */
	@TableField(exist = false)
	private List<CommentEntity> replyList;

	/**
	 * 最后更新时间
	 */
	@TableField("last_update")
	@ColumnType(length=255)
	@ColumnComment("最后更新时间")
	private Integer lastUpdate;
}
