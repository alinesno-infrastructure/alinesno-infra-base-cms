package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：collection_program 表备注：
 *
 * Fields:
 * - siteid: 站点ID
 * - nodeid: 节点ID
 * - modelid: 模型ID
 * - catid: 分类ID
 * - config: 配置
 *
 * @TableName("collection_program")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_program")
public class CollectionProgramEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 节点ID
	 */
	@TableField("nodeid")
	private Integer nodeid;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	private Integer modelid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 配置
	 */
	@TableField("config")
	private String config;

	// Getter and Setter methods

	public Integer getSiteid() {
		return this.siteid;
	}

	public CollectionProgramEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public Integer getNodeid() {
		return this.nodeid;
	}

	public CollectionProgramEntity setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
		return this;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public CollectionProgramEntity setModelid(Integer modelid) {
		this.modelid = modelid;
		return this;
	}

	public Integer getCatid() {
		return this.catid;
	}

	public CollectionProgramEntity setCatid(Integer catid) {
		this.catid = catid;
		return this;
	}

	public String getConfig() {
		return this.config;
	}

	public CollectionProgramEntity setConfig(String config) {
		this.config = config;
		return this;
	}
}
