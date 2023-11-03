package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：extend_setting 表备注：
 *
 * 字段：
 * - key：键
 * - data：数据
 *
 * @TableName("extend_setting")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("extend_setting")
@Data
public class ExtendSettingEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 键
	 */
	@TableField("key")
	@ColumnType(length=255)
	@ColumnComment("键")
	private String key;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;
}
