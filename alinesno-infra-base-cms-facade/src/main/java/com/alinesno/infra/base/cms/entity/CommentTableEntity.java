package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：comment_table 表备注：
 *
 * 字段：
 * - tableid：表ID号
 * - total：数据总量
 * - creatAt：创建时间
 *
 * @TableName("comment_table")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("comment_table")
public class CommentTableEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 表ID号
	 */
	@TableField("tableid")
	private Integer tableid;

	/**
	 * 数据总量
	 */
	@TableField("total")
	private Integer total;

	/**
	 * 创建时间
	 */
	@TableField("creat_at")
	private Integer creatAt;

	// Getter and Setter methods

	public Integer getTableid() {
		return this.tableid;
	}

	public CommentTableEntity setTableid(Integer tableid) {
		this.tableid = tableid;
		return this;
	}

	public Integer getTotal() {
		return this.total;
	}

	public CommentTableEntity setTotal(Integer total) {
		this.total = total;
		return this;
	}

	public Integer getCreatAt() {
		return this.creatAt;
	}

	public CommentTableEntity setCreatAt(Integer creatAt) {
		this.creatAt = creatAt;
		return this;
	}
}
