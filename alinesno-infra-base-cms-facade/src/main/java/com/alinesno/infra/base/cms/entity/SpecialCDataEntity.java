package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 特殊数据实体类
 *
 * @TableName("special_c_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special_c_data")
public class SpecialCDataEntity extends InfraBaseEntity {

	/**
	 * 作者
	 */
	@TableField("author")
	private String author;

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	private Integer paginationtype;

	/**
	 * 每页最大字符数
	 */
	@TableField("maxcharperpage")
	private Integer maxcharperpage;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 展示模板
	 */
	@TableField("show_template")
	private String showTemplate;

	// getter and setter
	public String getAuthor() {
		return author;
	}

	public SpecialCDataEntity setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getContent() {
		return content;
	}

	public SpecialCDataEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getPaginationtype() {
		return paginationtype;
	}

	public SpecialCDataEntity setPaginationtype(Integer paginationtype) {
		this.paginationtype = paginationtype;
		return this;
	}

	public Integer getMaxcharperpage() {
		return maxcharperpage;
	}

	public SpecialCDataEntity setMaxcharperpage(Integer maxcharperpage) {
		this.maxcharperpage = maxcharperpage;
		return this;
	}

	public String getStyle() {
		return style;
	}

	public SpecialCDataEntity setStyle(String style) {
		this.style = style;
		return this;
	}

	public String getShowTemplate() {
		return showTemplate;
	}

	public SpecialCDataEntity setShowTemplate(String showTemplate) {
		this.showTemplate = showTemplate;
		return this;
	}
}
