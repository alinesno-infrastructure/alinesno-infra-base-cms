package com.alinesno.infra.base.cms.entity;

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
public class CommentSettingEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 是否允许游客评论
	 */
	@TableField("guest")
	private Integer guest;

	/**
	 * 是否需要审核
	 */
	@TableField("check")
	private Integer check;

	/**
	 * 是否开启验证码
	 */
	@TableField("code")
	private Integer code;

	/**
	 * 添加的积分数
	 */
	@TableField("add_point")
	private Integer addPoint;

	/**
	 * 扣除的积分数
	 */
	@TableField("del_point")
	private Integer delPoint;

	// Getter and Setter methods

	public Integer getSiteid() {
		return this.siteid;
	}

	public CommentSettingEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public Integer getGuest() {
		return this.guest;
	}

	public CommentSettingEntity setGuest(Integer guest) {
		this.guest = guest;
		return this;
	}

	public Integer getCheck() {
		return this.check;
	}

	public CommentSettingEntity setCheck(Integer check) {
		this.check = check;
		return this;
	}

	public Integer getCode() {
		return this.code;
	}

	public CommentSettingEntity setCode(Integer code) {
		this.code = code;
		return this;
	}

	public Integer getAddPoint() {
		return this.addPoint;
	}

	public CommentSettingEntity setAddPoint(Integer addPoint) {
		this.addPoint = addPoint;
		return this;
	}

	public Integer getDelPoint() {
		return this.delPoint;
	}

	public CommentSettingEntity setDelPoint(Integer delPoint) {
		this.delPoint = delPoint;
		return this;
	}
}
