package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keyword_data 表备注：
 *
 * 字段：
 * - tagid：标签ID
 * - siteid：站点ID
 * - contentid：内容ID
 *
 * @TableName("keyword_data")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keyword_data")
public class KeywordDataEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 标签ID
	 */
	@TableField("tagid")
	private Integer tagid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 内容ID
	 */
	@TableField("contentid")
	private String contentid;

	// Getters and Setters

	public Integer getTagid() {
		return tagid;
	}

	public void setTagid(Integer tagid) {
		this.tagid = tagid;
	}

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public String getContentid() {
		return contentid;
	}

	public void setContentid(String contentid) {
		this.contentid = contentid;
	}
}
