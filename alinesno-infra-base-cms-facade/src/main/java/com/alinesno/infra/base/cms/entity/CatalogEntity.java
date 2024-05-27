package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据表：category 表备注：
 * 栏目实体类
 *
 * @TableName("category")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("category")
@Data
public class CatalogEntity extends InfraBaseEntity {

	/**
	 * 栏目ID
	 */
	@TableField("catalog_id")
	@ColumnType(length=255)
	@ColumnComment("栏目ID")
	private Long catalogId;

	/**
	 * 站点ID
	 */
	@TableField("site_id")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Long siteId;

	/**
	 * 父级栏目ID
	 */
	@TableField("parent_id")
	@ColumnType(length=255)
	@ColumnComment("父级栏目ID")
	private Long parentId;

	/**
	 * 祖级栏目ID列表
	 */
	@TableField("ancestors")
	@ColumnType(length=255)
	@ColumnComment("祖级栏目ID列表")
	private String ancestors;

	/**
	 * 栏目名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("栏目名称")
	private String name;

	/**
	 * 父级栏目名称（非表字段）
	 */
	@TableField(exist = false)
	private String parentName;

	/**
	 * logo
	 */
	@TableField("logo")
	@ColumnType(length=255)
	@ColumnComment("logo")
	private String logo;

	/**
	 * logo预览地址（非表字段）
	 */
	@TableField(exist = false)
	private String logoSrc;

	/**
	 * 栏目别名
	 */
	@TableField("alias")
	@ColumnType(length=255)
	@ColumnComment("栏目别名")
	private String alias;

	/**
	 * 栏目简介
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("栏目简介")
	private String description;

	/**
	 * 所属部门编码
	 */
	@TableField("deptCode")
	@ColumnType(length=255)
	@ColumnComment("所属部门编码")
	private String deptCode;

	/**
	 * 栏目类型
	 */
	@TableField("catalogType")
	@ColumnType(length=255)
	@ColumnComment("栏目类型")
	private String catalogType;

	/**
	 * 栏目目录
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("栏目目录")
	private String path;

	/**
	 * 跳转地址，标题栏目跳转地址
	 */
	@TableField("redirectUrl")
	@ColumnType(length=255)
	@ColumnComment("跳转地址，标题栏目跳转地址")
	private String redirectUrl;

	/**
	 * 是否生成静态页面
	 */
	@TableField("staticFlag")
	@ColumnType(length=255)
	@ColumnComment("是否生成静态页面")
	private String staticFlag;

	/**
	 * 栏目是否可见
	 */
	@TableField("visible_flag")
	@ColumnType(length=255)
	@ColumnComment("栏目是否可见")
	private String visibleFlag;

	/**
	 * 排序字段
	 */
	@TableField("sort_flag")
	@ColumnType(length=255)
	@ColumnComment("排序字段")
	private Long sortFlag;

	/**
	 * 栏目首页命名
	 */
	@TableField("index_file_name")
	@ColumnType(length=255)
	@ColumnComment("栏目首页命名")
	private String indexFileName;

	/**
	 * 列表页命名规则
	 */
	@TableField("list_name_rule")
	@ColumnType(length=255)
	@ColumnComment("列表页命名规则")
	private String listNameRule;

	/**
	 * 详情页命名规则
	 */
	@TableField("detail_name_rule")
	@ColumnType(length=255)
	@ColumnComment("详情页命名规则")
	private String detailNameRule;

	/**
	 * 栏目层级
	 */
	@TableField("tree_level")
	@ColumnType(length=255)
	@ColumnComment("栏目层级")
	private Integer treeLevel;

	/**
	 * 子栏目数
	 */
	@TableField("child_count")
	@ColumnType(length=255)
	@ColumnComment("子栏目数")
	private Integer childCount;

	/**
	 * 内容数量
	 */
	@TableField("content_count")
	@ColumnType(length=255)
	@ColumnComment("内容数量")
	private Integer contentCount;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("状态")
	private String status;

	/**
	 * 点击量
	 */
	@TableField("hit_count")
	@ColumnType(length=255)
	@ColumnComment("点击量")
	private Integer hitCount;

	/**
	 * SEO关键词
	 */
	@TableField("seo_keywords")
	@ColumnType(length=255)
	@ColumnComment("SEO关键词")
	private String seoKeywords;

	/**
	 * SEO描述
	 */
	@TableField("seo_description")
	@ColumnType(length=255)
	@ColumnComment("SEO描述")
	private String seoDescription;

	/**
	 * SEO标题
	 */
	@TableField("seo_title")
	@ColumnType(length=255)
	@ColumnComment("SEO标题")
	private String seoTitle;

	/**
	 * 链接（非表字段）
	 */
	@TableField(exist = false)
	private String link;

	/**
	 * 列表页链接（无首页模板时与link一致）
	 */
	@TableField(exist = false)
	private String listLink;

	/**
	 * 发布通道配置
	 */
	@TableField(exist = false)
	private Map<String, Map<String, Object>> publishPipeProps;

	/**
	 * 扩展配置
	 */
	@TableField(exist = false)
	private Map<String, String> configProps;

	public Map<String, String> getConfigProps() {
		if (this.configProps == null) {
			this.configProps = new HashMap<>();
		}
		return configProps;
	}

	public Map<String, Object> getPublishPipeProps(String publishPipeCode) {
		if (this.publishPipeProps == null) {
			this.publishPipeProps = new HashMap<>();
		}
		Map<String, Object> map = this.publishPipeProps.get(publishPipeCode);
		if (map == null) {
			map = new HashMap<>();
			this.publishPipeProps.put(publishPipeCode, map);
		}
		return map;
	}

//	public String getIndexTemplate(String publishPipeCode) {
//		return PublishPipeProp_IndexTemplate.getValue(publishPipeCode, this.publishPipeProps);
//	}

//	public String getListTemplate(String publishPipeCode) {
//		return PublishPipeProp_ListTemplate.getValue(publishPipeCode, this.publishPipeProps);
//	}

//	public boolean isStaticize() {
//		return YesOrNo.isYes(this.staticFlag);
//	}
//
//	public boolean isVisible() {
//		return YesOrNo.isYes(this.visibleFlag);
//	}
//
//	public boolean isEnable() {
//		return EnableOrDisable.isEnable(this.status);
//	}
}
