package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： video 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video")
@Data
public class VideoEntity extends InfraBaseEntity {

	// fields
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("catid")
	private Integer catid;

	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("typeid")
	private Integer typeid;

	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("title")
	private String title;

	@TableField("style")
	@ColumnType(length=255)
	@ColumnComment("style")
	private String style;

	@TableField("thumb")
	@ColumnType(length=255)
	@ColumnComment("thumb")
	private String thumb;

	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("keywords")
	private String keywords;

	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("description")
	private String description;

	@TableField("posids")
	@ColumnType(length=255)
	@ColumnComment("posids")
	private Integer posids;

	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("url")
	private String url;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;

	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("status")
	private Integer status;

	@TableField("sysadd")
	@ColumnType(length=255)
	@ColumnComment("sysadd")
	private Integer sysadd;

	@TableField("islink")
	@ColumnType(length=255)
	@ColumnComment("islink")
	private Integer islink;

	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("username")
	private String username;

	@TableField("inputtime")
	@ColumnType(length=255)
	@ColumnComment("inputtime")
	private Integer inputtime;

	@TableField("updatetime")
	@ColumnType(length=255)
	@ColumnComment("updatetime")
	private Integer updatetime;

	@TableField("vision")
	@ColumnType(length=255)
	@ColumnComment("vision")
	private String vision;

	@TableField("video_category")
	@ColumnType(length=255)
	@ColumnComment("video_category")
	private String videoCategory;
}
