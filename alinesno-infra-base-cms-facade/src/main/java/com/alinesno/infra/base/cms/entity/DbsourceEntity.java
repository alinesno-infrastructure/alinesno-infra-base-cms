package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@TableName("dbsource")
@Data
public class DbsourceEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 主机
	 */
	@TableField("host")
	@ColumnType(length=255)
	@ColumnComment("主机")
	private String host;

	/**
	 * 端口
	 */
	@TableField("port")
	@ColumnType(length=255)
	@ColumnComment("端口")
	private Integer port;

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
	 * 数据库名称
	 */
	@TableField("dbname")
	@ColumnType(length=255)
	@ColumnComment("数据库名称")
	private String dbname;

	/**
	 * 表前缀
	 */
	@TableField("dbtablepre")
	@ColumnType(length=20)
	@ColumnComment("表前缀")
	private String dbtablepre;

	/**
	 * 字符集
	 */
	@TableField("charset")
	@ColumnType(length=4)
	@ColumnComment("字符集")
	private String charset;
}
