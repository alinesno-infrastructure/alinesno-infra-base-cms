package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：favorite 表备注：
 *
 * 字段：
 * - userid：用户ID
 * - title：标题
 * - url：URL地址
 * - adddate：添加日期
 *
 * @TableName("favorite")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("favorite")
public class FavoriteEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * URL地址
	 */
	@TableField("url")
	private String url;

	/**
	 * 添加日期
	 */
	@TableField("adddate")
	private Integer adddate;

	// Getters and Setters

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Integer adddate) {
		this.adddate = adddate;
	}
}
