package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：comment_check 表备注：
 *
 * Fields:
 * - commentDataId: 论评ID号
 * - siteid: 站点ID
 * - tableid: 数据存储表ID
 *
 * @TableName("comment_check")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("comment_check")
public class CommentCheckEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 论评ID号
	 */
	@TableField("comment_data_id")
	private Integer commentDataId;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 数据存储表ID
	 */
	@TableField("tableid")
	private Integer tableid;

	// Getter and Setter methods

	public Integer getCommentDataId() {
		return this.commentDataId;
	}

	public CommentCheckEntity setCommentDataId(Integer commentDataId) {
		this.commentDataId = commentDataId;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public CommentCheckEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public Integer getTableid() {
		return this.tableid;
	}

	public CommentCheckEntity setTableid(Integer tableid) {
		this.tableid = tableid;
		return this;
	}
}
