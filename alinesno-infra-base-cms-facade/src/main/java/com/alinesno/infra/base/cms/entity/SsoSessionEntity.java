package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_session 表备注：
 *
 * SsoSessionEntity类是对应数据库表sso_session的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_session")
public class SsoSessionEntity extends InfraBaseEntity {

	// fields
	@TableField("sessionid")
	private String sessionid; // sessionid

	@TableField("userid")
	private Integer userid; // userid

	@TableField("ip")
	private String ip; // ip

	@TableField("lastvisit")
	private Integer lastvisit; // lastvisit

	@TableField("roleid")
	private Integer roleid; // roleid

	@TableField("groupid")
	private Integer groupid; // groupid

	@TableField("m")
	private String m; // m

	@TableField("c")
	private String c; // c

	@TableField("a")
	private String a; // a

	@TableField("data")
	private String data; // data

	// getter and setter
	public String getSessionid() {
		return this.sessionid;
	}

	public SsoSessionEntity setSessionid(String sessionid) {
		this.sessionid = sessionid;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public SsoSessionEntity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	public String getIp() {
		return this.ip;
	}

	public SsoSessionEntity setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public Integer getLastvisit() {
		return this.lastvisit;
	}

	public SsoSessionEntity setLastvisit(Integer lastvisit) {
		this.lastvisit = lastvisit;
		return this;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public SsoSessionEntity setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	public Integer getGroupid() {
		return this.groupid;
	}

	public SsoSessionEntity setGroupid(Integer groupid) {
		this.groupid = groupid;
		return this;
	}

	public String getM() {
		return this.m;
	}

	public SsoSessionEntity setM(String m) {
		this.m = m;
		return this;
	}

	public String getC() {
		return this.c;
	}

	public SsoSessionEntity setC(String c) {
		this.c = c;
		return this;
	}

	public String getA() {
		return this.a;
	}

	public SsoSessionEntity setA(String a) {
		this.a = a;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public SsoSessionEntity setData(String data) {
		this.data = data;
		return this;
	}
}
