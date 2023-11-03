package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class DownloadEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 分类ID
	 */
	@TableField("catid")
	@ColumnType(length = 255)
	@ColumnComment("分类ID")
	private Integer catid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	@ColumnType(length = 255)
	@ColumnComment("类型ID")
	private Integer typeid;

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length = 255)
	@ColumnComment("标题")
	private String title;

	/**
	 * 样式
	 */
	@TableField("style")
	@ColumnType(length = 255)
	@ColumnComment("样式")
	private String style;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	@ColumnType(length = 255)
	@ColumnComment("缩略图")
	private String thumb;

	/**
	 * 关键词
	 */
	@TableField("keywords")
	@ColumnType(length = 255)
	@ColumnComment("关键词")
	private String keywords;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length = 255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 位置ID
	 */
	@TableField("posids")
	@ColumnType(length = 255)
	@ColumnComment("位置ID")
	private Integer posids;

	/**
	 * URL地址
	 */
	@TableField("url")
	@ColumnType(length = 255)
	@ColumnComment("URL地址")
	private String url;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length = 255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length = 255)
	@ColumnComment("状态")
	private Integer status;

	/**
	 * 系统添加
	 */
	@TableField("sysadd")
	@ColumnType(length = 255)
	@ColumnComment("系统添加")
	private Integer sysadd;

	/**
	 * 是否链接
	 */
	@TableField("islink")
	@ColumnType(length = 255)
	@ColumnComment("是否链接")
	private Integer islink;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length = 255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 录入时间
	 */
	@TableField("inputtime")
	@ColumnType(length = 255)
	@ColumnComment("录入时间")
	private Integer inputtime;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	@ColumnType(length = 255)
	@ColumnComment("更新时间")
	private Integer updatetime;

	/**
	 * 系统
	 */
	@TableField("systems")
	@ColumnType(length = 255)
	@ColumnComment("系统")
	private String systems;

	/**
	 * 复制类型
	 */
	@TableField("copytype")
	@ColumnType(length = 255)
	@ColumnComment("复制类型")
	private String copytype;

	/**
	 * 语言
	 */
	@TableField("language")
	@ColumnType(length = 255)
	@ColumnComment("语言")
	private String language;

	/**
	 * 类别
	 */
	@TableField("classtype")
	@ColumnType(length = 255)
	@ColumnComment("类别")
	private String classtype;

	/**
	 * 版本
	 */
	@TableField("version")
	@ColumnType(length = 255)
	@ColumnComment("版本")
	private String version;

	/**
	 * 文件大小
	 */
	@TableField("filesize")
	@ColumnType(length = 255)
	@ColumnComment("文件大小")
	private String filesize;

	/**
	 * 星级
	 */
	@TableField("stars")
	@ColumnType(length = 255)
	@ColumnComment("星级")
	private String stars;
}

