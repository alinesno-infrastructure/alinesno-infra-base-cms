package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SiteSafetySettingEntity extends InfraBaseEntity {

	/**
	 * CDN设置
	 */
	@TableField("cdn_setting")
	@ColumnType(length=255)
	@ColumnComment("CDN设置")
	private String cdnSetting;

	/**
	 * 站点统计
	 */
	@TableField("site_statistical")
	@ColumnType(length=255)
	@ColumnComment("站点统计")
	private String siteStatistical;

	/**
	 * 是否开启拦截，0否，1是
	 */
	@TableField("intercept")
	@ColumnType(length=255)
	@ColumnComment("是否开启拦截，0否，1是")
	private Integer intercept;

	/**
	 * 白名单
	 */
	@TableField("whitelist")
	@ColumnType(length=255)
	@ColumnComment("白名单")
	private String whitelist;

	/**
	 * 运维状态，0否，1是
	 */
	@TableField("operation_status")
	@ColumnType(length=255)
	@ColumnComment("运维状态，0否，1是")
	private Integer operationStatus;

	/**
	 * 运维提示语
	 */
	@TableField("operation_hint")
	@ColumnType(length=255)
	@ColumnComment("运维提示语")
	private String operationHint;
}
