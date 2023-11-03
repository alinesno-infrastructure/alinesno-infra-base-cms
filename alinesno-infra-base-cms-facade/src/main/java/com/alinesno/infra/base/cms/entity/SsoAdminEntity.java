package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SsoAdminEntity extends InfraBaseEntity {

	// fields
	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 密码
	 */
	@TableField("password")
	@ColumnType(length=255)
	@ColumnComment("密码")
	private String password;

	/**
	 * 加密
	 */
	@TableField("encrypt")
	@ColumnType(length=255)
	@ColumnComment("加密")
	private String encrypt;

	/**
	 * 是否超级管理员
	 */
	@TableField("issuper")
	@ColumnType(length=255)
	@ColumnComment("是否超级管理员")
	private Integer issuper;

	/**
	 * 最后登录时间
	 */
	@TableField("lastlogin")
	@ColumnType(length=255)
	@ColumnComment("最后登录时间")
	private Integer lastlogin;

	/**
	 * IP
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("IP")
	private String ip;
}
