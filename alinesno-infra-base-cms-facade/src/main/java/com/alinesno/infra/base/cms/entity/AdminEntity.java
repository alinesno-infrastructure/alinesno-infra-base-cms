package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 管理员实体类
 *
 * <p>数据表：admin</p>
 * <p>管理员信息</p>
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("admin")
public class AdminEntity extends InfraBaseEntity {

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length = 255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 密码
	 */
	@TableField("password")
	@ColumnType(length = 255)
	@ColumnComment("密码")
	private String password;

	/**
	 * 角色ID
	 */
	@TableField("roleid")
	@ColumnType
	@ColumnComment("角色ID")
	private Integer roleid;

	/**
	 * 加密
	 */
	@TableField("encrypt")
	@ColumnType(length = 255)
	@ColumnComment("加密")
	private String encrypt;

	/**
	 * 最后登录IP
	 */
	@TableField("lastloginip")
	@ColumnType(length = 255)
	@ColumnComment("最后登录IP")
	private String lastloginip;

	/**
	 * 最后登录时间
	 */
	@TableField("lastlogintime")
	@ColumnType
	@ColumnComment("最后登录时间")
	private Integer lastlogintime;

	/**
	 * 邮箱
	 */
	@TableField("email")
	@ColumnType(length = 255)
	@ColumnComment("邮箱")
	private String email;

	/**
	 * 真实姓名
	 */
	@TableField("realname")
	@ColumnType(length = 255)
	@ColumnComment("真实姓名")
	private String realname;

	/**
	 * 身份证
	 */
	@TableField("card")
	@ColumnType(length = 255)
	@ColumnComment("身份证")
	private String card;

	/**
	 * 语言
	 */
	@TableField("lang")
	@ColumnType(length = 255)
	@ColumnComment("语言")
	private String lang;

}
