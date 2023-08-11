package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：page 表备注：
 * 页面实体类
 *
 * @TableName("page")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("page")
public class PageEntity extends InfraBaseEntity {

	/**
	 * 栏目ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 模板
	 */
	@TableField("template")
	private String template;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	private Integer updatetime;

	// getter and setter
	public Integer getCatid() {
		return this.catid;
	}

	public PageEntity setCatid(Integer catid) {
		this.catid = catid;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public PageEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getStyle() {
		return this.style;
	}

	public PageEntity setStyle(String style) {
		this.style = style;
		return this;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public PageEntity setKeywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public String getContent() {
		return this.content;
	}

	public PageEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public PageEntity setTemplate(String template) {
		this.template = template;
		return this;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public PageEntity setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
		return this;
	}
}
