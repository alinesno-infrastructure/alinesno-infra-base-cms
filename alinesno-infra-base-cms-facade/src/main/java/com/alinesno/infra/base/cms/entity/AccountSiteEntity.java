package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户站点实体类
 *
 * <p>数据表：account_site</p>
 * <p>用户站点信息</p>
 *
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("account_site")
@SuppressWarnings("serial")
public class AccountSiteEntity extends InfraBaseEntity {

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 站点ID
	 */
	private String siteId;

	/**
	 * 获取用户ID
	 *
	 * @return 用户ID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置用户ID
	 *
	 * @param userId 用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 获取站点ID
	 *
	 * @return 站点ID
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * 设置站点ID
	 *
	 * @param siteId 站点ID
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
}
