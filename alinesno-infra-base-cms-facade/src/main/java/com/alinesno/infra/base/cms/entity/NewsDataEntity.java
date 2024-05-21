package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：news_data 表备注：
 * 新闻数据实体类
 *
 * @TableName("news_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("news_data")
@Data
public class NewsDataEntity extends InfraBaseEntity {

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 阅读点数
	 */
	@TableField("readpoint")
	@ColumnType(length=255)
	@ColumnComment("阅读点数")
	private Integer readpoint;

	/**
	 * 可见组
	 */
	@TableField("groupids_view")
	@ColumnType(length=255)
	@ColumnComment("可见组")
	private String groupidsView;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	@ColumnType(length=255)
	@ColumnComment("分页类型")
	private Integer paginationtype;

	/**
	 * 每页字符数
	 */
	@TableField("maxcharperpage")
	@ColumnType(length=255)
	@ColumnComment("每页字符数")
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
	 * 投票ID
	 */
	@TableField("voteid")
	@ColumnType(length=255)
	@ColumnComment("投票ID")
	private Integer voteid;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	@ColumnType(length=255)
	@ColumnComment("是否允许评论")
	private Integer allowComment;

	/**
	 * 来源
	 */
	@TableField("copyfrom")
	@ColumnType(length=255)
	@ColumnComment("来源")
	private String copyfrom;
}
