package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SsoMembersEntity extends InfraBaseEntity {

	// fields
	/**
	 * 用户ID
	 */
	@TableField("uid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer uid;

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
	 * 随机数
	 */
	@TableField("random")
	@ColumnType(length=255)
	@ColumnComment("随机数")
	private String random;

	/**
	 * 电子邮箱
	 */
	@TableField("email")
	@ColumnType(length=255)
	@ColumnComment("电子邮箱")
	private String email;

	/**
	 * 注册IP
	 */
	@TableField("regip")
	@ColumnType(length=255)
	@ColumnComment("注册IP")
	private String regip;

	/**
	 * 注册日期
	 */
	@TableField("regdate")
	@ColumnType(length=255)
	@ColumnComment("注册日期")
	private Integer regdate;

	/**
	 * 最后登录IP
	 */
	@TableField("lastip")
	@ColumnType(length=255)
	@ColumnComment("最后登录IP")
	private String lastip;

	/**
	 * 最后登录日期
	 */
	@TableField("lastdate")
	@ColumnType(length=255)
	@ColumnComment("最后登录日期")
	private Integer lastdate;

	/**
	 * 应用名称
	 */
	@TableField("appname")
	@ColumnType(length=255)
	@ColumnComment("应用名称")
	private String appname;

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private String type;

	/**
	 * 头像
	 */
	@TableField("avatar")
	@ColumnType(length=255)
	@ColumnComment("头像")
	private Integer avatar;

	/**
	 * UC用户ID
	 */
	@TableField("ucuserid")
	@ColumnType(length=255)
	@ColumnComment("UC用户ID")
	private Integer ucuserid;
}
