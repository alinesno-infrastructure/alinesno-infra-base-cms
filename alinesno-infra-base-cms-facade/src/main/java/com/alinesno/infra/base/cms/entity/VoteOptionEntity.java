package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： vote_option 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("vote_option")
public class VoteOptionEntity extends InfraBaseEntity {
	// fields
	@TableField("optionid")
	private Integer optionid;

	@TableField("siteid")
	private Integer siteid;

	@TableField("subjectid")
	private Integer subjectid;

	@TableField("option")
	private String option;

	@TableField("image")
	private String image;

	@TableField("listorder")
	private Integer listorder;

	// getter and setter
	public Integer getOptionid() {
		return this.optionid;
	}

	public VoteOptionEntity setOptionid(Integer arg) {
		this.optionid = arg;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public VoteOptionEntity setSiteid(Integer arg) {
		this.siteid = arg;
		return this;
	}

	public Integer getSubjectid() {
		return this.subjectid;
	}

	public VoteOptionEntity setSubjectid(Integer arg) {
		this.subjectid = arg;
		return this;
	}

	public String getOption() {
		return this.option;
	}

	public VoteOptionEntity setOption(String arg) {
		this.option = arg;
		return this;
	}

	public String getImage() {
		return this.image;
	}

	public VoteOptionEntity setImage(String arg) {
		this.image = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public VoteOptionEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}
}
