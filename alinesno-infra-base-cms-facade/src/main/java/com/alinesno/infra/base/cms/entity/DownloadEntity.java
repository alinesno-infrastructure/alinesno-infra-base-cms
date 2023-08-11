package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：download 表备注：
 *
 * 字段：
 * - catid：分类ID
 * - typeid：类型ID
 * - title：标题
 * - style：样式
 * - thumb：缩略图
 * - keywords：关键词
 * - description：描述
 * - posids：位置ID
 * - url：URL地址
 * - listorder：排序
 * - status：状态
 * - sysadd：系统添加
 * - islink：是否链接
 * - username：用户名
 * - inputtime：录入时间
 * - updatetime：更新时间
 * - systems：系统
 * - copytype：复制类型
 * - language：语言
 * - classtype：类别
 * - version：版本
 * - filesize：文件大小
 * - stars：星级
 *
 * @TableName("download")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("download")
public class DownloadEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 分类ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	private Integer typeid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	private String thumb;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 位置ID
	 */
	@TableField("posids")
	private Integer posids;

	/**
	 * URL地址
	 */
	@TableField("url")
	private String url;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 系统添加
	 */
	@TableField("sysadd")
	private Integer sysadd;

	/**
	 * 是否链接
	 */
	@TableField("islink")
	private Integer islink;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 录入时间
	 */
	@TableField("inputtime")
	private Integer inputtime;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	private Integer updatetime;

	/**
	 * 系统
	 */
	@TableField("systems")
	private String systems;

	/**
	 * 复制类型
	 */
	@TableField("copytype")
	private String copytype;

	/**
	 * 语言
	 */
	@TableField("language")
	private String language;

/**
	 * 类别
	 */
	@TableField("classtype")
	private String classtype;

	/**
	 * 版本
	 */
	@TableField("version")
	private String version;

	/**
	 * 文件大小
	 */
	@TableField("filesize")
	private String filesize;

	/**
	 * 星级
	 */
	@TableField("stars")
	private String stars;

	// Getters and Setters
	// ...
}

