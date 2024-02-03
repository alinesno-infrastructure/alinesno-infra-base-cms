package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 特殊实体类
 *
 * @TableName("special")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special")
@Data
public class SpecialEntity extends InfraBaseEntity {

	/**
	 * 文章ID
	 */
	@TableField("aid")
	@ColumnType(length = 255)
	@ColumnComment("文章ID")
	private Integer aid;

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length = 255)
	@ColumnComment("标题")
	private String title;

	/**
	 * 类型IDs
	 */
	@TableField("typeids")
	@ColumnType(length = 255)
	@ColumnComment("类型IDs")
	private String typeids;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	@ColumnType(length = 255)
	@ColumnComment("缩略图")
	private String thumb;

	/**
	 * 横幅
	 */
	@TableField("banner")
	@ColumnType(length = 255)
	@ColumnComment("横幅")
	private String banner;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length = 255)
	@ColumnComment("描述")
	private String description;

	/**
	 * URL
	 */
	@TableField("url")
	@ColumnType(length = 255)
	@ColumnComment("URL")
	private String url;

	/**
	 * 是否HTML
	 */
	@TableField("ishtml")
	@ColumnType(length = 255)
	@ColumnComment("是否HTML")
	private Integer ishtml;

	/**
	 * 是否分页
	 */
	@TableField("ispage")
	@ColumnType(length = 255)
	@ColumnComment("是否分页")
	private Integer ispage;

	/**
	 * 文件名
	 */
	@TableField("filename")
	@ColumnType(length = 255)
	@ColumnComment("文件名")
	private String filename;

	/**
	 * 图片列表
	 */
	@TableField("pics")
	@ColumnType(length = 255)
	@ColumnComment("图片列表")
	private String pics;

	/**
	 * 投票ID
	 */
	@TableField("voteid")
	@ColumnType(length = 255)
	@ColumnComment("投票ID")
	private String voteid;

	/**
	 * 样式
	 */
	@TableField("style")
	@ColumnType(length = 255)
	@ColumnComment("样式")
	private String style;

	/**
	 * 首页模板
	 */
	@TableField("index_template")
	@ColumnType(length = 255)
	@ColumnComment("首页模板")
	private String indexTemplate;

	/**
	 * 列表模板
	 */
	@TableField("list_template")
	@ColumnType(length = 255)
	@ColumnComment("列表模板")
	private String listTemplate;

	/**
	 * 显示模板
	 */
	@TableField("show_template")
	@ColumnType(length = 255)
	@ColumnComment("显示模板")
	private String showTemplate;

	/**
	 * CSS
	 */
	@TableField("css")
	@ColumnType(length = 255)
	@ColumnComment("CSS")
	private String css;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length = 255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length = 255)
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 创建时间
	 */
	@TableField("createtime")
	@ColumnType(length = 255)
	@ColumnComment("创建时间")
	private Integer createtime;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length = 255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 精华
	 */
	@TableField("elite")
	@ColumnType(length = 255)
	@ColumnComment("精华")
	private Integer elite;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	@ColumnType(length = 255)
	@ColumnComment("是否禁用")
	private Integer disabled;

	/**
	 * 是否视频
	 */
	@TableField("isvideo")
	@ColumnType(length = 255)
	@ColumnComment("是否视频")
	private Integer isvideo;

}

