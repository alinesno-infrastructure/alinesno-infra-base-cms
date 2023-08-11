package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_messagequeue 表备注：
 *
 * SsoMessagequeueEntity类是对应数据库表sso_messagequeue的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_messagequeue")
public class SsoMessagequeueEntity extends InfraBaseEntity {

	// fields
	/**
	 * 操作
	 */
	@TableField("operation")
	private String operation;

	/**
	 * 成功
	 */
	@TableField("succeed")
	private Integer succeed;

	/**
	 * 总数
	 */
	@TableField("totalnum")
	private Integer totalnum;

	/**
	 * 通知数据
	 */
	@TableField("noticedata")
	private String noticedata;

	/**
	 * 时间戳
	 */
	@TableField("dateline")
	private Integer dateline;

	/**
	 * 应用状态
	 */
	@TableField("appstatus")
	private String appstatus;

	// getter and setter
	/**
	 * 获取操作
	 */
	public String getOperation() {
		return this.operation;
	}

	/**
	 * 设置操作
	 */
	public SsoMessagequeueEntity setOperation(String operation) {
		this.operation = operation;
		return this;
	}

	/**
	 * 获取成功
	 */
	public Integer getSucceed() {
		return this.succeed;
	}

	/**
	 * 设置成功
	 */
	public SsoMessagequeueEntity setSucceed(Integer succeed) {
		this.succeed = succeed;
		return this;
	}

	/**
	 * 获取总数
	 */
	public Integer getTotalnum() {
		return this.totalnum;
	}

	/**
	 * 设置总数
	 */
	public SsoMessagequeueEntity setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
		return this;
	}

	/**
	 * 获取通知数据
	 */
	public String getNoticedata() {
		return this.noticedata;
	}

	/**
	 * 设置通知数据
	 */
	public SsoMessagequeueEntity setNoticedata(String noticedata) {
		this.noticedata = noticedata;
		return this;
	}

	/**
	 * 获取时间戳
	 */
	public Integer getDateline() {
		return this.dateline;
	}

	/**
	 * 设置时间戳
	 */
	public SsoMessagequeueEntity setDateline(Integer dateline) {
		this.dateline = dateline;
		return this;
	}

	/**
	 * 获取应用状态
	 */
	public String getAppstatus() {
		return this.appstatus;
	}

	/**
	 * 设置应用状态
	 */
	public SsoMessagequeueEntity setAppstatus(String appstatus) {
		this.appstatus = appstatus;
		return this;
	}
}
