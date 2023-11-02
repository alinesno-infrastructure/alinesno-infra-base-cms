package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：badword 表备注：
 * 坏词实体类
 *
 * @TableName("badword")
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("badword")
public class BadwordEntity extends InfraBaseEntity {

	// fields

	/**
	 * 坏词ID
	 */
	@TableField("badid")
	@ColumnType
	@ColumnComment("坏词ID")
	private Integer badid;

	/**
	 * 坏词
	 */
	@TableField("badword")
	@ColumnType(length = 255)
	@ColumnComment("坏词")
	private String badword;

	/**
	 * 级别
	 */
	@TableField("level")
	@ColumnType
	@ColumnComment("级别")
	private Integer level;

	/**
	 * 替换词
	 */
	@TableField("replaceword")
	@ColumnType(length = 255)
	@ColumnComment("替换词")
	private String replaceword;

	/**
	 * 最后使用时间
	 */
	@TableField("lastusetime")
	@ColumnType
	@ColumnComment("最后使用时间")
	private Integer lastusetime;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType
	@ColumnComment("排序")
	private Integer listorder;
}
