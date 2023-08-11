package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：message_group 表备注：
 * 消息组实体类
 *
 * @TableName("message_group")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("message_group")
public class MessageGroupEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 类型ID
	 */
	@TableField("typeid")
	private Integer typeId;

	/**
	 * 用户组ID
	 */
	@TableField("groupid")
	private Integer groupId;

	/**
	 * 主题
	 */
	@TableField("subject")
	private String subject;

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 输入时间
	 */
	@TableField("inputtime")
	private Integer inputTime;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	// getter and setter
	public Integer getTypeId() {
		return this.typeId;
	}

	public MessageGroupEntity setTypeId(Integer typeId) {
		this.typeId = typeId;
		return this;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public MessageGroupEntity setGroupId(Integer groupId) {
		this.groupId = groupId;
		return this;
	}

	public String getSubject() {
		return this.subject;
	}

	public MessageGroupEntity setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getContent() {
		return this.content;
	}

	public MessageGroupEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getInputTime() {
		return this.inputTime;
	}

	public MessageGroupEntity setInputTime(Integer inputTime) {
		this.inputTime = inputTime;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public MessageGroupEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}
}
