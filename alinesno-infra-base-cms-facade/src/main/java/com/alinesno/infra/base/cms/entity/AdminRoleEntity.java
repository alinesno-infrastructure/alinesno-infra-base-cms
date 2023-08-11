package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：admin_role 表备注：
 * 管理员角色实体类
 *
 * @TableName("admin_role")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("admin_role")
public class AdminRoleEntity extends InfraBaseEntity {

	// fields

	/**
	 * 角色ID
	 */
	@Excel(name = "角色ID")
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 角色名称
	 */
	@Excel(name = "角色名称")
	@TableField("rolename")
	private String rolename;

	/**
	 * 描述
	 */
	@Excel(name = "描述")
	@TableField("description")
	private String description;

	/**
	 * 排序
	 */
	@Excel(name = "排序")
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 是否禁用
	 */
	@Excel(name = "是否禁用")
	@TableField("disabled")
	private Integer disabled;

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
	public AdminRoleEntity setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	/**
	 * 获取角色名称
	 *
	 * @return 角色名称
	 */
	public String getRolename() {
		return this.rolename;
	}

	/**
	 * 设置角色名称
	 *
	 * @param rolename 角色名称
	 * @return 当前实体对象
	 */
	public AdminRoleEntity setRolename(String rolename) {
		this.rolename = rolename;
		return this;
	}

	/**
	 * 获取描述
	 *
	 * @return 描述
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * 设置描述
	 *
	 * @param description 描述
	 * @return 当前实体对象
	 */
	public AdminRoleEntity setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * 获取排序
	 *
	 * @return 排序
	 */
	public Integer getListorder() {
		return this.listorder;
	}

	/**
	 * 设置排序
	 *
	 * @param listorder 排序
	 * @return 当前实体对象
	 */
	public AdminRoleEntity setListorder(Integer listorder) {
		this.listorder = listorder;
		return this;
	}

	/**
	 * 获取是否禁用
	 *
	 * @return 是否禁用
	 */
	public Integer getDisabled() {
		return this.disabled;
	}

	/**
	 * 设置是否禁用
	 *
	 * @param disabled 是否禁用
	 * @return 当前实体对象
	 */
	public AdminRoleEntity setDisabled(Integer disabled) {
		this.disabled = disabled;
		return this;
	}
}
