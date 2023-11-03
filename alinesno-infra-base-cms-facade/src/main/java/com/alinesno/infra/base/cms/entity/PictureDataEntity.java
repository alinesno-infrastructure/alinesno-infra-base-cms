package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：picture_data 表备注：
 * 图片数据实体类
 *
 * @TableName("picture_data")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("picture_data")
@Data
public class PictureDataEntity extends InfraBaseEntity {

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("内容")
	private String content;

	/**
	 * 阅读点数
	 */
	@TableField("readpoint")
	@ColumnType(length=255)
	@ColumnComment("阅读点数")
	private Integer readpoint;

	/**
	 * 分组视图
	 */
	@TableField("groupids_view")
	@ColumnType(length=255)
	@ColumnComment("分组视图")
	private String groupidsView;

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
	 * 模板
	 */
	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("模板")
	private String template;

	/**
	 * 支付类型
	 */
	@TableField("paytype")
	@ColumnType(length=255)
	@ColumnComment("支付类型")
	private Integer paytype;

	/**
	 * 关联
	 */
	@TableField("relation")
	@ColumnType(length=255)
	@ColumnComment("关联")
	private String relation;

	/**
	 * 图片URL
	 */
	@TableField("pictureurls")
	@ColumnType(length=255)
	@ColumnComment("图片URL")
	private String pictureurls;

	/**
	 * 来源
	 */
	@TableField("copyfrom")
	@ColumnType(length=255)
	@ColumnComment("来源")
	private String copyfrom;

	/**
	 * 是否允许评论
	 */
	@TableField("allow_comment")
	@ColumnType(length=255)
	@ColumnComment("是否允许评论")
	private Integer allowComment;
}
