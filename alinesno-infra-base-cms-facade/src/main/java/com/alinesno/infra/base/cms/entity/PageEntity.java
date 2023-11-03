package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：page 表备注：
 * 页面实体类
 *
 * @TableName("page")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("page")
@Data
public class PageEntity extends InfraBaseEntity {

	/**
	 * 栏目ID
	 */
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("栏目ID")
	private Integer catid;

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("标题")
	private String title;

	/**
	 * 样式
	 */
	@TableField("style")
	@ColumnType(length=255)
	@ColumnComment("样式")
	private String style;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("关键词")
	private String keywords;

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 模板
	 */
	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("模板")
	private String template;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	@ColumnType(length=255)
	@ColumnComment("更新时间")
	private Integer updatetime;
}
