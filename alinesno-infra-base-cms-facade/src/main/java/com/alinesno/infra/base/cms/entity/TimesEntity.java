package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： times 表备注：
 * 
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("times")
@Data
public class TimesEntity extends InfraBaseEntity {
	
	// fields
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("数据表：")
	private String username;

	@TableField("ip")
	@ColumnType(length=15)
	@ColumnComment("ip")
	private String ip;

	@TableField("logintime")
	@ColumnType(length=19)
	@ColumnComment("登录时间")
	private Integer logintime;

	@TableField("isadmin")
	@ColumnType(length=1)
	@ColumnComment("isadmin")
	private Integer isadmin;

	@TableField("times")
	@ColumnType(length=10)
	@ColumnComment("次")
	private Integer times;
}
