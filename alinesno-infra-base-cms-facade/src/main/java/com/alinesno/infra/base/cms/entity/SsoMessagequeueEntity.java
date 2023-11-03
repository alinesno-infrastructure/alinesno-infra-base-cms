package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_messagequeue 表备注：
 *
 * SsoMessagequeueEntity类是对应数据库表sso_messagequeue的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_messagequeue")
@Data
public class SsoMessagequeueEntity extends InfraBaseEntity {

	// fields
	/**
	 * 操作
	 */
	@TableField("operation")
	@ColumnType(length=255)
	@ColumnComment("操作")
	private String operation;

	/**
	 * 成功
	 */
	@TableField("succeed")
	@ColumnType(length=255)
	@ColumnComment("成功")
	private Integer succeed;

	/**
	 * 总数
	 */
	@TableField("totalnum")
	@ColumnType(length=255)
	@ColumnComment("总数")
	private Integer totalnum;

	/**
	 * 通知数据
	 */
	@TableField("noticedata")
	@ColumnType(length=255)
	@ColumnComment("通知数据")
	private String noticedata;

	/**
	 * 时间戳
	 */
	@TableField("dateline")
	@ColumnType(length=255)
	@ColumnComment("时间戳")
	private Integer dateline;

	/**
	 * 应用状态
	 */
	@TableField("appstatus")
	@ColumnType(length=255)
	@ColumnComment("应用状态")
	private String appstatus;
}
