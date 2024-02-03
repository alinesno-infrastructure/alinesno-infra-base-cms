package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：linkage 表备注：
 *
 * 字段：
 * - linkageid：联动ID
 * - name：名称
 * - style：样式
 * - parentid：父级ID
 * - child：是否有子级
 * - arrchildid：所有子级ID
 * - keyid：关键字ID
 * - listorder：排序
 * - description：描述
 * - setting：设置
 * - siteid：站点ID
 *
 * @TableName("linkage")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("linkage")
@Data
public class LinkageEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 联动ID
	 */
	@TableField("linkageid")
	@ColumnType(length=255)
	@ColumnComment("联动ID")
	private Integer linkageid;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 样式
	 */
	@TableField("style")
	@ColumnType(length=255)
	@ColumnComment("样式")
	private String style;

	/**
	 * 父级ID
	 */
	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("父级ID")
	private Integer parentid;

	/**
	 * 是否有子级
	 */
	@TableField("child")
	@ColumnType(length=255)
	@ColumnComment("是否有子级")
	private Integer child;

	/**
	 * 所有子级ID
	 */
	@TableField("arrchildid")
	@ColumnType(length=255)
	@ColumnComment("所有子级ID")
	private String arrchildid;

	/**
	 * 关键字ID
	 */
	@TableField("keyid")
	@ColumnType(length=255)
	@ColumnComment("关键字ID")
	private Integer keyid;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 描述
	 */
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 设置
	 */
	@TableField("setting")
	@ColumnType(length=255)
	@ColumnComment("设置")
	private String setting;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;
}
