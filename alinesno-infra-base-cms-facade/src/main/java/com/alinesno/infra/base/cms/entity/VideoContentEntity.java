package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： video_content 表备注：
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_content")
@Data
public class VideoContentEntity extends InfraBaseEntity {
	// fields
	@TableField("contentid")
	@ColumnType(length=255)
	@ColumnComment("contentid")
	private Integer contentid;

	@TableField("modelid")
	@ColumnType(length=255)
	@ColumnComment("modelid")
	private Integer modelid;

	@TableField("videoid")
	@ColumnType(length=255)
	@ColumnComment("videoid")
	private Integer videoid;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;
}
