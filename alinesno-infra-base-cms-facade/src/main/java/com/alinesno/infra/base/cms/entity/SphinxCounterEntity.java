package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sphinx_counter 表备注：
 *
 * SphinxCounterEntity类是对应数据库表sphinx_counter的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sphinx_counter")
public class SphinxCounterEntity extends InfraBaseEntity {

	// fields
	/**
	 * 计数器ID
	 */
	@TableField("counter_id")
	private Long counterId;

	/**
	 * 最大文档ID
	 */
	@TableField("max_doc_id")
	private Long maxDocId;

	// getter and setter
	/**
	 * 获取计数器ID
	 */
	public Long getCounterId() {
		return this.counterId;
	}

	/**
	 * 设置计数器ID
	 */
	public SphinxCounterEntity setCounterId(Long counterId) {
		this.counterId = counterId;
		return this;
	}

	/**
	 * 获取最大文档ID
	 */
	public Long getMaxDocId() {
		return this.maxDocId;
	}

	/**
	 * 设置最大文档ID
	 */
	public SphinxCounterEntity setMaxDocId(Long maxDocId) {
		this.maxDocId = maxDocId;
		return this;
	}
}
