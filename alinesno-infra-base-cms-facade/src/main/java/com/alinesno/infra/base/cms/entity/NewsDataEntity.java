package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：news_data 表备注：
 * 新闻数据实体类
 *
 * @TableName("news_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("news_data")
public class NewsDataEntity extends InfraBaseEntity {

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
	 * 可见组
	 */
	@TableField("groupids_view")
	private String groupidsView;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	private Integer paginationtype;

	/**
	 * 每页字符数
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
	 * 投票ID
	 */
	@TableField("voteid")
	private Integer voteid;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	private Integer allowComment;

	/**
	 * 来源
	 */
	@TableField("copyfrom")
	private String copyfrom;

	// getter and setter
	public String getContent() {
		return this.content;
	}

	public NewsDataEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getReadpoint() {
		return this.readpoint;
	}

	public NewsDataEntity setReadpoint(Integer readpoint) {
		this.readpoint = readpoint;
		return this;
	}

	public String getGroupidsView() {
		return this.groupidsView;
	}

	public NewsDataEntity setGroupidsView(String groupidsView) {
		this.groupidsView = groupidsView;
		return this;
	}

	public Integer getPaginationtype() {
		return this.paginationtype;
	}

	public NewsDataEntity setPaginationtype(Integer paginationtype) {
		this.paginationtype = paginationtype;
		return this;
	}

	public Integer getMaxcharperpage() {
		return this.maxcharperpage;
	}

	public NewsDataEntity setMaxcharperpage(Integer maxcharperpage) {
		this.maxcharperpage = maxcharperpage;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public NewsDataEntity setTemplate(String template) {
		this.template = template;
		return this;
	}

	public Integer getPaytype() {
		return this.paytype;
	}

	public NewsDataEntity setPaytype(Integer paytype) {
		this.paytype = paytype;
		return this;
	}

	public String getRelation() {
		return this.relation;
	}

	public NewsDataEntity setRelation(String relation) {
		this.relation = relation;
		return this;
	}

	public Integer getVoteid() {
		return this.voteid;
	}

	public NewsDataEntity setVoteid(Integer voteid) {
		this.voteid = voteid;
		return this;
	}

	public Integer getAllowComment() {
		return this.allowComment;
	}

	public NewsDataEntity setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
		return this;
	}

	public String getCopyfrom() {
		return this.copyfrom;
	}

	public NewsDataEntity setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
		return this;
	}
}
