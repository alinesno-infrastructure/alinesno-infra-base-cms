package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：datacall 表备注：
 *
 * 字段：
 * - name：名称
 * - disType：显示类型
 * - type：类型
 * - module：模块
 * - action：动作
 * - data：数据
 * - template：模板
 * - cache：缓存
 * - num：数量
 *
 * @TableName("datacall")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("datacall")
@Data
public class DatacallEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 显示类型
	 */
	@TableField("dis_type")
	@ColumnType(length=10)
	@ColumnComment("显示类型")
	private Integer disType;

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private Integer type;

	/**
	 * 模块
	 */
	@TableField("module")
	@ColumnType(length=255)
	@ColumnComment("模块")
	private String module;

	/**
	 * 动作
	 */
	@TableField("action")
	@ColumnType(length=255)
	@ColumnComment("动作")
	private String action;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 模板
	 */
	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("模板")
	private String template;

	/**
	 * 缓存
	 */
	@TableField("cache")
	@ColumnType(length=255)
	@ColumnComment("缓存")
	private Integer cache;

	/**
	 * 数量
	 */
	@TableField("num")
	@ColumnType(length=255)
	@ColumnComment("数量")
	private Integer num;
}
