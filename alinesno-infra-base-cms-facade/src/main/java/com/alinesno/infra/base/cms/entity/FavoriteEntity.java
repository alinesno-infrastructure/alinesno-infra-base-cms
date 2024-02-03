package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：favorite 表备注：
 *
 * 字段：
 * - userid：用户ID
 * - title：标题
 * - url：URL地址
 * - adddate：添加日期
 *
 * @TableName("favorite")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("favorite")
@Data
public class FavoriteEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 标题
	 */
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("标题")
	private String title;

	/**
	 * URL地址
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("URL地址")
	private String url;

	/**
	 * 添加日期
	 */
	@TableField("adddate")
	@ColumnType(length=255)
	@ColumnComment("添加日期")
	private Integer adddate;
}
