package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keyword_data 表备注：
 *
 * 字段：
 * - tagid：标签ID
 * - siteid：站点ID
 * - contentid：内容ID
 *
 * @TableName("keyword_data")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keyword_data")
@Data
public class KeywordDataEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 标签ID
	 */
	@TableField("tagid")
	@ColumnType(length=255)
	@ColumnComment("标签ID")
	private Integer tagid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 内容ID
	 */
	@TableField("contentid")
	@ColumnType(length=255)
	@ColumnComment("内容ID")
	private String contentid;
}
