package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：comment_setting 表备注：
 *
 * 字段：
 * - siteid：站点ID
 * - guest：是否允许游客评论
 * - check：是否需要审核
 * - code：是否开启验证码
 * - addPoint：添加的积分数
 * - delPoint：扣除的积分数
 *
 * @TableName("comment_setting")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("comment_setting")
@Data
public class CommentSettingEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 是否允许游客评论
	 */
	@TableField("guest")
	@ColumnType(length=255)
	@ColumnComment("是否允许游客评论")
	private Integer guest;

	/**
	 * 是否需要审核
	 */
	@TableField("check")
	@ColumnType(length=255)
	@ColumnComment("是否需要审核")
	private Integer check;

	/**
	 * 是否开启验证码
	 */
	@TableField("code")
	@ColumnType(length=255)
	@ColumnComment("是否开启验证码")
	private Integer code;

	/**
	 * 添加的积分数
	 */
	@TableField("add_point")
	@ColumnType(length=255)
	@ColumnComment("添加的积分数")
	private Integer addPoint;

	/**
	 * 扣除的积分数
	 */
	@TableField("del_point")
	@ColumnType(length=255)
	@ColumnComment("扣除的积分数")
	private Integer delPoint;
}
