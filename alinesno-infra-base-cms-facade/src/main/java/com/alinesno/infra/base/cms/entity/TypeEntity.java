package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： type 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 *
 */
@TableName("type")
@Data
public class TypeEntity extends InfraBaseEntity  {

	// fields
	@TableField("module")
	@ColumnType(length=255)
	@ColumnComment("module")
	private String module;

	@TableField("modelid")
	@ColumnType(length=255)
	@ColumnComment("modelid")
	private Integer modelid;

	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("name")
	private String name;

	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("parentid")
	private Integer parentid;

	@TableField("typedir")
	@ColumnType(length=255)
	@ColumnComment("typedir")
	private String typedir;

	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("url")
	private String url;

	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("template")
	private String template;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;

	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("description")
	private String description;

	@TableField("category_id")
	@ColumnType(length=255)
	@ColumnComment("category_id")
	private String categoryId;
}
