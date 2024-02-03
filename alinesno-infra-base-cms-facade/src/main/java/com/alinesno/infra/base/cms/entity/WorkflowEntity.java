package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表： workflow 表备注：
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("workflow")
@Data
public class WorkflowEntity extends InfraBaseEntity {
	// fields
	@TableField("workflowid")
	@ColumnType(length=255)
	@ColumnComment("workflowid")
	private Integer workflowid;

	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("siteid")
	private Integer siteid;

	@TableField("steps")
	@ColumnType(length=255)
	@ColumnComment("steps")
	private Integer steps;

	@TableField("workname")
	@ColumnType(length=255)
	@ColumnComment("workname")
	private String workname;

	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("description")
	private String description;

	@TableField("setting")
	@ColumnType(length=255)
	@ColumnComment("setting")
	private String setting;

	@TableField("flag")
	@ColumnType(length=255)
	@ColumnComment("flag")
	private Integer flag;
}
