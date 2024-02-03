package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：position
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("position")
@Data
public class PositionEntity extends InfraBaseEntity {

	// fields

	/**
	 * 位置ID
	 */
	@TableField("posid")
	@ColumnType(length=255)
	@ColumnComment("位置ID")
	private Integer posid;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	@ColumnType(length=255)
	@ColumnComment("模型ID")
	private Integer modelid;

	/**
	 * 分类ID
	 */
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("分类ID")
	private Integer catid;

	/**
	 * 名称
	 */
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 最大数量
	 */
	@TableField("maxnum")
	@ColumnType(length=255)
	@ColumnComment("最大数量")
	private Integer maxnum;

	/**
	 * 扩展
	 */
	@TableField("extention")
	@ColumnType(length=255)
	@ColumnComment("扩展")
	private String extention;

	/**
	 * 排序
	 */
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer listorder;

	/**
	 * 缩略图
	 */
	@TableField("thumb")
	@ColumnType(length=255)
	@ColumnComment("缩略图")
	private String thumb;
}
