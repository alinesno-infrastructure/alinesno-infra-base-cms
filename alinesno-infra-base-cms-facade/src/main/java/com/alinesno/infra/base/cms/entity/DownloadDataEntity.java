package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：download_data 表备注：
 *
 * 字段：
 * - content：内容
 * - readpoint：阅读点
 * - groupidsView：可见用户组
 * - paginationtype：分页方式
 * - maxcharperpage：每页最大字符数
 * - template：模板
 * - paytype：支付类型
 * - relation：相关文章
 * - allowComment：是否允许评论
 * - downfiles：下载附件
 * - downfile：下载地址
 *
 * @TableName("download_data")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("download_data")
public class DownloadDataEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 阅读点
	 */
	@TableField("readpoint")
	private Integer readpoint;

	/**
	 * 可见用户组
	 */
	@TableField("groupids_view")
	private String groupidsView;

	/**
	 * 分页方式
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
	 * 相关文章
	 */
	@TableField("relation")
	private String relation;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	private Integer allowComment;

	/**
	 * 下载附件
	 */
	@TableField("downfiles")
	private String downfiles;

	/**
	 * 下载地址
	 */
	@TableField("downfile")
	private String downfile;

	// Getter and Setter methods

	public String getContent() {
		return this.content;
	}

	public DownloadDataEntity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getReadpoint() {
		return this.readpoint;
	}

	public DownloadDataEntity setReadpoint(Integer readpoint) {
		this.readpoint = readpoint;
		return this;
	}

	public String getGroupidsView() {
		return this.groupidsView;
	}

	public DownloadDataEntity setGroupidsView(String groupidsView) {
		this.groupidsView = groupidsView;
		return this;
	}

	public Integer getPaginationtype() {
		return this.paginationtype;
	}

	public DownloadDataEntity setPaginationtype(Integer paginationtype) {
		this.paginationtype = paginationtype;
		return this;
	}

	public Integer getMaxcharperpage() {
		return this.maxcharperpage;
	}

	public DownloadDataEntity setMaxcharperpage(Integer maxcharperpage) {
		this.maxcharperpage = maxcharperpage;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public DownloadDataEntity setTemplate(String template) {
		this.template = template;
		return this;
	}

	public Integer getPaytype() {
		return this.paytype;
	}

	public DownloadDataEntity setPaytype(Integer paytype) {
		this.paytype = paytype;
		return this;
	}

	public String getRelation() {
		return this.relation;
	}

	public DownloadDataEntity setRelation(String relation) {
		this.relation = relation;
		return this;
	}

	public Integer getAllowComment() {
		return this.allowComment;
	}

	public DownloadDataEntity setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
		return this;
	}

	public String getDownfiles() {
		return this.downfiles;
	}

	public DownloadDataEntity setDownfiles(String downfiles) {
		this.downfiles = downfiles;
		return this;
	}

	public String getDownfile() {
		return this.downfile;
	}

	public DownloadDataEntity setDownfile(String downfile) {
		this.downfile = downfile;
		return this;
	}
}
