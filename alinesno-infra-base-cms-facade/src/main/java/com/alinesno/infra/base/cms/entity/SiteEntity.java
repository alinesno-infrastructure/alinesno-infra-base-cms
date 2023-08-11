package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 站点实体类
 *
 * 数据表：site
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("site")
public class SiteEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 目录名称
	 */
	@TableField("dirname")
	private String dirname;

	/**
	 * 域名
	 */
	@TableField("domain")
	private String domain;

	/**
	 * 站点标题
	 */
	@TableField("site_title")
	private String siteTitle;

	/**
	 * 关键字
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;


	// getter and setter methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirname() {
		return dirname;
	}

	public void setDirname(String dirname) {
		this.dirname = dirname;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
