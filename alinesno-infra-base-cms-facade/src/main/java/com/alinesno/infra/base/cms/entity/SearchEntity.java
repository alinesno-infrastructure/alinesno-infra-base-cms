package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：search 表备注：
 *
 * 数据表 search 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("search")
public class SearchEntity extends InfraBaseEntity {

	// fields

	/**
	 * 搜索ID
	 */
	@TableField("searchid")
	private Integer searchid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	private Integer typeid;

	/**
	 * 添加日期
	 */
	@TableField("adddate")
	private Integer adddate;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	// getter and setter methods

	/**
	 * 获取搜索ID
	 *
	 * @return 搜索ID
	 */
	public Integer getSearchid() {
		return this.searchid;
	}

	/**
	 * 设置搜索ID
	 *
	 * @param searchid 搜索ID
	 */
	public void setSearchid(Integer searchid) {
		this.searchid = searchid;
	}

	/**
	 * 获取类型ID
	 *
	 * @return 类型ID
	 */
	public Integer getTypeid() {
		return this.typeid;
	}

	/**
	 * 设置类型ID
	 *
	 * @param typeid 类型ID
	 */
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	/**
	 * 获取添加日期
	 *
	 * @return 添加日期
	 */
	public Integer getAdddate() {
		return this.adddate;
	}

	/**
	 * 设置添加日期
	 *
	 * @param adddate 添加日期
	 */
	public void setAdddate(Integer adddate) {
		this.adddate = adddate;
	}

	/**
	 * 获取数据
	 *
	 * @return 数据
	 */
	public String getData() {
		return this.data;
	}

	/**
	 * 设置数据
	 *
	 * @param data 数据
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * 获取站点ID
	 *
	 * @return 站点ID
	 */
	public Integer getSiteid() {
		return this.siteid;
	}

	/**
	 * 设置站点ID
	 *
	 * @param siteid 站点ID
	 */
	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}
}
