package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：content_check 表备注：
 *
 * 字段：
 * - checkid：checkid
 * - catid：catid
 * - siteid：siteid
 * - title：title
 * - username：username
 * - inputtime：inputtime
 * - status：status
 *
 * @TableName("content_check")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("content_check")
public class ContentCheckEntity extends InfraBaseEntity {

	// 字段

	/**
	 * checkid
	 */
	@TableField("checkid")
	private String checkid;

	/**
	 * catid
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * siteid
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * title
	 */
	@TableField("title")
	private String title;

	/**
	 * username
	 */
	@TableField("username")
	private String username;

	/**
	 * inputtime
	 */
	@TableField("inputtime")
	private Integer inputtime;

	/**
	 * status
	 */
	@TableField("status")
	private Integer status;

	// Getter and Setter methods

	public String getCheckid() {
		return this.checkid;
	}

	public ContentCheckEntity setCheckid(String checkid) {
		this.checkid = checkid;
		return this;
	}

	public Integer getCatid() {
		return this.catid;
	}

	public ContentCheckEntity setCatid(Integer catid) {
		this.catid = catid;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public ContentCheckEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public ContentCheckEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public ContentCheckEntity setUsername(String username) {
		this.username = username;
		return this;
	}

	public Integer getInputtime() {
		return this.inputtime;
	}

	public ContentCheckEntity setInputtime(Integer inputtime) {
		this.inputtime = inputtime;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public ContentCheckEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}
}
