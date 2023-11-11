package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：comment 表备注：
 *
 * 字段：
 * - commentid：评论ID
 * - siteid：站点ID
 * - title：标题
 * - url：URL
 * - total：总数
 * - square：正方数
 * - anti：反方数
 * - neutral：中立数
 * - displayType：显示类型
 * - tableid：表格ID
 * - lastupdate：最后更新时间
 *
 * @TableName("comment")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("comment")
@Data
public class CommentEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 评论ID
	 */
	@TableField("commentid")
	@ColumnType(length=10)
	@ColumnComment("评论ID")
	private String commentid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("标题")
	private String title;

	/**
	 * URL
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("URL")
	private String url;

	/**
	 * 总数
	 */
	@TableField("total")
	@ColumnType(length=10)
	@ColumnComment("总数")
	private Integer total;

	/**
	 * 正方数
	 */
	@TableField("square")
	@ColumnType(length=10)
	@ColumnComment("正方数")
	private Integer square;

	/**
	 * 反方数
	 */
	@TableField("anti")
	@ColumnType(length=255)
	@ColumnComment("反方数")
	private Integer anti;

	/**
	 * 中立数
	 */
	@TableField("neutral")
	@ColumnType(length=255)
	@ColumnComment("中立数")
	private Integer neutral;

	/**
	 * 显示类型
	 */
	@TableField("display_type")
	@ColumnType(length=20)
	@ColumnComment("显示类型")
	private Integer displayType;

	/**
	 * 表格ID
	 */
	@TableField("tableid")
	@ColumnType(length=10)
	@ColumnComment("表格ID")
	private Integer tableid;

	/**
	 * 最后更新时间
	 */
	@TableField("lastupdate")
	@ColumnType(length=10)
	@ColumnComment("最后更新时间")
	private Integer lastupdate;
}
