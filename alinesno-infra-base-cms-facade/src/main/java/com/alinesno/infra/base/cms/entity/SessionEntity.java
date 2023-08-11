package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：session 表备注：
 *
 * 数据表 session 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("session")
public class SessionEntity extends InfraBaseEntity {

	// fields

	/**
	 * sessionid
	 */
	@TableField("sessionid")
	private String sessionid;

	/**
	 * userid
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * ip
	 */
	@TableField("ip")
	private String ip;

	/**
	 * lastvisit
	 */
	@TableField("lastvisit")
	private Integer lastvisit;

	/**
	 * roleid
	 */
	@TableField("roleid")
	private Integer roleid;

	/**
	 * groupid
	 */
	@TableField("groupid")
	private Integer groupid;

	/**
	 * m
	 */
	@TableField("m")
	private String m;

	/**
	 * c
	 */
	@TableField("c")
	private String c;

	/**
	 * a
	 */
	@TableField("a")
	private String a;

	/**
	 * data
	 */
	@TableField("data")
	private String data;

	// getter and setter methods

	/**
	 * 获取sessionid
	 *
	 * @return sessionid
	 */
	public String getSessionid() {
		return this.sessionid;
	}

	/**
	 * 设置sessionid
	 *
	 * @param sessionid sessionid
	 */
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	/**
	 * 获取userid
	 *
	 * @return userid
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * 设置userid
	 *
	 * @param userid userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * 获取ip
	 *
	 * @return ip
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 * 设置ip
	 *
	 * @param ip ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取lastvisit
	 *
	 * @return lastvisit
	 */
	public Integer getLastvisit() {
		return this.lastvisit;
	}

	/**
	 * 设置lastvisit
	 *
	 * @param lastvisit lastvisit
	 */
	public void setLastvisit(Integer lastvisit) {
		this.lastvisit = lastvisit;
	}

	/**
	 * 获取roleid
	 *
	 * @return roleid
	 */
	public Integer getRoleid() {
		return this.roleid;
	}

	/**
	 * 设置roleid
	 *
	 * @param roleid roleid
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	/**
	 * 获取groupid
	 *
	 * @return groupid
	 */
	public Integer getGroupid() {
		return this.groupid;
	}

	/**
	 * 设置groupid
	 *
	 * @param groupid groupid
	 */
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	/**
	 * 获取m
	 *
	 * @return m
	 */
	public String getM() {
		return this.m;
	}

	/**
	 * 设置m
	 *
	 * @param m m
	 */
	public void setM(String m) {
		this.m = m;
	}

	/**
	 * 获取c
	 *
	 * @return c
	 */
	public String getC() {
		return this.c;
	}

	/**
	 * 设置c
	 *
	 * @param c c
	 */
	public void setC(String c) {
		this.c = c;
	}

	/**
	 * 获取a
	 *
	 * @return a
	 */
	public String getA() {
		return this.a;
	}

	/**
	 * 设置a
	 *
	 * @param a a
	 */
	public void setA(String a) {
		this.a = a;
	}

	/**
	 * 获取data
	 *
	 * @return data
	 */
	public String getData() {
		return this.data;
	}

	/**
	 * 设置data
	 *
	 * @param data data
	 */
	public void setData(String data) {
		this.data = data;
	}
}
