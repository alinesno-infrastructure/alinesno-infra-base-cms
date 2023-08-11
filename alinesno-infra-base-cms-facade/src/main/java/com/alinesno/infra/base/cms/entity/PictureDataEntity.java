package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：picture_data 表备注：
 * 图片数据实体类
 *
 * @TableName("picture_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("picture_data")
public class PictureDataEntity extends InfraBaseEntity {

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 阅读点数
	 */
	@TableField("readpoint")
	private Integer readpoint;

	/**
	 * 分组视图
	 */
	@TableField("groupids_view")
	private String groupidsView;

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
	 * 模板
	 */
	@TableField("template")
	private String template;

	/**
	 * 支付类型
	 */
	@TableField("paytype")
	private Integer paytype;

	/**
	 * 关联
	 */
	@TableField("relation")
	private String relation;

	/**
	 * 图片URL
	 */
	@TableField("pictureurls")
	private String pictureurls;

	/**
	 * 来源
	 */
	@TableField("copyfrom")
	private String copyfrom;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	private Integer allowComment;

	// getter and setter
	public String getContent() {
		return this.content;
	}

	public PictureDataEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getReadpoint() {
		return this.readpoint;
	}

	public PictureDataEntity setReadpoint(Integer readpoint) {
		this.readpoint = readpoint;
		return this;
	}

	public String getGroupidsView() {
		return this.groupidsView;
	}

	public PictureDataEntity setGroupidsView(String groupidsView) {
		this.groupidsView = groupidsView;
		return this;
	}

	public Integer getPaginationtype() {
		return this.paginationtype;
	}

	public PictureDataEntity setPaginationtype(Integer paginationtype) {
		this.paginationtype = paginationtype;
		return this;
	}

	public Integer getMaxcharperpage() {
		return this.maxcharperpage;
	}

	public PictureDataEntity setMaxcharperpage(Integer maxcharperpage) {
		this.maxcharperpage = maxcharperpage;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public PictureDataEntity setTemplate(String template) {
		this.template = template;
		return this;
	}

	public Integer getPaytype() {
		return this.paytype;
	}

	public PictureDataEntity setPaytype(Integer paytype) {
		this.paytype = paytype;
		return this;
	}

	public String getRelation() {
		return this.relation;
	}

	public PictureDataEntity setRelation(String relation) {
		this.relation = relation;
		return this;
	}

	public String getPictureurls() {
		return this.pictureurls;
	}

	public PictureDataEntity setPictureurls(String pictureurls) {
		this.pictureurls = pictureurls;
		return this;
	}

	public String getCopyfrom() {
		return this.copyfrom;
	}

	public PictureDataEntity setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
		return this;
	}

	public Integer getAllowComment() {
		return this.allowComment;
	}

	public PictureDataEntity setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
		return this;
	}
}
