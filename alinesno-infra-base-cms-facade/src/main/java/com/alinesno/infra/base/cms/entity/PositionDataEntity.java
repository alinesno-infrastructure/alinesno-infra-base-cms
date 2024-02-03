package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * 数据表：picture_data
 * 备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("position_data")
@Data
public class PositionDataEntity extends InfraBaseEntity {

	// fields

	/**
	 * 内容
	 */
	@TableField("content")
	@ColumnType(MySqlTypeConstant.LONGTEXT)
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
	 * 浏览权限组
	 */
	@TableField("groupids_view")
	@ColumnType(length=255)
	@ColumnComment("浏览权限组")
	private String groupidsView;

	/**
	 * 分页类型
	 */
	@TableField("paginationtype")
	@ColumnType(length=255)
	@ColumnComment("分页类型")
	private Integer paginationtype;

	/**
	 * 每页最多字符数
	 */
	@TableField("maxcharperpage")
	@ColumnType(length=255)
	@ColumnComment("每页最多字符数")
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
	 * 相关文章
	 */
	@TableField("relation")
	@ColumnType(length=255)
	@ColumnComment("相关文章")
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
	 * 允许评论
	 */
	@TableField("allow_comment")
	@ColumnType(length=255)
	@ColumnComment("允许评论")
	private Integer allowComment;
}
