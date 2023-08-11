package com.alinesno.infra.base.cms.entity;

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
public class HitsEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 点击ID
	 */
	@TableField("hitsid")
	private String hitsid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 总点击量
	 */
	@TableField("views")
	private Integer views;

	/**
	 * 昨日点击量
	 */
	@TableField("yesterdayviews")
	private Integer yesterdayviews;

	/**
	 * 今日点击量
	 */
	@TableField("dayviews")
	private Integer dayviews;

	/**
	 * 本周点击量
	 */
	@TableField("weekviews")
	private Integer weekviews;

	/**
	 * 本月点击量
	 */
	@TableField("monthviews")
	private Integer monthviews;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	private Integer updatetime;

	// Getters and Setters

	public String getHitsid() {
		return this.hitsid;
	}

	public void setHitsid(String hitsid) {
		this.hitsid = hitsid;
	}

	public Integer getCatid() {
		return this.catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getYesterdayviews() {
		return this.yesterdayviews;
	}

	public void setYesterdayviews(Integer yesterdayviews) {
		this.yesterdayviews = yesterdayviews;
	}

	public Integer getDayviews() {
		return this.dayviews;
	}

	public void setDayviews(Integer dayviews) {
		this.dayviews = dayviews;
	}

	public Integer getWeekviews() {
		return this.weekviews;
	}

	public void setWeekviews(Integer weekviews) {
		this.weekviews = weekviews;
	}

	public Integer getMonthviews() {
		return this.monthviews;
	}

	public void setMonthviews(Integer monthviews) {
		this.monthviews = monthviews;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
	}
}
