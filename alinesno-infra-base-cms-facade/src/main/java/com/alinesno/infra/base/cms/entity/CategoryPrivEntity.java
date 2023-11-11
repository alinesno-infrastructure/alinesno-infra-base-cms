package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：category_priv 表备注：
 * 栏目权限实体类
 *
 * @TableName("category_priv")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("category_priv")
@Data
public class CategoryPrivEntity extends InfraBaseEntity {

	// fields

	/**
	 * 栏目ID
	 */
	@ColumnType(length=255)
	@ColumnComment("catid")
	@TableField("catid")
	private Integer catid;

	/**
	 * 站点ID
	 */
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 角色ID
	 */
	@ColumnType(length=255)
	@ColumnComment("roleid")
	@TableField("roleid")
	private Integer roleid;

	/**
	 * 是否管理员
	 */
	@ColumnType(length=255)
	@ColumnComment("isAdmin")
	@TableField("is_admin")
	private Integer isAdmin;

	/**
	 * 操作
	 */
	@ColumnType(length=255)
	@ColumnComment("行动")
	@TableField("action")
	private String action;
}
