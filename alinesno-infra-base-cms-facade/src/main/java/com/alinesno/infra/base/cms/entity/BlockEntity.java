package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：block 表备注：
 * 区块实体类
 *
 * @TableName("block")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("block")
public class BlockEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length = 255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 位置
	 */
	@TableField("pos")
	@ColumnType(length = 255)
	@ColumnComment("位置")
	private String pos;

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType
	@ColumnComment("类型")
	private Integer type;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length = 255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 模板
	 */
	@TableField("template")
	@ColumnType(length = 255)
	@ColumnComment("模板")
	private String template;
}
