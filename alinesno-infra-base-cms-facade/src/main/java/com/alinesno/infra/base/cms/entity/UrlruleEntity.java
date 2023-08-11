package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： urlrule 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("urlrule")
public class UrlruleEntity extends InfraBaseEntity {
	// fields
	@TableField("urlruleid")
	private Integer urlruleid;

	@TableField("module")
	private String module;

	@TableField("file")
	private String file;

	@TableField("ishtml")
	private Integer ishtml;

	@TableField("urlrule")
	private String urlrule;

	@TableField("example")
	private String example;

	// getter and setter
	public Integer getUrlruleid() {
		return this.urlruleid;
	}

	public UrlruleEntity setUrlruleid(Integer arg) {
		this.urlruleid = arg;
		return this;
	}

	public String getModule() {
		return this.module;
	}

	public UrlruleEntity setModule(String arg) {
		this.module = arg;
		return this;
	}

	public String getFile() {
		return this.file;
	}

	public UrlruleEntity setFile(String arg) {
		this.file = arg;
		return this;
	}

	public Integer getIshtml() {
		return this.ishtml;
	}

	public UrlruleEntity setIshtml(Integer arg) {
		this.ishtml = arg;
		return this;
	}

	public String getUrlrule() {
		return this.urlrule;
	}

	public UrlruleEntity setUrlrule(String arg) {
		this.urlrule = arg;
		return this;
	}

	public String getExample() {
		return this.example;
	}

	public UrlruleEntity setExample(String arg) {
		this.example = arg;
		return this;
	}
}
