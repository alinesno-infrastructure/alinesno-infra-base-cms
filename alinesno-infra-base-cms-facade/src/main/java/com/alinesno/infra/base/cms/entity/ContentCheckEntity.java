package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：content_check 表备注：
 *
 * 字段：
 * - checkid：checkid
 * - catid：catid
 * - siteid：siteid
 * - title：title
 * - username：username
 * - inputtime：inputtime
 * - status：status
 *
 * @TableName("content_check")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("content_check")
@Data
public class ContentCheckEntity extends InfraBaseEntity {

	// 字段

	/**
	 * checkid
	 */
	@TableField("checkid")
	@ColumnType(length=255)
	@ColumnComment("checkid")
	private String checkid;

	/**
	 * catid
	 */
	@TableField("catid")
	@ColumnComment("catid")
	@ColumnType(length=10)
	private Integer catid;

	/**
	 * siteid
	 */
	@TableField("siteid")
	@ColumnComment("siteid")
	@ColumnType(length=10)
	private Integer siteid;

	/**
	 * title
	 */
	@TableField("title")
	@ColumnComment("title")
	@ColumnType(length=255)
	private String title;

	/**
	 * username
	 */
	@TableField("username")
	@ColumnComment("username")
	@ColumnType(length=255)
	private String username;

	/**
	 * inputtime
	 */
	@TableField("inputtime")
	@ColumnComment("inputtime")
	@ColumnType(length=19)
	private Integer inputtime;

	/**
	 * status
	 */
	@TableField("status")
	@ColumnComment("status")
	@ColumnType(length=255)
	private Integer status;
}
