package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： wap 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("wap")
public class WapEntity extends InfraBaseEntity {

	// fields
	@TableField("siteid")
	private Integer siteid;

	@TableField("sitename")
	private String sitename;

	@TableField("logo")
	private String logo;

	@TableField("domain")
	private String domain;

	@TableField("setting")
	private String setting;

	@TableField("status")
	private Integer status;

	// getter and setter
	public Integer getSiteid() {
		return this.siteid;
	}

	public WapEntity setSiteid(Integer arg) {
		this.siteid = arg;
		return this;
	}

	public String getSitename() {
		return this.sitename;
	}

	public WapEntity setSitename(String arg) {
		this.sitename = arg;
		return this;
	}

	public String getLogo() {
		return this.logo;
	}

	public WapEntity setLogo(String arg) {
		this.logo = arg;
		return this;
	}

	public String getDomain() {
		return this.domain;
	}

	public WapEntity setDomain(String arg) {
		this.domain = arg;
		return this;
	}

	public String getSetting() {
		return this.setting;
	}

	public WapEntity setSetting(String arg) {
		this.setting = arg;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public WapEntity setStatus(Integer arg) {
		this.status = arg;
		return this;
	}
}
