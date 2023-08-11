package com.alinesno.infra.base.cms.entity;

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
public class CopyfromEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

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
	 * 缩略图
	 */
	@TableField("thumb")
	private String thumb;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	// Getter and Setter methods

	public Integer getSiteid() {
		return this.siteid;
	}

	public CopyfromEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public String getSitename() {
		return this.sitename;
	}

	public CopyfromEntity setSitename(String sitename) {
		this.sitename = sitename;
		return this;
	}

	public String getSiteurl() {
		return this.siteurl;
	}

	public CopyfromEntity setSiteurl(String siteurl) {
		this.siteurl = siteurl;
		return this;
	}

	public String getThumb() {
		return this.thumb;
	}

	public CopyfromEntity setThumb(String thumb) {
		this.thumb = thumb;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public CopyfromEntity setListorder(Integer listorder) {
		this.listorder = listorder;
		return this;
	}
}
