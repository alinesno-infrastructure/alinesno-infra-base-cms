package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：admin_panel
 * 管理面板实体类
 *
 * <p>管理面板信息</p>
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("admin_panel")
public class AdminPanelEntity extends InfraBaseEntity {

	/**
	 * 菜单ID
	 */
	@TableField("menuid")
	private Integer menuid;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * 名称
	 */
	@TableField("name")
	private String name;

	/**
	 * URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 时间
	 */
	@TableField("datetime")
	private Integer datetime;

	/**
	 * 获取菜单ID
	 *
	 * @return 菜单ID
	 */
	public Integer getMenuid() {
		return this.menuid;
	}

	/**
	 * 设置菜单ID
	 *
	 * @param menuid 菜单ID
	 * @return 当前实例对象
	 */
	public AdminPanelEntity setMenuid(Integer menuid) {
		this.menuid = menuid;
		return this;
	}

	/**
	 * 获取用户ID
	 *
	 * @return 用户ID
	 */
	public Integer getUserid() {
		return this.userid;
	}

	/**
	 * 设置用户ID
	 *
	 * @param userid 用户ID
	 * @return 当前实例对象
	 */
	public AdminPanelEntity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	/**
	 * 获取名称
	 *
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置名称
	 *
	 * @param name 名称
	 * @return 当前实例对象
	 */
	public AdminPanelEntity setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 获取URL
	 *
	 * @return URL
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * 设置URL
	 *
	 * @param url URL
	 * @return 当前实例对象
	 */
	public AdminPanelEntity setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * 获取时间
	 *
	 * @return 时间
	 */
	public Integer getDatetime() {
		return this.datetime;
	}

	/**
	 * 设置时间
	 *
	 * @param datetime 时间
	 * @return 当前实例对象
	 */
	public AdminPanelEntity setDatetime(Integer datetime) {
		this.datetime = datetime;
		return this;
	}
}
