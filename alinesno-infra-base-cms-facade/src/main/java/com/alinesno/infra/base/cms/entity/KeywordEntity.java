package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：keyword 表备注：
 *
 * 字段：
 * - siteid：站点ID
 * - keyword：关键词
 * - pinyin：拼音
 * - videonum：视频数量
 * - searchnums：搜索次数
 *
 * @TableName("keyword")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("keyword")
@Data
public class KeywordEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 关键词
	 */
	@TableField("keyword")
	@ColumnType(length=255)
	@ColumnComment("关键词")
	private String keyword;

	/**
	 * 拼音
	 */
	@TableField("pinyin")
	@ColumnType(length=255)
	@ColumnComment("拼音")
	private String pinyin;

	/**
	 * 视频数量
	 */
	@TableField("videonum")
	@ColumnType(length=255)
	@ColumnComment("视频数量")
	private Long videonum;

	/**
	 * 搜索次数
	 */
	@TableField("searchnums")
	@ColumnType(length=255)
	@ColumnComment("搜索次数")
	private Integer searchnums;
}
