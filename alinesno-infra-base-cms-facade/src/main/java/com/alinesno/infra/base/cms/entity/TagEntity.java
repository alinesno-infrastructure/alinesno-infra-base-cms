package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：tag 表备注：
 *
 * TagEntity类是对应数据库表tag的实体类，用于表示标签信息。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("tag")
@Data
public class TagEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 标签
	 */
	@Excel(name = "tag")
	@TableField("tag")
	@ColumnType(length=255)
	@ColumnComment("标签")
	private String tag;

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 类型
	 */
	@Excel(name = "type")
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private Integer type;

	/**
	 * 模块
	 */
	@Excel(name = "module")
	@TableField("module")
	@ColumnType(length=255)
	@ColumnComment("模块")
	private String module;

	/**
	 * 动作
	 */
	@Excel(name = "action")
	@TableField("action")
	@ColumnType(length=255)
	@ColumnComment("动作")
	private String action;

	/**
	 * 数据
	 */
	@Excel(name = "data")
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 页面
	 */
	@Excel(name = "page")
	@TableField("page")
	@ColumnType(length=255)
	@ColumnComment("页面")
	private String page;

	/**
	 * 缓存
	 */
	@Excel(name = "cache")
	@TableField("cache")
	@ColumnType(length=255)
	@ColumnComment("缓存")
	private Integer cache;

	/**
	 * 数量
	 */
	@Excel(name = "num")
	@TableField("num")
	@ColumnType(length=255)
	@ColumnComment("数量")
	private Integer num;
}
