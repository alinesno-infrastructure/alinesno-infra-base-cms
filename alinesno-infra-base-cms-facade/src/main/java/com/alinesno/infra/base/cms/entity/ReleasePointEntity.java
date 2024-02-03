package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class ReleasePointEntity extends InfraBaseEntity {

	// fields

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
	 * 端口
	 */
	@TableField("port")
	@ColumnType(length=255)
	@ColumnComment("端口")
	private String port;

	/**
	 * 是否启用被动模式
	 */
	@TableField("pasv")
	@ColumnType(length=255)
	@ColumnComment("是否启用被动模式")
	private Integer pasv;

	/**
	 * 是否启用SSL
	 */
	@TableField("ssl")
	@ColumnType(length=255)
	@ColumnComment("是否启用SSL")
	private Integer ssl;

	/**
	 * 路径
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("路径")
	private String path;
}
