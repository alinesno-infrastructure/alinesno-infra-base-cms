package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：poster
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("poster")
@Data
public class PosterEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 空间ID
	 */
	@TableField("spaceid")
	@ColumnType(length=255)
	@ColumnComment("空间ID")
	private Integer spaceid;

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private String type;

	/**
	 * 设置
	 */
	@TableField("setting")
	@ColumnType(length=255)
	@ColumnComment("设置")
	private String setting;

	/**
	 * 开始日期
	 */
	@TableField("startdate")
	@ColumnType(length=255)
	@ColumnComment("开始日期")
	private Integer startdate;

	/**
	 * 结束日期
	 */
	@TableField("enddate")
	@ColumnType(length=255)
	@ColumnComment("结束日期")
	private Integer enddate;

	/**
	 * 添加时间
	 */
	@TableField("addtime")
	@ColumnType(length=255)
	@ColumnComment("添加时间")
	private Integer addtime;

	/**
	 * 点击数
	 */
	@TableField("hits")
	@ColumnType(length=255)
	@ColumnComment("点击数")
	private Integer hits;

	/**
	 * 点击次数
	 */
	@TableField("clicks")
	@ColumnType(length=255)
	@ColumnComment("点击次数")
	private Integer clicks;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	@ColumnType(length=255)
	@ColumnComment("是否禁用")
	private Integer disabled;
}
