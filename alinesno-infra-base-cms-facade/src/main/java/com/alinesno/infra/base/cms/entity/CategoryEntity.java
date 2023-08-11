package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：category 表备注：
 * 栏目实体类
 *
 * @TableName("category")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("category")
public class CategoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * 上级栏目
	 */
	@TableField("parentid")
	private String parentid;

	/**
	 * 栏目名称
	 */
	@TableField("catname")
	private String catname;

	/**
	 * 栏目图片
	 */
	@TableField("image")
	private String image;

	/**
	 * 栏目描述
	 */
	@TableField("description")
	private String description;

	/**
	 * SEO标题
	 */
	@TableField("seo_title")
	private String seoTitle;

	/**
	 * SEO关键字
	 */
	@TableField("seo_keywords")
	private String seoKeywords;

	/**
	 * SEO描述
	 */
	@TableField("seo_description")
	private String seoDescription;

	/**
	 * 是否导航展示
	 */
	@TableField("link_show")
	private Integer linkShow;

	// getter and setter methods

	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getCatname() {
		return this.catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeoTitle() {
		return this.seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoKeywords() {
		return this.seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public String getSeoDescription() {
		return this.seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public Integer getLinkShow() {
		return this.linkShow;
	}

	public void setLinkShow(Integer linkShow) {
		this.linkShow = linkShow;
	}
}
