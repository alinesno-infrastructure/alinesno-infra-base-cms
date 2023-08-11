package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：dbsource 表备注：
 *
 * 字段：
 * - name：名称
 * - host：主机
 * - port：端口
 * - username：用户名
 * - password：密码
 * - dbname：数据库名称
 * - dbtablepre：表前缀
 * - charset：字符集
 *
 * @TableName("dbsource")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("dbsource")
public class DbsourceEntity extends InfraBaseEntity {

	// 字段

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
	 * 端口
	 */
	@TableField("port")
	private Integer port;

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
	 * 数据库名称
	 */
	@TableField("dbname")
	private String dbname;

	/**
	 * 表前缀
	 */
	@TableField("dbtablepre")
	private String dbtablepre;

	/**
	 * 字符集
	 */
	@TableField("charset")
	private String charset;

	// Getter and Setter methods

	public String getName() {
		return this.name;
	}

	public DbsourceEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getHost() {
		return this.host;
	}

	public DbsourceEntity setHost(String host) {
		this.host = host;
		return this;
	}

	public Integer getPort() {
		return this.port;
	}

	public DbsourceEntity setPort(Integer port) {
		this.port = port;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public DbsourceEntity setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return this.password;
	}

	public DbsourceEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getDbname() {
		return this.dbname;
	}

	public DbsourceEntity setDbname(String dbname) {
		this.dbname = dbname;
		return this;
	}

	public String getDbtablepre() {
		return this.dbtablepre;
	}

	public DbsourceEntity setDbtablepre(String dbtablepre) {
		this.dbtablepre = dbtablepre;
		return this;
	}

	public String getCharset() {
		return this.charset;
	}

	public DbsourceEntity setCharset(String charset) {
		this.charset = charset;
		return this;
	}
}
