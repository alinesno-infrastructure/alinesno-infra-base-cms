package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：admin_role 表备注：
 * 管理员角色实体类
 *
 * @TableName("admin_role")
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("admin_role")
public class AdminRoleEntity extends InfraBaseEntity {

	/**
	 * 角色ID
	 */
	@TableField("roleid")
	@ColumnType
	@ColumnComment("角色ID")
	@Excel(name = "角色ID")
	private Integer roleid;

	/**
	 * 角色名称
	 */
	@TableField("rolename")
	@ColumnType(length = 255)
	@ColumnComment("角色名称")
	@Excel(name = "角色名称")
	private String rolename;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length = 255)
	@ColumnComment("描述")
	@Excel(name = "描述")
	private String description;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType
	@ColumnComment("排序")
	@Excel(name = "排序")
	private Integer listorder;

	/**
	 * 是否禁用
	 */
	@TableField("disabled")
	@ColumnType
	@ColumnComment("是否禁用")
	@Excel(name = "是否禁用")
	private Integer disabled;
}
