package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：poster
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("poster")
public class PosterEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 空间ID
	 */
	@TableField("spaceid")
	private Integer spaceid;

	/**
	 * 类型
	 */
	@TableField("type")
	private String type;

	/**
	 * 设置
	 */
	@TableField("setting")
	private String setting;

	/**
	 * 开始日期
	 */
	@TableField("startdate")
	private Integer startdate;

	/**
	 * 结束日期
	 */
	@TableField("enddate")
	private Integer enddate;

	/**
	 * 添加时间
	 */
	@TableField("addtime")
	private Integer addtime;

	/**
	 * 点击数
	 */
	@TableField("hits")
	private Integer hits;

	/**
	 * 点击次数
	 */
	@TableField("clicks")
	private Integer clicks;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	private Integer disabled;

	// getter and setter methods

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpaceid() {
		return spaceid;
	}

	public void setSpaceid(Integer spaceid) {
		this.spaceid = spaceid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public Integer getStartdate() {
		return startdate;
	}

	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	public Integer getEnddate() {
		return enddate;
	}

	public void setEnddate(Integer enddate) {
		this.enddate = enddate;
	}

	public Integer getAddtime() {
		return addtime;
	}

	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}
}
