package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("account_site")
@SuppressWarnings("serial")
public class AccountSiteEntity extends InfraBaseEntity {

	/**
	 * 用户ID
	 */
	@TableField("user_id")
	@ColumnType(length = 255)
	@ColumnComment("用户ID")
	private String userId;

	/**
	 * 站点ID
	 */
	@TableField("site_id")
	@ColumnType(length = 255)
	@ColumnComment("站点ID")
	private String siteId;
}