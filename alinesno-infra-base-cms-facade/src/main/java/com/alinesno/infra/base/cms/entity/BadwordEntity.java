package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：badword 表备注：
 * 坏词实体类
 *
 * @TableName("badword")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("badword")
public class BadwordEntity extends InfraBaseEntity {

	// fields

	/**
	 * 坏词ID
	 */
	@TableField("badid")
	private Integer badid;

	/**
	 * 坏词
	 */
	@TableField("badword")
	private String badword;

	/**
	 * 级别
	 */
	@TableField("level")
	private Integer level;

	/**
	 * 替换词
	 */
	@TableField("replaceword")
	private String replaceword;

	/**
	 * 最后使用时间
	 */
	@TableField("lastusetime")
	private Integer lastusetime;

	/**
	 * 排序
	 */
	@TableField("listorder")
	private Integer listorder;

	// getter and setter methods

	public Integer getBadid() {
		return this.badid;
	}

	public BadwordEntity setBadid(Integer badid) {
		this.badid = badid;
		return this;
	}

	public String getBadword() {
		return this.badword;
	}

	public BadwordEntity setBadword(String badword) {
		this.badword = badword;
		return this;
	}

	public Integer getLevel() {
		return this.level;
	}

	public BadwordEntity setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public String getReplaceword() {
		return this.replaceword;
	}

	public BadwordEntity setReplaceword(String replaceword) {
		this.replaceword = replaceword;
		return this;
	}

	public Integer getLastusetime() {
		return this.lastusetime;
	}

	public BadwordEntity setLastusetime(Integer lastusetime) {
		this.lastusetime = lastusetime;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public BadwordEntity setListorder(Integer listorder) {
		this.listorder = listorder;
		return this;
	}
}
