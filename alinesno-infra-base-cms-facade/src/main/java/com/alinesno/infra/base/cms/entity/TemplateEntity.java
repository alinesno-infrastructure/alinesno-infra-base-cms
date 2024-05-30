package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表： template_bak 表备注：
 *
 * TemplateEntity类是对应数据库表template_bak的实体类。
 *
 * creatAt: 创建时间
 * fileid: 文件ID
 * userid: 用户ID
 * username: 用户名
 * template: 模板
 *
 * 该类继承自InfraBaseEntity，表示是基础实体类。
 *
 * 通过@TableField注解指定数据库表字段的映射关系。
 * 通过@TableName注解指定对应的数据库表名。
 * 通过@Excel注解指定在Excel导出时的字段名。
 *
 * 注意：该类中的@ColumnComment和@Excel注解已被删除，@TableField(length = xx)也已被删除。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("template")
@Data
public class TemplateEntity extends InfraBaseEntity {


	/**
	 * 所属站点ID
	 */
	@TableField("site_id")
	@ColumnType(length=255)
	@ColumnComment("所属站点ID")
	private Long siteId;

	/**
	 * 发布通道编码
	 */
	@TableField("publish_pipeCode")
	@ColumnType(length=255)
	@ColumnComment("发布通道编码")
	private String publishPipeCode;

	/**
	 * 模板文件路径
	 */
	@TableField("path")
	@ColumnType(length=255)
	@ColumnComment("模板文件路径")
	private String path;

	/**
	 * 模板内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("模板内容")
	private String content;

	/**
	 * 模板文件大小
	 */
	@TableField("filesize")
	@ColumnType(length=255)
	@ColumnComment("模板文件大小")
	private Long filesize;

	/**
	 * 备注
	 */
	@TableField("remark")
	@ColumnType(length=255)
	@ColumnComment("备注")
	private String remark;
}
