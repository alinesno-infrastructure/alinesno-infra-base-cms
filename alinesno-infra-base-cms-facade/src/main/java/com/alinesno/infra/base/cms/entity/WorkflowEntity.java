package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： workflow 表备注：
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("workflow")
public class WorkflowEntity extends InfraBaseEntity {
	// fields
	@TableField("workflowid")
	private Integer workflowid;

	@TableField("siteid")
	private Integer siteid;

	@TableField("steps")
	private Integer steps;

	@TableField("workname")
	private String workname;

	@TableField("description")
	private String description;

	@TableField("setting")
	private String setting;

	@TableField("flag")
	private Integer flag;

	// getter and setter
	public Integer getWorkflowid() {
		return this.workflowid;
	}

	public WorkflowEntity setWorkflowid(Integer arg) {
		this.workflowid = arg;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public WorkflowEntity setSiteid(Integer arg) {
		this.siteid = arg;
		return this;
	}

	public Integer getSteps() {
		return this.steps;
	}

	public WorkflowEntity setSteps(Integer arg) {
		this.steps = arg;
		return this;
	}

	public String getWorkname() {
		return this.workname;
	}

	public WorkflowEntity setWorkname(String arg) {
		this.workname = arg;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public WorkflowEntity setDescription(String arg) {
		this.description = arg;
		return this;
	}

	public String getSetting() {
		return this.setting;
	}

	public WorkflowEntity setSetting(String arg) {
		this.setting = arg;
		return this;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public WorkflowEntity setFlag(Integer arg) {
		this.flag = arg;
		return this;
	}
}
