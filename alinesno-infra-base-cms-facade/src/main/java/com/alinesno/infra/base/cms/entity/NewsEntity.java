package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：news 表备注：
 * 新闻实体类
 *
 * @TableName("news")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("news")
@Data
public class NewsEntity extends InfraBaseEntity {

	/**
	 * 栏目ID
	 */
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("栏目ID")
	private Integer catid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("类型ID")
	private Integer typeid;

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
	 * 缩略图
	 */
	@TableField("thumb")
	@ColumnType(length=255)
	@ColumnComment("缩略图")
	private String thumb;

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
	 * 推荐位
	 */
	@TableField("posids")
	@ColumnType(length=255)
	@ColumnComment("推荐位")
	private Integer posids;

	/**
	 * 链接地址
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("链接地址")
	private String url;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("状态")
	private Integer status;

	/**
	 * 是否系统添加
	 */
	@TableField("sysadd")
	@ColumnType(length=255)
	@ColumnComment("是否系统添加")
	private Integer sysadd;

	/**
	 * 是否外链
	 */
	@TableField("islink")
	@ColumnType(length=255)
	@ColumnComment("是否外链")
	private Integer islink;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 录入时间
	 */
	@TableField("inputtime")
	@ColumnType(length=255)
	@ColumnComment("录入时间")
	private Integer inputtime;

	/**
	 * 更新时间
	 */
	@TableField("updatetime")
	@ColumnType(length=255)
	@ColumnComment("更新时间")
	private Integer updatetime;
}
