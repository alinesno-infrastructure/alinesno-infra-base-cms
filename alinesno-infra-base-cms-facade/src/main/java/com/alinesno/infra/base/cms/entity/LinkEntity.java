package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：link 表备注：
 *
 * 字段：
 * - linkid：链接ID
 * - typeid：类型ID
 * - linktype：链接类型
 * - name：名称
 * - url：链接地址
 * - logo：logo
 * - introduce：介绍
 * - username：用户名
 * - listorder：排序
 * - elite：是否精华
 * - passed：是否通过审核
 *
 * @TableName("link")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("link")
public class LinkEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 链接ID
	 */
	@TableField("linkid")
	private Integer linkid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	private Integer typeid;

	/**
	 * 链接类型
	 */
	@TableField("linktype")
	private Integer linktype;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 链接地址
	 */
	@TableField("url")
	private String url;

	/**
	 * logo
	 */
	@TableField("logo")
	private String logo;

	/**
	 * 介绍
	 */
	@TableField("introduce")
	private String introduce;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 是否精华
	 */
	@TableField("elite")
	private Integer elite;

	/**
	 * 是否通过审核
	 */
	@TableField("passed")
	private Integer passed;

	// Getters and Setters

	public Integer getLinkid() {
		return linkid;
	}

	public void setLinkid(Integer linkid) {
		this.linkid = linkid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getLinktype() {
		return linktype;
	}

	public void setLinktype(Integer linktype) {
		this.linktype = linktype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public Integer getElite() {
		return elite;
	}

	public void setElite(Integer elite) {
		this.elite = elite;
	}

	public Integer getPassed() {
		return passed;
	}

	public void setPassed(Integer passed) {
		this.passed = passed;
	}
}
