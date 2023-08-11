package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_applications 表备注：
 *
 * SsoApplicationsEntity类是对应数据库表sso_applications的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_applications")
public class SsoApplicationsEntity extends InfraBaseEntity {

	// fields
	/**
	 * 应用ID
	 */
	@TableField("appid")
	private Integer appid;

	/**
	 * 类型
	 */
	@TableField("type")
	private String type;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 授权密钥
	 */
	@TableField("authkey")
	private String authkey;

	/**
	 * IP
	 */
	@TableField("ip")
	private String ip;

	/**
	 * API文件名
	 */
	@TableField("apifilename")
	private String apifilename;

	/**
	 * 字符集
	 */
	@TableField("charset")
	private String charset;

	/**
	 * 同步登录
	 */
	@TableField("synlogin")
	private Integer synlogin;

	// getter and setter
	/**
	 * 获取应用ID
	 */
	public Integer getAppid() {
		return this.appid;
	}

	/**
	 * 设置应用ID
	 */
	public SsoApplicationsEntity setAppid(Integer appid) {
		this.appid = appid;
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
	public SsoApplicationsEntity setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * 获取名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置名称
	 */
	public SsoApplicationsEntity setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 获取URL
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * 设置URL
	 */
	public SsoApplicationsEntity setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * 获取授权密钥
	 */
	public String getAuthkey() {
		return this.authkey;
	}

	/**
	 * 设置授权密钥
	 */
	public SsoApplicationsEntity setAuthkey(String authkey) {
		this.authkey = authkey;
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
	public SsoApplicationsEntity
	setIp(String ip) {
		this.ip = ip;
		return this;
	}

	/**
	 * 获取API文件名
	 */
	public String getApifilename() {
		return this.apifilename;
	}

	/**
	 * 设置API文件名
	 */
	public SsoApplicationsEntity setApifilename(String apifilename) {
		this.apifilename = apifilename;
		return this;
	}

	/**
	 * 获取字符集
	 */
	public String getCharset() {
		return this.charset;
	}

	/**
	 * 设置字符集
	 */
	public SsoApplicationsEntity setCharset(String charset) {
		this.charset = charset;
		return this;
	}

	/**
	 * 获取同步登录
	 */
	public Integer getSynlogin() {
		return this.synlogin;
	}

	/**
	 * 设置同步登录
	 */
	public SsoApplicationsEntity setSynlogin(Integer synlogin) {
		this.synlogin = synlogin;
		return this;
	}
}