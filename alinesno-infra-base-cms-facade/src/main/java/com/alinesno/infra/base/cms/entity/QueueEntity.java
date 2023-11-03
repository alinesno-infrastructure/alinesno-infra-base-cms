package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：queue 表备注：
 *
 * 数据表 queue 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("queue")
@Data
public class QueueEntity extends InfraBaseEntity {

	// fields

	/**
	 * 类型
	 */
	@TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
	private String type;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 路径
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("路径")
	private String path;

	/**
	 * 状态1
	 */
	@TableField("status1")
	@ColumnType(length=255)
	@ColumnComment("状态1")
	private Integer status1;

	/**
	 * 状态2
	 */
	@TableField("status2")
	@ColumnType(length=255)
	@ColumnComment("状态2")
	private Integer status2;

	/**
	 * 状态3
	 */
	@TableField("status3")
	@ColumnType(length=255)
	@ColumnComment("状态3")
	private Integer status3;

	/**
	 * 状态4
	 */
	@TableField("status4")
	@ColumnType(length=255)
	@ColumnComment("状态4")
	private Integer status4;

	/**
	 * 次数
	 */
	@TableField("times")
	@ColumnType(length=255)
	@ColumnComment("次数")
	private Integer times;
}
