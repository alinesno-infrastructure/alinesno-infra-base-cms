package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： video_data 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_data")
public class VideoDataEntity extends InfraBaseEntity {

	// fields
	@TableField("content")
	private String content;

	@TableField("readpoint")
	private Integer readpoint;

	@TableField("groupids_view")
	private String groupidsView;

	@TableField("paginationtype")
	private Integer paginationtype;

	@TableField("maxcharperpage")
	private Integer maxcharperpage;

	@TableField("template")
	private String template;

	@TableField("paytype")
	private Integer paytype;

	@TableField("allow_comment")
	private Integer allowComment;

	@TableField("relation")
	private String relation;

	@TableField("video")
	private Integer video;

	// getter and setter
	public String getContent() {
		return this.content;
	}

	public VideoDataEntity setContent(String arg) {
		this.content = arg;
		return this;
	}

	public Integer getReadpoint() {
		return this.readpoint;
	}

	public VideoDataEntity setReadpoint(Integer arg) {
		this.readpoint = arg;
		return this;
	}

	public String getGroupidsView() {
		return this.groupidsView;
	}

	public VideoDataEntity setGroupidsView(String arg) {
		this.groupidsView = arg;
		return this;
	}

	public Integer getPaginationtype() {
		return this.paginationtype;
	}

	public VideoDataEntity setPaginationtype(Integer arg) {
		this.paginationtype = arg;
		return this;
	}

	public Integer getMaxcharperpage() {
		return this.maxcharperpage;
	}

	public VideoDataEntity setMaxcharperpage(Integer arg) {
		this.maxcharperpage = arg;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public VideoDataEntity setTemplate(String arg) {
		this.template = arg;
		return this;
	}

	public Integer getPaytype() {
		return this.paytype;
	}

	public VideoDataEntity setPaytype(Integer arg) {
		this.paytype = arg;
		return this;
	}

	public Integer getAllowComment() {
		return this.allowComment;
	}

	public VideoDataEntity setAllowComment(Integer arg) {
		this.allowComment = arg;
		return this;
	}

	public String getRelation() {
		return this.relation;
	}

	public VideoDataEntity setRelation(String arg) {
		this.relation = arg;
		return this;
	}

	public Integer getVideo() {
		return this.video;
	}

	public VideoDataEntity setVideo(Integer arg) {
		this.video = arg;
		return this;
	}
}
