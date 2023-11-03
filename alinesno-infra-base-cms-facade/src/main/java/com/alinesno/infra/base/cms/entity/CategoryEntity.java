package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：category 表备注：
 * 栏目实体类
 *
 * @TableName("category")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("category")
@Data
public class CategoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * 上级栏目
	 */
	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("父节点")
	private String parentid;

	/**
	 * 栏目名称
	 */
	@TableField("catname")
	@ColumnType(length=255)
	@ColumnComment("栏目名称")
	private String catname;

	/**
	 * 栏目图片
	 */
	@TableField("image")
	@ColumnType(length=255)
	@ColumnComment("形象")
	private String image;

	/**
	 * 栏目描述
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * SEO标题
	 */
	@TableField("seo_title")
	@ColumnType(length=255)
	@ColumnComment("seoTitle")
	private String seoTitle;

	/**
	 * SEO关键字
	 */
	@TableField("seo_keywords")
	@ColumnType(length=255)
	@ColumnComment("seoKeywords")
	private String seoKeywords;

	/**
	 * SEO描述
	 */
	@TableField("seo_description")
	@ColumnType(length=255)
	@ColumnComment("seoDescription")
	private String seoDescription;

	/**
	 * 是否导航展示
	 */
	@TableField("link_show")
	@ColumnType(length=255)
	@ColumnComment("链接显示")
	private Integer linkShow;
}
