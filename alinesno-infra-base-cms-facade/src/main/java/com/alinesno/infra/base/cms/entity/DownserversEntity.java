package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@TableName("downservers")
@Data
public class DownserversEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点名称
	 */
	@TableField("sitename")
	@ColumnType(length=255)
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
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;
}
