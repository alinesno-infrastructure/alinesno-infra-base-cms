package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SsoApplicationsEntity extends InfraBaseEntity {

	// fields
	/**
	 * 应用ID
	 */
	@TableField("appid")
	@ColumnType(length=255)
	@ColumnComment("应用ID")
	private Integer appid;

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private String type;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * URL
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("URL")
	private String url;

	/**
	 * 授权密钥
	 */
	@TableField("authkey")
	@ColumnType(length=255)
	@ColumnComment("授权密钥")
	private String authkey;

	/**
	 * IP
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("IP")
	private String ip;

	/**
	 * API文件名
	 */
	@TableField("apifilename")
	@ColumnType(length=255)
	@ColumnComment("API文件名")
	private String apifilename;

	/**
	 * 字符集
	 */
	@TableField("charset")
	@ColumnType(length=255)
	@ColumnComment("字符集")
	private String charset;

	/**
	 * 同步登录
	 */
	@TableField("synlogin")
	@ColumnType(length=255)
	@ColumnComment("同步登录")
	private Integer synlogin;
}
