package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class MessageDataEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer userId;

	/**
	 * 群消息ID
	 */
	@TableField("group_message_id")
	@ColumnType(length=255)
	@ColumnComment("群消息ID")
	private Integer groupMessageId;
}
