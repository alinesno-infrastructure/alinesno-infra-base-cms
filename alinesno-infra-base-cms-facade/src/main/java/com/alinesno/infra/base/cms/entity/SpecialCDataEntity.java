package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 特殊数据实体类
 *
 * @TableName("special_c_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("special_c_data")
@Data
public class SpecialCDataEntity extends InfraBaseEntity {

	/**
	 * 作者
	 */
	@TableField("author")
	@ColumnType(length=255)
	@ColumnComment("作者")
	private String author;

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	@ColumnType(length=255)
	@ColumnComment("分页类型")
	private Integer paginationtype;

	/**
	 * 每页最大字符数
	 */
	@TableField("maxcharperpage")
	@ColumnType(length=255)
	@ColumnComment("每页最大字符数")
	private Integer maxcharperpage;

	/**
	 * 样式
	 */
	@TableField("style")
	@ColumnType(length=255)
	@ColumnComment("样式")
	private String style;

	/**
	 * 展示模板
	 */
	@TableField("show_template")
	@ColumnType(length=255)
	@ColumnComment("展示模板")
	private String showTemplate;
}
