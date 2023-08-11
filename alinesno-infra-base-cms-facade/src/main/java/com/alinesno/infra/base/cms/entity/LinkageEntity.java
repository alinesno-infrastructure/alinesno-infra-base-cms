package com.alinesno.infra.base.cms.entity;

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
public class LinkageEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 联动ID
	 */
	@TableField("linkageid")
	private Integer linkageid;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 样式
	 */
	@TableField("style")
	private String style;

	/**
	 * 父级ID
	 */
	@TableField("parentid")
	private Integer parentid;

	/**
	 * 是否有子级
	 */
	@TableField("child")
	private Integer child;

	/**
	 * 所有子级ID
	 */
	@TableField("arrchildid")
	private String arrchildid;

	/**
	 * 关键字ID
	 */
	@TableField("keyid")
	private Integer keyid;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	/**
	 * 描述
	 */
	@TableField("description")
	private String description;

	/**
	 * 设置
	 */
	@TableField("setting")
	private String setting;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	// Getters and Setters

	public Integer getLinkageid() {
		return linkageid;
	}

	public void setLinkageid(Integer linkageid) {
		this.linkageid = linkageid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer getChild() {
		return child;
	}

	public void setChild(Integer child) {
		this.child = child;
	}

	public String getArrchildid() {
		return arrchildid;
	}

	public void setArrchildid(String arrchildid) {
		this.arrchildid = arrchildid;
	}

	public Integer getKeyid() {
		return keyid;
	}

	public void setKeyid(Integer keyid) {
		this.keyid = keyid;
	}

	public Integer getListorder() {
		return listorder;
	}

	public void setListorder(Integer listorder) {
		this.listorder = listorder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}
}
