package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：collection_content 表备注：
 * 集合内容实体类
 *
 * @TableName("collection_content")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_content")
@Data
public class CollectionContentEntity extends InfraBaseEntity {


	// fields

	/**
	 * nodeid
	 */
	@TableField("nodeid")
	private Integer nodeid;

	/**
	 * siteid
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * status
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("地位")
	private Integer status;

	/**
	 * url
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("url")
	private String url;

	/**
	 * title
	 */
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("标题")
	private String title;

	/**
	 * data
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;
}
