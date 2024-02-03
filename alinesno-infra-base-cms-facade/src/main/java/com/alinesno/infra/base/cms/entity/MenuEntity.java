package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：menu 表备注：
 * 菜单实体类
 *
 * @TableName("menu")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("menu")
@Data
public class MenuEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 菜单名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("菜单名称")
	private String name;

	/**
	 * 父菜单ID
	 */
	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("父菜单ID")
	private Integer parentId;

	/**
	 * 模块名
	 */
	@TableField("m")
	@ColumnType(length=255)
	@ColumnComment("模块名")
	private String m;

	/**
	 * 控制器名
	 */
	@TableField("c")
	@ColumnType(length=255)
	@ColumnComment("控制器名")
	private String c;

	/**
	 * 方法名
	 */
	@TableField("a")
	@ColumnType(length=255)
	@ColumnComment("方法名")
	private String a;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listOrder;

	/**
	 * 是否显示（0：不显示；1：显示）
	 */
	@TableField("display")
	@ColumnType(length=255)
	@ColumnComment("是否显示（0：不显示；1：显示）")
	private String display;

	/**
	 * 项目1
	 */
	@TableField("project1")
	@ColumnType(length=255)
	@ColumnComment("项目1")
	private Integer project1;

	/**
	 * 项目2
	 */
	@TableField("project2")
	@ColumnType(length=255)
	@ColumnComment("项目2")
	private Integer project2;

	/**
	 * 项目3
	 */
	@TableField("project3")
	@ColumnType(length=255)
	@ColumnComment("项目3")
	private Integer project3;

	/**
	 * 项目4
	 */
	@TableField("project4")
	@ColumnType(length=255)
	@ColumnComment("项目4")
	private Integer project4;

	/**
	 * 项目5
	 */
	@TableField("project5")
	@ColumnType(length=255)
	@ColumnComment("项目5")
	private Integer project5;
}
