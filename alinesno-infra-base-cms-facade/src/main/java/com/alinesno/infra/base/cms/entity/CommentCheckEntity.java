package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class CommentCheckEntity extends InfraBaseEntity {

	// Fields

	/**
	 * 评论ID号
	 */
	@TableField("comment_data_id")
	@ColumnType(length=255)
	@ColumnComment("评论ID号")
	private Integer commentDataId;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 数据存储表ID
	 */
	@TableField("tableid")
	@ColumnType(length=10)
	@ColumnComment("数据存储表ID")
	private Integer tableid;
}
