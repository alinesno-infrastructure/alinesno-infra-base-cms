package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： wap 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("wap")
@Data
public class WapEntity extends InfraBaseEntity {

	// fields
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("siteid")
	private Integer siteid;

	@TableField("sitename")
	@ColumnType(length=255)
	@ColumnComment("sitename")
	private String sitename;

	@TableField("logo")
	@ColumnType(length=255)
	@ColumnComment("logo")
	private String logo;

	@TableField("domain")
	@ColumnType(length=255)
	@ColumnComment("domain")
	private String domain;

	@TableField("setting")
	@ColumnType(length=255)
	@ColumnComment("setting")
	private String setting;

	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("status")
	private Integer status;
}
