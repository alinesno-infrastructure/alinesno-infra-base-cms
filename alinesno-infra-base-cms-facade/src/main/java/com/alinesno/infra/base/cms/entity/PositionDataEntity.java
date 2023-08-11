package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：picture_data
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("picture_data")
public class PositionDataEntity extends InfraBaseEntity {

	// fields

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
	 * 浏览权限组
	 */
	@TableField("groupids_view")
	private String groupidsView;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	private Integer paginationtype;

	/**
	 * 每页最多字符数
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
	 * 相关文章
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
	 * 允许评论
	 */
	@TableField("allow_comment")
	private Integer allowComment;

	// getter and setter methods

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getReadpoint() {
		return readpoint;
	}

	public void setReadpoint(Integer readpoint) {
		this.readpoint = readpoint;
	}

	public String getGroupidsView() {
		return groupidsView;
	}

	public void setGroupidsView(String groupidsView) {
		this.groupidsView = groupidsView;
	}

	public Integer getPaginationtype() {
		return paginationtype;
	}

	public void setPaginationtype(Integer paginationtype) {
		this.paginationtype = paginationtype;
	}

	public Integer getMaxcharperpage() {
		return maxcharperpage;
	}

	public void setMaxcharperpage(Integer maxcharperpage) {
		this.maxcharperpage = maxcharperpage;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Integer getPaytype() {
		return paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPictureurls() {
		return pictureurls;
	}

	public void setPictureurls(String pictureurls) {
		this.pictureurls = pictureurls;
	}

	public String getCopyfrom() {
		return copyfrom;
	}

	public void setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
	}

}
