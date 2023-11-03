package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：search 表备注：
 *
 * 数据表 search 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("search")
@Data
public class SearchEntity extends InfraBaseEntity {

	// fields

	/**
	 * 搜索ID
	 */
	@TableField("searchid")
	@ColumnType(length=255)
	@ColumnComment("搜索ID")
	private Integer searchid;

	/**
	 * 类型ID
	 */
	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("类型ID")
	private Integer typeid;

	/**
	 * 添加日期
	 */
	@TableField("adddate")
	@ColumnType(length=255)
	@ColumnComment("添加日期")
	private Integer adddate;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;
}
