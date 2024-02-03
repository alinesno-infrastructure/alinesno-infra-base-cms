package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 特殊内容实体类
 *
 * @TableName("special_content")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special_content")
@Data
public class SpecialContentEntity extends InfraBaseEntity {

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("标题")
	private String title;

	/**
	 * 分类ID
	 */
	@TableField("category_id")
	@ColumnType(length=255)
	@ColumnComment("分类ID")
	private String categoryId;

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("关键词")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 添加时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@ColumnType(length=255)
	@ColumnComment("添加时间")
	private Date addTime;
}
