package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： video_data 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_data")
@Data
public class VideoDataEntity extends InfraBaseEntity {

	// fields
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("content")
	private String content;

	@TableField("readpoint")
	@ColumnType(length=255)
	@ColumnComment("readpoint")
	private Integer readpoint;

	@TableField("groupids_view")
	@ColumnType(length=255)
	@ColumnComment("groupids_view")
	private String groupidsView;

	@TableField("paginationtype")
	@ColumnType(length=255)
	@ColumnComment("paginationtype")
	private Integer paginationtype;

	@TableField("maxcharperpage")
	@ColumnType(length=255)
	@ColumnComment("maxcharperpage")
	private Integer maxcharperpage;

	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("template")
	private String template;

	@TableField("paytype")
	@ColumnType(length=255)
	@ColumnComment("paytype")
	private Integer paytype;

	@TableField("allow_comment")
	@ColumnType(length=255)
	@ColumnComment("allow_comment")
	private Integer allowComment;

	@TableField("relation")
	@ColumnType(length=255)
	@ColumnComment("relation")
	private String relation;

	@TableField("video")
	@ColumnType(length=255)
	@ColumnComment("video")
	private Integer video;
}
