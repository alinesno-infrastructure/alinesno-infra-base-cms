package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：category_priv 表备注：
 * 栏目权限实体类
 *
 * @TableName("category_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("category_priv")
public class CategoryPrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 栏目ID
	 */
	@TableField("catid")
	private Integer catid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 角色ID
	 */
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 是否管理员
	 */
	@TableField("is_admin")
	private Integer isAdmin;

	/**
	 * 操作
	 */
	@TableField("action")
	private String action;

	// getter and setter methods

	public Integer getCatid() {
		return this.catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
