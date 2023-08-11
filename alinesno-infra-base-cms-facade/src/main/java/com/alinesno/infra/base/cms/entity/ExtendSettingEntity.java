package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：extend_setting 表备注：
 *
 * 字段：
 * - key：键
 * - data：数据
 *
 * @TableName("extend_setting")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("extend_setting")
public class ExtendSettingEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 键
	 */
	@TableField("key")
	private String key;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	// Getters and Setters

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
