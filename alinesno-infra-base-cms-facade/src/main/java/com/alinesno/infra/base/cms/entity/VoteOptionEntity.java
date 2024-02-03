package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： vote_option 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("vote_option")
@Data
public class VoteOptionEntity extends InfraBaseEntity {
	// fields
	@TableField("optionid")
	@ColumnType(length=255)
	@ColumnComment("optionid")
	private Integer optionid;

	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("siteid")
	private Integer siteid;

	@TableField("subjectid")
	@ColumnType(length=255)
	@ColumnComment("subjectid")
	private Integer subjectid;

	@TableField("option")
	@ColumnType(length=255)
	@ColumnComment("option")
	private String option;

	@TableField("image")
	@ColumnType(length=255)
	@ColumnComment("image")
	private String image;

	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;
}
