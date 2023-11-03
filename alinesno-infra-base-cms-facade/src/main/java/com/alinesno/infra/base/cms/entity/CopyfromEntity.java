package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：copyfrom 表备注：
 *
 * 字段：
 * - siteid：站点ID
 * - sitename：站点名称
 * - siteurl：站点URL
 * - thumb：缩略图
 * - listorder：排序
 *
 * @TableName("copyfrom")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("copyfrom")
@Data
public class CopyfromEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 站点名称
	 */
	@TableField("sitename")
	@ColumnType(length=50)
	@ColumnComment("站点名称")
	private String sitename;

	/**
	 * 站点URL
	 */
	@TableField("siteurl")
	@ColumnType(length=255)
	@ColumnComment("站点URL")
	private String siteurl;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	@ColumnType(length=255)
	@ColumnComment("缩略图")
	private String thumb;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=10)
	@ColumnComment("排序")
	private Integer listorder;
}
