package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_admin 表备注：
 *
 * SsoAdminEntity类是对应数据库表sso_admin的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_admin")
public class SsoAdminEntity extends InfraBaseEntity {

	// fields
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
	 * 加密
	 */
	@TableField("encrypt")
	private String encrypt;

	/**
	 * 是否超级管理员
	 */
	@TableField("issuper")
	private Integer issuper;

	/**
	 * 最后登录时间
	 */
	@TableField("lastlogin")
	private Integer lastlogin;

	/**
	 * IP
	 */
	@TableField("ip")
	private String ip;

	// getter and setter
	/**
	 * 获取用户名
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * 设置用户名
	 */
	public SsoAdminEntity setUsername(String username) {
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
	public SsoAdminEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * 获取加密
	 */
	public String getEncrypt() {
		return this.encrypt;
	}

	/**
	 * 设置加密
	 */
	public SsoAdminEntity setEncrypt(String encrypt) {
		this.encrypt = encrypt;
		return this;
	}

	/**
	 * 获取是否超级管理员
	 */
	public Integer getIssuper() {
		return this.issuper;
	}

	/**
	 * 设置是否超级管理员
	 */
	public SsoAdminEntity setIssuper(Integer issuper) {
		this.issuper = issuper;
		return this;
	}

	/**
	 * 获取最后登录时间
	 */
	public Integer getLastlogin() {
		return this.lastlogin;
	}

	/**
	 * 设置最后登录时间
	 */
	public SsoAdminEntity setLastlogin(Integer lastlogin) {
		this.lastlogin = lastlogin;
		return this;
	}

	/**
	 * 获取IP
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 * 设置IP
	 */
	public SsoAdminEntity setIp(String ip) {
		this.ip = ip;
		return this;
	}
}
