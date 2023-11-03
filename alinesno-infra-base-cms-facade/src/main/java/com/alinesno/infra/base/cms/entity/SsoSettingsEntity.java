package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：sso_settings 表备注：
 *
 * SsoSettingsEntity类是对应数据库表sso_settings的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_settings")
@Data
public class SsoSettingsEntity extends InfraBaseEntity {

	// fields

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 数据
	 */
	@Excel(name = "data")
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;
}
