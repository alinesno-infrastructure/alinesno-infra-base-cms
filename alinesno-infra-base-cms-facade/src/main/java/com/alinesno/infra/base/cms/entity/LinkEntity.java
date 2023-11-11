package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：link 表备注：
 *
 * 字段：
 * - linkid：链接ID
 * - typeid：类型ID
 * - linktype：链接类型
 * - name：名称
 * - url：链接地址
 * - logo：logo
 * - introduce：介绍
 * - username：用户名
 * - listorder：排序
 * - elite：是否精华
 * - passed：是否通过审核
 *
 * @TableName("link")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("link")
@Data
public class LinkEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 链接ID
	 */
	@TableField("linkid")
	@ColumnType(length=255)
	@ColumnComment("链接ID")
	private Integer linkid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("类型ID")
	private Integer typeid;

	/**
	 * 链接类型
	 */
	@TableField("linktype")
	@ColumnType(length=255)
	@ColumnComment("链接类型")
	private Integer linktype;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 链接地址
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("链接地址")
	private String url;

	/**
	 * logo
	 */
	@TableField("logo")
	@ColumnType(length=255)
	@ColumnComment("logo")
	private String logo;

	/**
	 * 介绍
	 */
	@TableField("introduce")
	@ColumnType(length=255)
	@ColumnComment("介绍")
	private String introduce;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 是否精华
	 */
	@TableField("elite")
	@ColumnType(length=255)
	@ColumnComment("是否精华")
	private Integer elite;

	/**
	 * 是否通过审核
	 */
	@TableField("passed")
	@ColumnType(length=255)
	@ColumnComment("是否通过审核")
	private Integer passed;
}
