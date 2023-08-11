package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：cache 表备注：
 * 缓存实体类
 *
 * @TableName("cache")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("cache")
public class CacheEntity extends InfraBaseEntity {

	// fields

	/**
	 * 文件名
	 */
	@TableField("filename")
	private String filename;

	/**
	 * 路径
	 */
	@TableField("path")
	private String path;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	// getter and setter methods

	public String getFilename() {
		return this.filename;
	}

	public CacheEntity setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	public String getPath() {
		return this.path;
	}

	public CacheEntity setPath(String path) {
		this.path = path;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public CacheEntity setData(String data) {
		this.data = data;
		return this;
	}
}
