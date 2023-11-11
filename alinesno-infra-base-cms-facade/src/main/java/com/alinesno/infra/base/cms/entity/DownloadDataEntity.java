package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@TableName("download_data")
@Data
public class DownloadDataEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 阅读点
	 */
	@TableField("readpoint")
	@ColumnType(length=255)
	@ColumnComment("阅读点")
	private Integer readpoint;

	/**
	 * 可见用户组
	 */
	@TableField("groupids_view")
	@ColumnType(length=255)
	@ColumnComment("可见用户组")
	private String groupidsView;

	/**
	 * 分页方式
	 */
	@TableField("paginationtype")
	@ColumnType(length=255)
	@ColumnComment("分页方式")
	private Integer paginationtype;

	/**
	 * 每页最大字符数
	 */
	@TableField("maxcharperpage")
	@ColumnType(length=255)
	@ColumnComment("每页最大字符数")
	private Integer maxcharperpage;

	/**
	 * 模板
	 */
	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("模板")
	private String template;

	/**
	 * 支付类型
	 */
	@TableField("paytype")
	@ColumnType(length=255)
	@ColumnComment("支付类型")
	private Integer paytype;

	/**
	 * 相关文章
	 */
	@TableField("relation")
	@ColumnType(length=255)
	@ColumnComment("相关文章")
	private String relation;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	@ColumnType(length=255)
	@ColumnComment("是否允许评论")
	private Integer allowComment;

	/**
	 * 下载附件
	 */
	@TableField("downfiles")
	@ColumnType(length=255)
	@ColumnComment("下载附件")
	private String downfiles;

	/**
	 * 下载地址
	 */
	@TableField("downfile")
	@ColumnType(length=255)
	@ColumnComment("下载地址")
	private String downfile;
}
