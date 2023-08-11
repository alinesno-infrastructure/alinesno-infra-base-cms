package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_members 表备注：
 *
 * SsoMembersEntity类是对应数据库表sso_members的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_members")
public class SsoMembersEntity extends InfraBaseEntity {

	// fields
	/**
	 * 用户ID
	 */
	@TableField("uid")
	private Integer uid;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 密码
	 */
	@TableField("password")
	private String password;

	/**
	 * 随机数
	 */
	@TableField("random")
	private String random;

	/**
	 * 电子邮箱
	 */
	@TableField("email")
	private String email;

	/**
	 * 注册IP
	 */
	@TableField("regip")
	private String regip;

	/**
	 * 注册日期
	 */
	@TableField("regdate")
	private Integer regdate;

	/**
	 * 最后登录IP
	 */
	@TableField("lastip")
	private String lastip;

	/**
	 * 最后登录日期
	 */
	@TableField("lastdate")
	private Integer lastdate;

	/**
	 * 应用名称
	 */
	@TableField("appname")
	private String appname;

	/**
	 * 类型
	 */
	@TableField("type")
	private String type;

	/**
	 * 头像
	 */
	@TableField("avatar")
	private Integer avatar;

	/**
	 * UC用户ID
	 */
	@TableField("ucuserid")
	private Integer ucuserid;

	// getter and setter
	/**
	 * 获取用户ID
	 */
	public Integer getUid() {
		return this.uid;
	}

	/**
	 * 设置用户ID
	 */
	public SsoMembersEntity setUid(Integer uid) {
		this.uid = uid;
		return this;
	}

	/**
	 * 获取用户名
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * 设置用户名
	 */
	public SsoMembersEntity setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * 获取密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 设置密码
	 */
	public SsoMembersEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * 获取随机数
	 */
	public String getRandom() {
		return this.random;
	}

	/**
	 * 设置随机数
	 */
	public SsoMembersEntity setRandom(String random) {
		this.random = random;
		return this;
	}

	/**
	 * 获取电子邮箱
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 设置电子邮箱
	 */
	public SsoMembersEntity setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * 获取注册IP
	 */
	public String getRegip() {
		return this.regip;
	}

	/**
	 * 设置注册IP
	 */
	public SsoMembersEntity setRegip(String regip) {
		this.regip = regip;
		return this;
	}

	/**
	 * 获取注册日期
	 */
	public Integer getRegdate() {
		return this.regdate;
	}

	/**
	 * 设置注册日期
	 */
	public SsoMembersEntity setRegdate(Integer regdate) {
		this.regdate = regdate;
		return this;
	}

	/**
	 * 获取最后登录IP
	 */
	public String getLastip() {
		return this.lastip;
	}

	/**
	 * 设置最后登录IP
	 */
	public SsoMembersEntity setLastip(String lastip) {
		this.lastip = lastip;
		return this;
	}

	/**
	 * 获取最后登录日期
	 */
	public Integer getLastdate() {
		return this.lastdate;
	}

	/**
	 * 设置最后登录日期
	 */
	public SsoMembersEntity setLastdate(Integer lastdate) {
		this.lastdate = lastdate;
		return this;
	}

	/**
	 * 获取应用名称
	 */
	public String getAppname() {
		return this.appname;
	}

	/**
	 * 设置应用名称
	 */
	public SsoMembersEntity setAppname(String appname) {
		this.appname = appname;
		return this;
	}

	/**
	 * 获取类型
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * 设置类型
	 */
	public SsoMembersEntity setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * 获取头像
	 */
	public Integer getAvatar() {
		return this.avatar;
	}

	/**
	 * 设置头像
	 */
	public SsoMembersEntity setAvatar(Integer avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * 获取UC用户ID
	 */
	public Integer getUcuserid() {
		return this.ucuserid;
	}

	/**
	 * 设置UC用户ID
	 */
	public SsoMembersEntity setUcuserid(Integer ucuserid) {
		this.ucuserid = ucuserid;
		return this;
	}
}
