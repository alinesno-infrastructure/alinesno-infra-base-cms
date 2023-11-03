package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：message 表备注：
 * 消息实体类
 *
 * @TableName("message")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("message")
@Data
public class MessageEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 消息ID
	 */
	@TableField("messageid")
	@ColumnType(length=255)
	@ColumnComment("消息ID")
	private Integer messageId;

	/**
	 * 发送者ID
	 */
	@TableField("send_from_id")
	@ColumnType(length=255)
	@ColumnComment("发送者ID")
	private String sendFromId;

	/**
	 * 接收者ID
	 */
	@TableField("send_to_id")
	@ColumnType(length=255)
	@ColumnComment("接收者ID")
	private String sendToId;

	/**
	 * 文件夹
	 */
	@TableField("folder")
	@ColumnType(length=255)
	@ColumnComment("文件夹")
	private String folder;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("状态")
	private Integer status;

	/**
	 * 消息时间
	 */
	@TableField("message_time")
	@ColumnType(length=255)
	@ColumnComment("消息时间")
	private Integer messageTime;

	/**
	 * 主题
	 */
	@TableField("subject")
	@ColumnType(length=255)
	@ColumnComment("主题")
	private String subject;

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 回复ID
	 */
	@TableField("replyid")
	@ColumnType(length=255)
	@ColumnComment("回复ID")
	private Integer replyId;

	/**
	 * 删除类型
	 */
	@TableField("del_type")
	@ColumnType(length=255)
	@ColumnComment("删除类型")
	private Integer delType;
}
