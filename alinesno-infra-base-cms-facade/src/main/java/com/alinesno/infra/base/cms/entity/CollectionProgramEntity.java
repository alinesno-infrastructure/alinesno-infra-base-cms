package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：collection_program 表备注：
 *
 * Fields:
 * - siteid: 站点ID
 * - nodeid: 节点ID
 * - modelid: 模型ID
 * - catid: 分类ID
 * - config: 配置
 *
 * @TableName("collection_program")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_program")
@Data
public class CollectionProgramEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 节点ID
	 */
	@TableField("nodeid")
	@ColumnType(length=10)
	@ColumnComment("nodeid")
	private Integer nodeid;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	@ColumnType(length=10)
	@ColumnComment("模型ID")
	private Integer modelid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("catid")
	private Integer catid;

	/**
	 * 配置
	 */
	@TableField("config")
	@ColumnType(length=255)
	@ColumnComment("配置")
	private String config;
}
