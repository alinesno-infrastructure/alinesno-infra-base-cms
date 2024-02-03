package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：member_menu 表备注：
 * 会员菜单实体类
 *
 * @TableName("member_menu")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member_menu")
@Data
public class MemberMenuEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 名称
	 */
	@Excel(name = "名称")
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 英文名称
	 */
	@Excel(name = "英文名称")
	@TableField("english_name")
	@ColumnType(length=255)
	@ColumnComment("英文名称")
	private String englishName;

	/**
	 * 父节点ID
	 */
	@Excel(name = "父节点ID")
	@TableField("parentid")
	@ColumnType(length=255)
	@ColumnComment("父节点ID")
	private String parentId;

	/**
	 * M
	 */
	@Excel(name = "M")
	@TableField("m")
	@ColumnType(length=255)
	@ColumnComment("M")
	private String m;

	/**
	 * C
	 */
	@Excel(name = "C")
	@TableField("c")
	@ColumnType(length=255)
	@ColumnComment("C")
	private String c;

	/**
	 * A
	 */
	@Excel(name = "A")
	@TableField("a")
	@ColumnType(length=255)
	@ColumnComment("A")
	private String a;

	/**
	 * 数据
	 */
	@Excel(name = "数据")
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 排序
	 */
	@Excel(name = "排序")
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listOrder;

	/**
	 * 显示
	 */
	@Excel(name = "显示")
	@TableField("display")
	@ColumnType(length=255)
	@ColumnComment("显示")
	private String display;

	/**
	 * 是否为URL
	 */
	@Excel(name = "是否为URL")
	@TableField("isurl")
	@ColumnType(length=255)
	@ColumnComment("是否为URL")
	private String isUrl;

	/**
	 * URL
	 */
	@Excel(name = "URL")
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("URL")
	private String url;
}
