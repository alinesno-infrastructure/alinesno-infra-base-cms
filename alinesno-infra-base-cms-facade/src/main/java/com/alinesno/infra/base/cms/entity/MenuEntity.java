package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：menu 表备注：
 * 菜单实体类
 *
 * @TableName("menu")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("menu")
public class MenuEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 菜单名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 父菜单ID
	 */
	@TableField("parentid")
	private Integer parentId;

	/**
	 * 模块名
	 */
	@TableField("m")
	private String m;

	/**
	 * 控制器名
	 */
	@TableField("c")
	private String c;

	/**
	 * 方法名
	 */
	@TableField("a")
	private String a;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listOrder;

	/**
	 * 是否显示（0：不显示；1：显示）
	 */
	@TableField("display")
	private String display;

	/**
	 * 项目1
	 */
	@TableField("project1")
	private Integer project1;

	/**
	 * 项目2
	 */
	@TableField("project2")
	private Integer project2;

	/**
	 * 项目3
	 */
	@TableField("project3")
	private Integer project3;

	/**
	 * 项目4
	 */
	@TableField("project4")
	private Integer project4;

	/**
	 * 项目5
	 */
	@TableField("project5")
	private Integer project5;

	// getter and setter
	public String getName() {
		return this.name;
	}

	public MenuEntity setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public MenuEntity setParentId(Integer parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getM() {
		return this.m;
	}

	public MenuEntity setM(String m) {
		this.m = m;
		return this;
	}

	public String getC() {
		return this.c;
	}

	public MenuEntity setC(String c) {
		this.c = c;
		return this;
	}

	public String getA() {
		return this.a;
	}

	public MenuEntity setA(String a) {
		this.a = a;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public MenuEntity setData(String data) {
		this.data = data;
		return this;
	}

	public Integer getListOrder() {
		return this.listOrder;
	}

	public MenuEntity setListOrder(Integer listOrder) {
		this.listOrder = listOrder;
		return this;
	}

	public String getDisplay() {
		return this.display;
	}

	public MenuEntity setDisplay(String display) {
		this.display = display;
		return this;
	}

	public Integer getProject1() {
		return this.project1;
	}

	public MenuEntity setProject1(Integer project1) {
		this.project1 = project1;
		return this;
	}

	public Integer getProject2() {
		return this.project2;
	}

	public MenuEntity setProject2(Integer project2) {
		this.project2 = project2;
		return this;
	}

	public Integer getProject3() {
		return this.project3;
	}

	public MenuEntity setProject3(Integer project3) {
		this.project3 = project3;
		return this;
	}

	public Integer getProject4() {
		return this.project4;
	}

	public MenuEntity setProject4(Integer project4) {
		this.project4 = project4;
		return this;
	}

	public Integer getProject5() {
		return this.project5;
	}

	public MenuEntity setProject5(Integer project5) {
		this.project5 = project5;
		return this;
	}
}
