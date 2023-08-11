package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 管理员实体类
 *
 * <p>数据表：admin</p>
 * <p>管理员信息</p>
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("admin")
public class AdminEntity extends InfraBaseEntity {

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

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
	 * 角色ID
	 */
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 加密
	 */
	@TableField("encrypt")
	private String encrypt;

	/**
	 * 最后登录IP
	 */
	@TableField("lastloginip")
	private String lastloginip;

	/**
	 * 最后登录时间
	 */
	@TableField("lastlogintime")
	private Integer lastlogintime;

	/**
	 * 邮箱
	 */
	@TableField("email")
	private String email;

	/**
	 * 真实姓名
	 */
	@TableField("realname")
	private String realname;

	/**
	 * 身份证
	 */
	@TableField("card")
	private String card;

	/**
	 * 语言
	 */
	@TableField("lang")
	private String lang;

	/**
	 * 获取用户ID
	 *
	 * @return 用户ID
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * 设置用户ID
	 *
	 * @param userid 用户ID
	 * @return 当前实例对象
	 */
	public AdminEntity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	/**
	 * 获取用户名
	 *
	 * @return 用户名
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * 设置用户名
	 *
	 * @param username 用户名
	 * @return 当前实例对象
	 */
	public AdminEntity setUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * 获取密码
	 *
	 * @return 密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * 设置密码
	 *
	 * @param password 密码
	 * @return 当前实例对象
	 */
	public AdminEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * 获取角色ID
	 *
	 * @return 角色ID
	 */
	public Integer getRoleid() {
		return this.roleid;
	}

	/**
	 * 设置角色ID
	 *
	 * @param roleid 角色ID
	 * @return 当前实例对象
	 */
	public AdminEntity setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	/**
	 * 获取加密
	 *
	 * @return 加密
	 */
	public String getEncrypt() {
		return this.encrypt;
	}

	/**
	 * 设置加密
	 *
	 * @param encrypt 加密
	 * @return 当前实例对象
	 */
	public AdminEntity setEncrypt(String encrypt) {
		this.encrypt = encrypt;
		return this;
	}

	/**
	 * 获取最后登录IP
	 *
	 * @return 最后登录IP
	 */
	public String getLastloginip() {
		return this.lastloginip;
	}

	/**
	 * 设置最后登录IP
	 *
	 * @param lastloginip 最后登录IP
	 * @return 当前实例对象
	 */
	public AdminEntity setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
		return this;
	}

	/**
	 * 获取最后登录时间
	 *
	 * @return 最后登录时间
	 */
	public Integer getLastlogintime() {
		return this.lastlogintime;
	}

	/**
	 * 设置最后登录时间
	 *
	 * @param lastlogintime 最后登录时间
	 * @return 当前实例对象
	 */
	public AdminEntity setLastlogintime(Integer lastlogintime) {
		this.lastlogintime = lastlogintime;
		return this;
	}

	/**
	 * 获取邮箱
	 *
	 * @return 邮箱
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 设置邮箱
	 *
	 * @param email 邮箱
	 * @return 当前实例对象
	 */
	public AdminEntity setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * 获取真实姓名
	 *
	 * @return 真实姓名
	 */
	public String getRealname() {
		return this.realname;
	}

	/**
	 * 设置真实姓名
	 *
	 * @param realname 真实姓名
	 * @return 当前实例对象
	 */
	public AdminEntity setRealname(String realname) {
		this.realname = realname;
		return this;
	}

	/**
	 * 获取身份证
	 *
	 * @return 身份证
	 */
	public String getCard() {
		return this.card;
	}

	/**
	 * 设置身份证
	 *
	 * @param card 身份证
	 * @return 当前实例对象
	 */
	public AdminEntity setCard(String card) {
		this.card = card;
		return this;
	}

	/**
	 * 获取语言
	 *
	 * @return 语言
	 */
	public String getLang() {
		return this.lang;
	}

	/**
	 * 设置语言
	 *
	 * @param lang 语言
	 * @return 当前实例对象
	 */
	public AdminEntity setLang(String lang) {
		this.lang = lang;
		return this;
	}
}
