package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keylink 表备注：
 *
 * 字段：
 * - keylinkid：关键链接ID
 * - word：关键词
 * - url：链接地址
 *
 * @TableName("keylink")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keylink")
@Data
public class KeylinkEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 关键链接ID
	 */
	@TableField("keylinkid")
	@ColumnType(length=255)
	@ColumnComment("关键链接ID")
	private Integer keylinkid;

	/**
	 * 关键词
	 */
	@TableField("word")
	@ColumnType(length=255)
	@ColumnComment("关键词")
	private String word;

	/**
	 * 链接地址
	 */
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("链接地址")
	private String url;
}
