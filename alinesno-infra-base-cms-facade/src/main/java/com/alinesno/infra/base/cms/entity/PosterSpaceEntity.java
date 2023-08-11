package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：poster_space 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("poster_space")
public class PosterSpaceEntity extends InfraBaseEntity {

	// fields

	/**
	 * 空间ID
	 */
	@TableField("spaceid")
	private Integer spaceid;

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
	 * 类型
	 */
	@TableField("type")
	private String type;

	/**
	 * 路径
	 */
	@TableField("path")
	private String path;

	/**
	 * 宽度
	 */
	@TableField("width")
	private Integer width;

	/**
	 * 高度
	 */
	@TableField("height")
	private Integer height;

	/**
	 * 设置
	 */
	@TableField("setting")
	private String setting;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 项数
	 */
	@TableField("items")
	private Integer items;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	private Integer disabled;

	// getter and setter methods

	public Integer getSpaceid() {
		return this.spaceid;
	}

	public void setSpaceid(Integer spaceid) {
		this.spaceid = spaceid;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getSetting() {
		return this.setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getItems() {
		return this.items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	public Integer getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}
}
