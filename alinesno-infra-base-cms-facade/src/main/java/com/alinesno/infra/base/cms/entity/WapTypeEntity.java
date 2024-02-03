package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表： wap_type 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("wap_type")
@Data
public class WapTypeEntity extends InfraBaseEntity {

	// fields
	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("typeid")
	private Integer typeid;

	@TableField("cat")
	@ColumnType(length=255)
	@ColumnComment("cat")
	private Integer cat;

	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("parentid")
	private Integer parentid;

	@TableField("typename")
	@ColumnType(length=255)
	@ColumnComment("typename")
	private String typename;

	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("siteid")
	private Integer siteid;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;
}
