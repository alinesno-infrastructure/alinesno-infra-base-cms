package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 站点安全设置实体类
 *
 * @TableName("site_safety_setting")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("site_safety_setting")
public class SiteSafetySettingEntity extends InfraBaseEntity {

	/**
	 * CDN设置
	 */
	@TableField("cdn_setting")
	private String cdnSetting;

	/**
	 * 站点统计
	 */
	@TableField("site_statistical")
	private String siteStatistical;

	/**
	 * 是否开启拦截，0否，1是
	 */
	@TableField("intercept")
	private Integer intercept;

	/**
	 * 白名单
	 */
	@TableField("whitelist")
	private String whitelist;

	/**
	 * 运维状态，0否，1是
	 */
	@TableField("operation_status")
	private Integer operationStatus;

	/**
	 * 运维提示语
	 */
	@TableField("operation_hint")
	private String operationHint;

	// getter and setter
	public String getCdnSetting() {
		return cdnSetting;
	}

	public SiteSafetySettingEntity setCdnSetting(String cdnSetting) {
		this.cdnSetting = cdnSetting;
		return this;
	}

	public String getSiteStatistical() {
		return siteStatistical;
	}

	public SiteSafetySettingEntity setSiteStatistical(String siteStatistical) {
		this.siteStatistical = siteStatistical;
		return this;
	}

	public Integer getIntercept() {
		return intercept;
	}

	public SiteSafetySettingEntity setIntercept(Integer intercept) {
		this.intercept = intercept;
		return this;
	}

	public String getWhitelist() {
		return whitelist;
	}

	public SiteSafetySettingEntity setWhitelist(String whitelist) {
		this.whitelist = whitelist;
		return this;
	}

	public Integer getOperationStatus() {
		return operationStatus;
	}

	public SiteSafetySettingEntity setOperationStatus(Integer operationStatus) {
		this.operationStatus = operationStatus;
		return this;
	}

	public String getOperationHint() {
		return operationHint;
	}

	public SiteSafetySettingEntity setOperationHint(String operationHint) {
		this.operationHint = operationHint;
		return this;
	}
}
