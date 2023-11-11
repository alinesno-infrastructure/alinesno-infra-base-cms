package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：block_priv 表备注：
 * 区块权限实体类
 *
 * @TableName("block_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("block_priv")
public class BlockPrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 角色ID
	 */
	@TableField("roleid")
	@ColumnType
	@ColumnComment("角色ID")
	private Integer roleid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 区块ID
	 */
	@TableField("blockid")
	@ColumnType
	@ColumnComment("区块ID")
	private Integer blockid;
}
