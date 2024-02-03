package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class MessageGroupEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 类型ID
	 */
	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("类型ID")
	private Integer typeId;

	/**
	 * 用户组ID
	 */
	@TableField("groupid")
	@ColumnType(length=255)
	@ColumnComment("用户组ID")
	private Integer groupId;

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
	 * 输入时间
	 */
	@TableField("inputtime")
	@ColumnType(length=255)
	@ColumnComment("输入时间")
	private Integer inputTime;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("状态")
	private Integer status;
}
