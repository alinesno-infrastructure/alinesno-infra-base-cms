package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 特殊内容实体类
 *
 * @TableName("special_content")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special_content")
public class SpecialContentEntity extends InfraBaseEntity {

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * 分类ID
	 */
	@TableField("category_id")
	private String categoryId;

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 添加时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date addTime;

	// getter and setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
