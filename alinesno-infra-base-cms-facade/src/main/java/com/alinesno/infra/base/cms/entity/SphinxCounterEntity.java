package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SphinxCounterEntity extends InfraBaseEntity {

	// fields
	/**
	 * 计数器ID
	 */
	@TableField("counter_id")
	@ColumnType(length=255)
	@ColumnComment("计数器ID")
	private Long counterId;

	/**
	 * 最大文档ID
	 */
	@TableField("max_doc_id")
	@ColumnType(length=255)
	@ColumnComment("最大文档ID")
	private Long maxDocId;
}
