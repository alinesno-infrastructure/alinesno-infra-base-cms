package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：poster_space 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("poster_space")
@Data
public class PosterSpaceEntity extends InfraBaseEntity {

	// fields

	/**
	 * 空间ID
	 */
	@TableField("spaceid")
	@ColumnType(length=255)
	@ColumnComment("空间ID")
	private Integer spaceid;

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
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private String type;

	/**
	 * 路径
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("路径")
	private String path;

	/**
	 * 宽度
	 */
	@TableField("width")
	@ColumnType(length=255)
	@ColumnComment("宽度")
	private Integer width;

	/**
	 * 高度
	 */
	@TableField("height")
	@ColumnType(length=255)
	@ColumnComment("高度")
	private Integer height;

	/**
	 * 设置
	 */
	@TableField("setting")
	@ColumnType(length=255)
	@ColumnComment("设置")
	private String setting;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 项数
	 */
	@TableField("items")
	@ColumnType(length=255)
	@ColumnComment("项数")
	private Integer items;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	@ColumnType(length=255)
	@ColumnComment("是否禁用")
	private Integer disabled;
}
