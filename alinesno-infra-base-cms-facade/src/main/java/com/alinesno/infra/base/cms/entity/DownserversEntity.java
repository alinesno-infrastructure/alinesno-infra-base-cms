package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：downservers 表备注：
 *
 * 字段：
 * - sitename：站点名称
 * - siteurl：站点URL
 * - listorder：排序
 * - siteid：站点ID
 *
 * @TableName("downservers")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("downservers")
public class DownserversEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点名称
	 */
	@TableField("sitename")
	private String sitename;

	/**
	 * 站点URL
	 */
	@TableField("siteurl")
	private String siteurl;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	// Getters and Setters
	// ...
}
