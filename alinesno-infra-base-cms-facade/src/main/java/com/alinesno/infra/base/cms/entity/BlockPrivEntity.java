package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：block_priv 表备注：
 * 区块权限实体类
 *
 * @TableName("block_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("block_priv")
public class BlockPrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 角色ID
	 */
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 区块ID
	 */
	@TableField("blockid")
	private Integer blockid;

	// getter and setter methods

	public Integer getRoleid() {
		return this.roleid;
	}

	public BlockPrivEntity setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public BlockPrivEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public Integer getBlockid() {
		return this.blockid;
	}

	public BlockPrivEntity setBlockid(Integer blockid) {
		this.blockid = blockid;
		return this;
	}
}
