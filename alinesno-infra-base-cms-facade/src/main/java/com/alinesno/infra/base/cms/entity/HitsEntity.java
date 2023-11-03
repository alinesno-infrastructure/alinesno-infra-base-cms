package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：hits 表备注：
 *
 * 字段：
 * - hitsid：点击ID
 * - catid：分类ID
 * - views：总点击量
 * - yesterdayviews：昨日点击量
 * - dayviews：今日点击量
 * - weekviews：本周点击量
 * - monthviews：本月点击量
 * - updatetime：更新时间
 *
 * @TableName("hits")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("hits")
@Data
public class HitsEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 点击ID
	 */
	@TableField("hitsid")
	@ColumnType(length=255)
	@ColumnComment("点击ID")
	private String hitsid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("分类ID")
	private Integer catid;

	/**
	 * 总点击量
	 */
	@TableField("views")
	@ColumnType(length=255)
	@ColumnComment("总点击量")
	private Integer views;

	/**
	 * 昨日点击量
	 */
	@TableField("yesterdayviews")
	@ColumnType(length=255)
	@ColumnComment("昨日点击量")
	private Integer yesterdayviews;

	/**
	 * 今日点击量
	 */
	@TableField("dayviews")
	@ColumnType(length=255)
	@ColumnComment("今日点击量")
	private Integer dayviews;

	/**
	 * 本周点击量
	 */
	@TableField("weekviews")
	@ColumnType(length=255)
	@ColumnComment("本周点击量")
	private Integer weekviews;

	/**
	 * 本月点击量
	 */
	@TableField("monthviews")
	@ColumnType(length=255)
	@ColumnComment("本月点击量")
	private Integer monthviews;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	@ColumnType(length=255)
	@ColumnComment("更新时间")
	private Integer updatetime;
}
