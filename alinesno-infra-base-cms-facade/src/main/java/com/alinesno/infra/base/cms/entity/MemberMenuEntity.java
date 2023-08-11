package com.alinesno.infra.base.cms.entity;

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
public class MemberMenuEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 名称
	 */
	@Excel(name = "名称")
	@TableField("name")
	private String name;

	/**
	 * 英文名称
	 */
	@Excel(name = "英文名称")
	@TableField("english_name")
	private String englishName;

	/**
	 * 父节点ID
	 */
	@Excel(name = "父节点ID")
	@TableField("parentid")
	private String parentId;

	/**
	 * M
	 */
	@Excel(name = "M")
	@TableField("m")
	private String m;

	/**
	 * C
	 */
	@Excel(name = "C")
	@TableField("c")
	private String c;

	/**
	 * A
	 */
	@Excel(name = "A")
	@TableField("a")
	private String a;

	/**
	 * 数据
	 */
	@Excel(name = "数据")
	@TableField("data")
	private String data;

	/**
	 * 排序
	 */
	@Excel(name = "排序")
	@TableField("listorder")
	private Integer listOrder;

	/**
	 * 显示
	 */
	@Excel(name = "显示")
	@TableField("display")
	private String display;

	/**
	 * 是否为URL
	 */
	@Excel(name = "是否为URL")
	@TableField("isurl")
	private String isUrl;

	/**
	 * URL
	 */
	@Excel(name = "URL")
	@TableField("url")
	private String url;

	// getter and setter
	public String getName() {
		return this.name;
	}

	public MemberMenuEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getEnglishName() {
		return englishName;
	}

	public MemberMenuEntity setEnglishName(String englishName) {
		this.englishName = englishName;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public MemberMenuEntity setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getM() {
		return this.m;
	}

	public MemberMenuEntity setM(String m) {
		this.m = m;
		return this;
	}

	public String getC() {
		return this.c;
	}

	public MemberMenuEntity setC(String c) {
		this.c = c;
		return this;
	}

	public String getA() {
		return this.a;
	}

	public MemberMenuEntity setA(String a) {
		this.a = a;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public MemberMenuEntity setData(String data) {
		this.data = data;
		return this;
	}

	public Integer getListOrder() {
		return this.listOrder;
	}

	public MemberMenuEntity setListOrder(Integer listOrder) {
		this.listOrder = listOrder;
		return this;
	}

	public String getDisplay() {
		return this.display;
	}

	public MemberMenuEntity setDisplay(String display) {
		this.display = display;
		return this;
	}

	public String getIsUrl() {
		return this.isUrl;
	}

	public MemberMenuEntity setIsUrl(String isUrl) {
		this.isUrl = isUrl;
		return this;
	}

	public String getUrl() {
		return this.url;
	}

	public MemberMenuEntity setUrl(String url) {
		this.url = url;
		return this;
	}
}
