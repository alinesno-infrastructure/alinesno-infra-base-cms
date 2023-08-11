package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：sso_settings 表备注：
 *
 * SsoSettingsEntity类是对应数据库表sso_settings的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_settings")
public class SsoSettingsEntity extends InfraBaseEntity {

	// fields

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	private String name;

	/**
	 * 数据
	 */
	@Excel(name = "data")
	@TableField("data")
	private String data;

	// getter and setter methods

	public String getName() {
		return this.name;
	}

	public SsoSettingsEntity setName(String arg) {
		this.name = arg;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public SsoSettingsEntity setData(String arg) {
		this.data = arg;
		return this;
	}
}
