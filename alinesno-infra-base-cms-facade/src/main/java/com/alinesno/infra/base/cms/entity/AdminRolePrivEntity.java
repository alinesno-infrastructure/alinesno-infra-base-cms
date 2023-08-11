package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：admin_role_priv 表备注：
 * 管理员角色权限实体类
 *
 * @TableName("admin_role_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("admin_role_priv")
public class AdminRolePrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 角色ID
	 */
	@Excel(name = "角色ID")
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 模块
	 */
	@Excel(name = "模块")
	@TableField("m")
	private String m;

	/**
	 * 控制器
	 */
	@Excel(name = "控制器")
	@TableField("c")
	private String c;

	/**
	 * 方法
	 */
	@Excel(name = "方法")
	@TableField("a")
	private String a;

	/**
	 * 数据
	 */
	@Excel(name = "数据")
	@TableField("data")
	private String data;

	/**
	 * 站点ID
	 */
	@Excel(name = "站点ID")
	@TableField("siteid")
	private Integer siteid;

	// getter and setter

	/**
	 * 获取角色ID
	 *
	 * @return 角色ID
	 */
	public Integer getRoleid() {
		return this.roleid;
	}

	/**
	 * 设置角色ID
	 *
	 * @param roleid 角色ID
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	/**
	 * 获取模块
	 *
	 * @return 模块
	 */
	public String getM() {
		return this.m;
	}

	/**
	 * 设置模块
	 *
	 * @param m 模块
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setM(String m) {
		this.m = m;
		return this;
	}

	/**
	 * 获取控制器
	 *
	 * @return 控制器
	 */
	public String getC() {
		return this.c;
	}

	/**
	 * 设置控制器
	 *
	 * @param c 控制器
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setC(String c) {
		this.c = c;
		return this;
	}

	/**
	 * 获取方法
	 *
	 * @return 方法
	 */
	public String getA() {
		return this.a;
	}

	/**
	 * 设置方法
	 *
	 * @param a 方法
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setA(String a) {
		this.a = a;
		return this;
	}

	/**
	 * 获取数据
	 *
	 * @return 数据
	 */
	public String getData() {
		return this.data;
	}

	/**
	 * 设置数据
	 *
	 * @param data 数据
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setData(String data) {
		this.data = data;
		return this;
	}

	/**
	 * 获取站点ID
	 *
	 * @return 站点ID
	 */
	public Integer getSiteid() {
		return this.siteid;
	}

	/**
	 * 设置站点ID
	 *
	 * @param siteid 站点ID
	 * @return 当前实体对象
	 */
	public AdminRolePrivEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}
}
