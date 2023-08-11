package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：release_point 表备注：
 *
 * 数据表 release_point 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("release_point")
public class ReleasePointEntity extends InfraBaseEntity {

	// fields

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 主机
	 */
	@TableField("host")
	private String host;

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
	 * 端口
	 */
	@TableField("port")
	private String port;

	/**
	 * 是否启用被动模式
	 */
	@TableField("pasv")
	private Integer pasv;

	/**
	 * 是否启用SSL
	 */
	@TableField("ssl")
	private Integer ssl;

	/**
	 * 路径
	 */
	@TableField("path")
	private String path;

	// getter and setter methods

	/**
	 * 获取名称
	 *
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置名称
	 *
	 * @param name 名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取主机
	 *
	 * @return 主机
	 */
	public String getHost() {
		return this.host;
	}

	/**
	 * 设置主机
	 *
	 * @param host 主机
	 */
	public void setHost(String host) {
		this.host = host;
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
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取端口
	 *
	 * @return 端口
	 */
	public String getPort() {
		return this.port;
	}

	/**
	 * 设置端口
	 *
	 * @param port 端口
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * 获取是否启用被动模式
	 *
	 * @return 是否启用被动模式
	 */
	public Integer getPasv() {
		return this.pasv;
	}

	/**
	 * 设置是否启用被动模式
	 *
	 * @param pasv 是否启用被动模式
	 */
	public void setPasv(Integer pasv) {
		this.pasv = pasv;
	}

	/**
	 * 获取是否启用SSL
	 *
	 * @return 是否启用SSL
	 */
	public Integer getSsl() {
		return this.ssl;
	}

	/**
	 * 设置是否启用SSL
	 *
	 * @param ssl 是否启用SSL
	 */
	public void setSsl(Integer ssl) {
		this.ssl = ssl;
	}

	/**
	 * 获取路径
	 *
	 * @return 路径
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * 设置路径
	 *
	 * @param path 路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
}
