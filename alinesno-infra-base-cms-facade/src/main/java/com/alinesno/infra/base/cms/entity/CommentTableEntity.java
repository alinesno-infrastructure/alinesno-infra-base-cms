package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@Data
public class CommentTableEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 表ID号
	 */
	@TableField("tableid")
	@ColumnType(length=10)
	@ColumnComment("表ID号")
	private Integer tableid;

	/**
	 * 数据总量
	 */
	@TableField("total")
	@ColumnType(length=10)
	@ColumnComment("数据总量")
	private Integer total;

	/**
	 * 创建时间
	 */
	@TableField("creat_at")
	@ColumnType(length=20)
	@ColumnComment("创建时间")
	private Integer creatAt;
}
