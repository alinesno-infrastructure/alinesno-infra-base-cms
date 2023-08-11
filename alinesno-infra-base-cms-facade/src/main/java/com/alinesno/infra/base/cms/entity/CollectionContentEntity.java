package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：collection_content 表备注：
 * 集合内容实体类
 *
 * @TableName("collection_content")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_content")
public class CollectionContentEntity extends InfraBaseEntity {

	// fields

	/**
	 * nodeid
	 */
	@TableField("nodeid")
	private Integer nodeid;

	/**
	 * siteid
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * status
	 */
	@TableField("status")
	private Integer status;

	/**
	 * url
	 */
	@TableField("url")
	private String url;

	/**
	 * title
	 */
	@TableField("title")
	private String title;

	/**
	 * data
	 */
	@TableField("data")
	private String data;

	// getter and setter methods

	public Integer getNodeid() {
		return this.nodeid;
	}

	public void setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
