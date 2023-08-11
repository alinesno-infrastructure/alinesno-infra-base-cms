package com.alinesno.infra.base.cms.entity;

import java.util.Date;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：announce 表备注：
 * 公告表实体类
 *
 * @TableName("announce")
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("announce")
public class AnnounceEntity extends InfraBaseEntity {

	// fields

	/**
	 * 公告标题
	 */
	@Excel(name = "公告标题")
	@TableField("title")
	private String title;

	/**
	 * 内容
	 */
	@Excel(name = "内容")
	@TableField("content")
	private String content;

	/**
	 * 浏览次数
	 */
	@Excel(name = "浏览次数")
	@TableField("hits")
	private Long hits;

	/**
	 * 是否通过1：通过；0：为通过
	 */
	@Excel(name = "是否通过1：通过；0：为通过")
	@TableField("passed")
	private Integer passed;

	/**
	 * 有效起始时间
	 */
	@Excel(name = "有效起始时间", exportFormat = "yyyy-MM-dd")
	@TableField("start_time")
	private Date startTime;

	/**
	 * 有效结束时间
	 */
	@Excel(name = "有效结束时间", exportFormat = "yyyy-MM-dd")
	@TableField("end_time")
	private Date endTime;

	/**
	 * 样式
	 */
	@Excel(name = "样式")
	@TableField("style")
	private String style;

	/**
	 * 模版
	 */
	@Excel(name = "模版")
	@TableField("show_template")
	private String showTemplate;

	// getter and setter

	/**
	 * 获取公告标题
	 *
	 * @return 公告标题
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * 设置公告标题
	 *
	 * @param title 公告标题
	 * @return 当前实体对象
	 */
	public AnnounceEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * 获取内容
	 *
	 * @return 内容
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * 设置内容
	 *
	 * @param content 内容
	 * @return 当前实体对象
	 */
	public AnnounceEntity setContent(String content) {
		this.content = content;
		return this;
	}

	/**
	 * 获取浏览次数
	 *
	 * @return 浏览次数
	 */
	public Long getHits() {
		return this.hits;
	}

	/**
	 * 设置浏览次数
	 *
	 * @param hits 浏览次数
	 * @return 当前实体对象
	 */
	public AnnounceEntity setHits(Long hits) {
		this.hits = hits;
		return this;
	}

/**
 * 获取是否通过1：通过；0：为通过
 *
 * @return 是否通过1：通过；0：为通过
public Integer getPassed() {
return this.passed;
}

/**
 * 设置是否通过1：通过；0：为通过
 *
 * @param passed 是否通过1：通过；0：为通过
 * @return 当前实体对象
 */
public AnnounceEntity setPassed(Integer passed) {
	this.passed = passed;
	return this;
}

	/**
	 * 获取有效起始时间
	 *
	 * @return 有效起始时间
	 */
	public Date getStartTime() {
		return this.startTime;
	}

	/**
	 * 设置有效起始时间
	 *
	 * @param startTime 有效起始时间
	 * @return 当前实体对象
	 */
	public AnnounceEntity setStartTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * 获取有效结束时间
	 *
	 * @return 有效结束时间
	 */
	public Date getEndTime() {
		return this.endTime;
	}

	/**
	 * 设置有效结束时间
	 *
	 * @param endTime 有效结束时间
	 * @return 当前实体对象
	 */
	public AnnounceEntity setEndTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * 获取样式
	 *
	 * @return 样式
	 */
	public String getStyle() {
		return this.style;
	}

	/**
	 * 设置样式
	 *
	 * @param style 样式
	 * @return 当前实体对象
	 */
	public AnnounceEntity setStyle(String style) {
		this.style = style;
		return this;
	}

	/**
	 * 获取模版
	 *
	 * @return 模版
	 */
	public String getShowTemplate() {
		return this.showTemplate;
	}

	/**
	 * 设置模版
	 *
	 * @param showTemplate 模版
	 * @return 当前实体对象
	 */
	public AnnounceEntity setShowTemplate(String showTemplate) {
		this.showTemplate = showTemplate;
		return this;
	}
}

