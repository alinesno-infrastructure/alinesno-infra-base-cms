package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：datacall 表备注：
 *
 * 字段：
 * - name：名称
 * - disType：显示类型
 * - type：类型
 * - module：模块
 * - action：动作
 * - data：数据
 * - template：模板
 * - cache：缓存
 * - num：数量
 *
 * @TableName("datacall")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("datacall")
public class DatacallEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * 显示类型
	 */
	@TableField("dis_type")
	private Integer disType;

	/**
	 * 类型
	 */
	@TableField("type")
	private Integer type;

	/**
	 * 模块
	 */
	@TableField("module")
	private String module;

	/**
	 * 动作
	 */
	@TableField("action")
	private String action;

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

	/**
	 * 缓存
	 */
	@TableField("cache")
	private Integer cache;

	/**
	 * 数量
	 */
	@TableField("num")
	private Integer num;

	// Getter and Setter methods

	public String getName() {
		return this.name;
	}

	public DatacallEntity setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getDisType() {
		return this.disType;
	}

	public DatacallEntity setDisType(Integer disType) {
		this.disType = disType;
		return this;
	}

	public Integer getType() {
		return this.type;
	}

	public DatacallEntity setType(Integer type) {
		this.type = type;
		return this;
	}

	public String getModule() {
		return this.module;
	}

	public DatacallEntity setModule(String module) {
		this.module = module;
		return this;
	}

	public String getAction() {
		return this.action;
	}

	public DatacallEntity setAction(String action) {
		this.action = action;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public DatacallEntity setData(String data) {
		this.data = data;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public DatacallEntity setTemplate(String template) {
		this.template = template;
		return this;
	}

	public Integer getCache() {
		return this.cache;
	}

	public DatacallEntity setCache(Integer cache) {
		this.cache = cache;
		return this;
	}

	public Integer getNum() {
		return this.num;
	}

	public DatacallEntity setNum(Integer num) {
		this.num = num;
		return this;
	}
}
