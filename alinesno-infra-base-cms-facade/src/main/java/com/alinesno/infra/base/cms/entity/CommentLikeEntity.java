package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 数据表：comment_like 表备注：
 *
 * @TableName("comment_like")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("comment_like")
@Data
public class CommentLikeEntity extends InfraBaseEntity {

	/**
	 * 评论ID
	 */
	@TableField("comment_id")
	@ColumnType(length=255)
	@ColumnComment("评论ID")
	private String commentId;
	
	/**
	 * 点赞用户ID
	 */
	@TableField("uid")
	@ColumnType(length=255)
	@ColumnComment("点赞用户ID")
	private Long uid;
	
	/**
	 * 点赞时间
	 */
	@TableField("like_time")
	@ColumnType(length=255)
	@ColumnComment("点赞时间")
	private LocalDateTime likeTime;
}
