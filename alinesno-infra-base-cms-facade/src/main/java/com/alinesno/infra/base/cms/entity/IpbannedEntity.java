package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import java.util.Date;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：ipbanned 表备注：
 *
 * 字段：
 * - ip：IP地址
 * - expires：过期时间
 *
 * @TableName("ipbanned")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("ipbanned")
@Data
public class IpbannedEntity extends InfraBaseEntity {

	// 字段

	/**
	 * IP地址
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("IP地址")
	private String ip;

	/**
	 * 过期时间
	 */
	@TableField("expires")
	@ColumnType(length=255)
	@ColumnComment("过期时间")
	private Date expires;
}
