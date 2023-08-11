package com.alinesno.infra.base.cms.entity;

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
public class MessageEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 消息ID
	 */
	@TableField("messageid")
	private Integer messageId;

	/**
	 * 发送者ID
	 */
	@TableField("send_from_id")
	private String sendFromId;

	/**
	 * 接收者ID
	 */
	@TableField("send_to_id")
	private String sendToId;

	/**
	 * 文件夹
	 */
	@TableField("folder")
	private String folder;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 消息时间
	 */
	@TableField("message_time")
	private Integer messageTime;

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
	 * 回复ID
	 */
	@TableField("replyid")
	private Integer replyId;

	/**
	 * 删除类型
	 */
	@TableField("del_type")
	private Integer delType;

	// getter and setter
	public Integer getMessageId() {
		return this.messageId;
	}

	public MessageEntity setMessageId(Integer messageId) {
		this.messageId = messageId;
		return this;
	}

	public String getSendFromId() {
		return this.sendFromId;
	}

	public MessageEntity setSendFromId(String sendFromId) {
		this.sendFromId = sendFromId;
		return this;
	}

	public String getSendToId() {
		return this.sendToId;
	}

	public MessageEntity setSendToId(String sendToId) {
		this.sendToId = sendToId;
		return this;
	}

	public String getFolder() {
		return this.folder;
	}

	public MessageEntity setFolder(String folder) {
		this.folder = folder;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public MessageEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Integer getMessageTime() {
		return this.messageTime;
	}

	public MessageEntity setMessageTime(Integer messageTime) {
		this.messageTime = messageTime;
		return this;
	}

	public String getSubject() {
		return this.subject;
	}

	public MessageEntity setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getContent() {
		return this.content;
	}

	public MessageEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getReplyId() {
		return this.replyId;
	}

	public MessageEntity setReplyId(Integer replyId) {
		this.replyId = replyId;
		return this;
	}

	public Integer getDelType() {
		return this.delType;
	}

	public MessageEntity setDelType(Integer delType) {
		this.delType = delType;
		return this;
	}
}
