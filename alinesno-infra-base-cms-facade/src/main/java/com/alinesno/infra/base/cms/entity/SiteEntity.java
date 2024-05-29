package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 站点实体类
 *
 * 数据表：site
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("site")
@Data
public class SiteEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("站点名称")
	private String name;

	/**
	 * 父级站点ID
	 */
	@TableField("parent_id")
	@ColumnType(length=255)
	@ColumnComment("父级站点ID")
	private Long parentId;

	/**
	 * 目录名称
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("目录名称")
	private String path;

	/**
	 * 域名
	 */
	@TableField("domain")
	@ColumnType(length=255)
	@ColumnComment("域名")
	private String domain;

	/**
	 * 站点标题
	 */
	@TableField("site_title")
	@ColumnType(length=255)
	@ColumnComment("站点标题")
	private String siteTitle;

	/**
	 * 关键字
	 */
	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("关键字")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 排序标识
	 */
	@TableField("sort_flag")
	@ColumnType(length=255)
	@ColumnComment("排序标识")
	private Long sortFlag;
}
