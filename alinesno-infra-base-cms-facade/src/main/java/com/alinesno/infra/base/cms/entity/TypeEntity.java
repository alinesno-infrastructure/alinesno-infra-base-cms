package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： type 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 *
 */
@TableName("type")
public class TypeEntity extends InfraBaseEntity  {

	// fields
	@TableField("module")
	private String module;

	@TableField("modelid")
	private Integer modelid;

	@TableField("name")
	private String name;

	@TableField("parentid")
	private Integer parentid;

	@TableField("typedir")
	private String typedir;

	@TableField("url")
	private String url;

	@TableField("template")
	private String template;

	@TableField("listorder")
	private Integer listorder;

	@TableField("description")
	private String description;

	@TableField("category_id")
	private String categoryId;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getModule() {
		return this.module;
	}

	public TypeEntity setModule(String arg) {
		this.module = arg;
		return this;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public TypeEntity setModelid(Integer arg) {
		this.modelid = arg;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public TypeEntity setName(String arg) {
		this.name = arg;
		return this;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public TypeEntity setParentid(Integer arg) {
		this.parentid = arg;
		return this;
	}

	public String getTypedir() {
		return this.typedir;
	}

	public TypeEntity setTypedir(String arg) {
		this.typedir = arg;
		return this;
	}

	public String getUrl() {
		return this.url;
	}

	public TypeEntity setUrl(String arg) {
		this.url = arg;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public TypeEntity setTemplate(String arg) {
		this.template = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public TypeEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public TypeEntity setDescription(String arg) {
		this.description = arg;
		return this;
	}
}
