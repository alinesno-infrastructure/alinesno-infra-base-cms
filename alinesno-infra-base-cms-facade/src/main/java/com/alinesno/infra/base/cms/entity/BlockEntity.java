package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：block 表备注：
 * 区块实体类
 *
 * @TableName("block")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("block")
public class BlockEntity extends InfraBaseEntity {

	// fields

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 位置
	 */
	@TableField("pos")
	private String pos;

	/**
	 * 类型
	 */
	@TableField("type")
	private Integer type;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	/**
	 * 模板
	 */
	@TableField("template")
	private String template;

	// getter and setter methods

	public Integer getSiteid() {
		return this.siteid;
	}

	public BlockEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public BlockEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getPos() {
		return this.pos;
	}

	public BlockEntity setPos(String pos) {
		this.pos = pos;
		return this;
	}

	public Integer getType() {
		return this.type;
	}

	public BlockEntity setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public BlockEntity setData(String data) {
		this.data = data;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public BlockEntity setTemplate(String template) {
		this.template = template;
		return this;
	}
}
