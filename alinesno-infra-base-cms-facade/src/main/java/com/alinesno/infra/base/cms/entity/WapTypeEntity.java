package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： wap_type 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("wap_type")
public class WapTypeEntity extends InfraBaseEntity {

	// fields
	@TableField("typeid")
	private Integer typeid;

	@TableField("cat")
	private Integer cat;

	@TableField("parentid")
	private Integer parentid;

	@TableField("typename")
	private String typename;

	@TableField("siteid")
	private Integer siteid;

	@TableField("listorder")
	private Integer listorder;

	// getter and setter
	public Integer getTypeid() {
		return this.typeid;
	}

	public WapTypeEntity setTypeid(Integer arg) {
		this.typeid = arg;
		return this;
	}

	public Integer getCat() {
		return this.cat;
	}

	public WapTypeEntity setCat(Integer arg) {
		this.cat = arg;
		return this;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public WapTypeEntity setParentid(Integer arg) {
		this.parentid = arg;
		return this;
	}

	public String getTypename() {
		return this.typename;
	}

	public WapTypeEntity setTypename(String arg) {
		this.typename = arg;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public WapTypeEntity setSiteid(Integer arg) {
		this.siteid = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public WapTypeEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}
}
