package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： video_store 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_store")
@Data
public class VideoStoreEntity extends InfraBaseEntity {
	
	// fields
	@TableField("videoid")
	@ColumnType(length=255)
	@ColumnComment("videoid")
	private Integer videoid;

	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("title")
	private String title;

	@TableField("vid")
	@ColumnType(length=255)
	@ColumnComment("vid")
	private String vid;

	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("keywords")
	private String keywords;

	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("description")
	private String description;

	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("status")
	private Integer status;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;

	@TableField("addtime")
	@ColumnType(length=255)
	@ColumnComment("addtime")
	private Integer addtime;

	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("userid")
	private Integer userid;

	@TableField("picpath")
	@ColumnType(length=255)
	@ColumnComment("picpath")
	private String picpath;

	@TableField("size")
	@ColumnType(length=255)
	@ColumnComment("size")
	private String size;

	@TableField("timelen")
	@ColumnType(length=255)
	@ColumnComment("timelen")
	private Integer timelen;

	@TableField("userupload")
	@ColumnType(length=255)
	@ColumnComment("userupload")
	private Integer userupload;

	@TableField("channelid")
	@ColumnType(length=255)
	@ColumnComment("channelid")
	private Integer channelid;
}
