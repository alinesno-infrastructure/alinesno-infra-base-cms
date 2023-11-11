package com.alinesno.infra.base.cms.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 数据表：announce 表备注：
 * 公告表实体类
 *
 * @TableName("announce")
 *
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("announce")
public class AnnounceEntity extends InfraBaseEntity {

	// fields

	/**
	 * 公告标题
	 */
	@Excel(name = "公告标题")
	@TableField("title")
	@ColumnType(length = 100)
	@ColumnComment("公告标题")
	private String title;

	/**
	 * 内容
	 */
	@Excel(name = "内容")
	@TableField("content")
	@ColumnType(length = 65535, value= MySqlTypeConstant.TEXT)
	@ColumnComment("内容")
	private String content;

	/**
	 * 浏览次数
	 */
	@Excel(name = "浏览次数")
	@TableField("hits")
	@ColumnType(length = 11)
	@ColumnComment("浏览次数")
	private Long hits;

	/**
	 * 是否通过1：通过；0：为通过
	 */
	@Excel(name = "是否通过1：通过；0：为通过")
	@TableField("passed")
	@ColumnType(length = 1)
	@ColumnComment("是否通过1：通过；0：为通过")
	private Integer passed;

	/**
	 * 有效起始时间
	 */
	@Excel(name = "有效起始时间", exportFormat = "yyyy-MM-dd")
	@TableField("start_time")
	@ColumnType(length = 10)
	@ColumnComment("有效起始时间")
	private Date startTime;

	/**
	 * 有效结束时间
	 */
	@Excel(name = "有效结束时间", exportFormat = "yyyy-MM-dd")
	@TableField("end_time")
	@ColumnType(length = 10)
	@ColumnComment("有效结束时间")
	private Date endTime;

	/**
	 * 样式
	 */
	@Excel(name = "样式")
	@TableField("style")
	@ColumnType(length = 50)
	@ColumnComment("样式")
	private String style;

	/**
	 * 模版
	 */
	@Excel(name = "模版")
	@TableField("show_template")
	@ColumnType(length = 100)
	@ColumnComment("模版")
	private String showTemplate;

}


