package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： vote_data 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("vote_data")
public class VoteDataEntity extends InfraBaseEntity {

	// fields
	@TableField("userid")
	private Integer userid;

	@TableField("username")
	private String username;

	@TableField("subjectid")
	private Integer subjectid;

	@TableField("time")
	private Integer time;

	@TableField("ip")
	private String ip;

	@TableField("data")
	private String data;

	@TableField("userinfo")
	private String userinfo;

	// getter and setter
	public Integer getUserid() {
		return this.userid;
	}

	public VoteDataEntity setUserid(Integer arg) {
		this.userid = arg;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public VoteDataEntity setUsername(String arg) {
		this.username = arg;
		return this;
	}

	public Integer getSubjectid() {
		return this.subjectid;
	}

	public VoteDataEntity setSubjectid(Integer arg) {
		this.subjectid = arg;
		return this;
	}

	public Integer getTime() {
		return this.time;
	}

	public VoteDataEntity setTime(Integer arg) {
		this.time = arg;
		return this;
	}

	public String getIp() {
		return this.ip;
	}

	public VoteDataEntity setIp(String arg) {
		this.ip = arg;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public VoteDataEntity setData(String arg) {
		this.data = arg;
		return this;
	}

	public String getUserinfo() {
		return this.userinfo;
	}

	public VoteDataEntity setUserinfo(String arg) {
		this.userinfo = arg;
		return this;
	}
}
