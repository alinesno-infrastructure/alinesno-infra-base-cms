package com.alinesno.infra.base.cms.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：admin_role_priv 表备注：
 * 管理员角色权限实体类
 *
 * @TableName("admin_role_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("admin_role_priv")
public class AdminRolePrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 角色ID
	 */
	@Excel(name = "角色ID")
	@TableField("roleid")
	@ColumnType(length = 11)
	@ColumnComment("角色ID")
	private Integer roleid;

	/**
	 * 模块
	 */
	@Excel(name = "模块")
	@TableField("m")
	@ColumnType(length = 50)
	@ColumnComment("模块")
	private String m;

	/**
	 * 控制器
	 */
	@Excel(name = "控制器")
	@TableField("c")
	@ColumnType(length = 50)
	@ColumnComment("控制器")
	private String c;

	/**
	 * 方法
	 */
	@Excel(name = "方法")
	@TableField("a")
	@ColumnType(length = 50)
	@ColumnComment("方法")
	private String a;

	/**
	 * 数据
	 */
	@Excel(name = "数据")
	@TableField("data")
	@ColumnType(length = 100)
	@ColumnComment("数据")
	private String data;

	/**
	 * 站点ID
	 */
	@Excel(name = "站点ID")
	@TableField("siteid")
	@ColumnType(length = 11)
	@ColumnComment("站点ID")
	private Integer siteid;

}

