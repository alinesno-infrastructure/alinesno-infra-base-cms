package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：search_keyword 表备注：
 *
 * 数据表 search_keyword 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("search_keyword")
@Data
public class SearchKeywordEntity extends InfraBaseEntity {

	// fields

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
	 * 搜索次数
	 */
	@TableField("searchnums")
	@ColumnType(length=255)
	@ColumnComment("搜索次数")
	private Integer searchnums;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("数据")
	private String data;
}
