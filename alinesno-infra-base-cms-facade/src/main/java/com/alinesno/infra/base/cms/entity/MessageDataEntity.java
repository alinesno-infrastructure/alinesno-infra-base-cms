package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：message_data 表备注：
 * 消息数据实体类
 *
 * @TableName("message_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("message_data")
public class MessageDataEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userId;

	/**
	 * 群消息ID
	 */
	@TableField("group_message_id")
	private Integer groupMessageId;

	// getter and setter
	public Integer getUserId() {
		return this.userId;
	}

	public MessageDataEntity setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public Integer getGroupMessageId() {
		return this.groupMessageId;
	}

	public MessageDataEntity setGroupMessageId(Integer groupMessageId) {
		this.groupMessageId = groupMessageId;
		return this;
	}
}
