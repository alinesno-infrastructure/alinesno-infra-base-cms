package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： times 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("times")
public class TimesEntity extends InfraBaseEntity {
	
	// fields
	@TableField("username")
	private String username;

	@TableField("ip")
	private String ip;

	@TableField("logintime")
	private Integer logintime;

	@TableField("isadmin")
	private Integer isadmin;

	@TableField("times")
	private Integer times;

	// getter and setter
	public String getUsername() {
		return this.username;
	}

	public TimesEntity setUsername(String arg) {
		this.username = arg;
		return this;
	}

	public String getIp() {
		return this.ip;
	}

	public TimesEntity setIp(String arg) {
		this.ip = arg;
		return this;
	}

	public Integer getLogintime() {
		return this.logintime;
	}

	public TimesEntity setLogintime(Integer arg) {
		this.logintime = arg;
		return this;
	}

	public Integer getIsadmin() {
		return this.isadmin;
	}

	public TimesEntity setIsadmin(Integer arg) {
		this.isadmin = arg;
		return this;
	}

	public Integer getTimes() {
		return this.times;
	}

	public TimesEntity setTimes(Integer arg) {
		this.times = arg;
		return this;
	}
}
