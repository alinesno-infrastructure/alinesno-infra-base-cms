package com.alinesno.infra.base.cms.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：tag 表备注：
 *
 * TagEntity类是对应数据库表tag的实体类，用于表示标签信息。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("tag")
public class TagEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 标签
	 */
	@Excel(name = "tag")
	@TableField("tag")
	private String tag;

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	private String name;

	/**
	 * 类型
	 */
	@Excel(name = "type")
	@TableField("type")
	private Integer type;

	/**
	 * 模块
	 */
	@Excel(name = "module")
	@TableField("module")
	private String module;

	/**
	 * 动作
	 */
	@Excel(name = "action")
	@TableField("action")
	private String action;

	/**
	 * 数据
	 */
	@Excel(name = "data")
	@TableField("data")
	private String data;

	/**
	 * 页面
	 */
	@Excel(name = "page")
	@TableField("page")
	private String page;

	/**
	 * 缓存
	 */
	@Excel(name = "cache")
	@TableField("cache")
	private Integer cache;

	/**
	 * 数量
	 */
	@Excel(name = "num")
	@TableField("num")
	private Integer num;

	// getter and setter methods

	// ...
}
