package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： urlrule 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("urlrule")
@Data
public class UrlruleEntity extends InfraBaseEntity {
	// fields
	@TableField("urlruleid")
	@ColumnType(length=255)
	@ColumnComment("urlruleid")
	private Integer urlruleid;

	@TableField("module")
	@ColumnType(length=255)
	@ColumnComment("module")
	private String module;

	@TableField("file")
	@ColumnType(length=255)
	@ColumnComment("file")
	private String file;

	@TableField("ishtml")
	@ColumnType(length=255)
	@ColumnComment("ishtml")
	private Integer ishtml;

	@TableField("urlrule")
	@ColumnType(length=255)
	@ColumnComment("urlrule")
	private String urlrule;

	@TableField("example")
	@ColumnType(length=255)
	@ColumnComment("example")
	private String example;
}
