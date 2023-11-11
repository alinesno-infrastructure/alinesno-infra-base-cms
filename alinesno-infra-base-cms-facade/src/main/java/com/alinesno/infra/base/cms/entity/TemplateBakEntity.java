package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.EqualsAndHashCode;

/**
 * 数据表： template_bak 表备注：
 *
 * TemplateBakEntity类是对应数据库表template_bak的实体类。
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
@TableName("template_bak")
@Data
public class TemplateBakEntity extends InfraBaseEntity {

	// fields
	@Excel(name = "creatAt")
	@TableField("creat_at")
	@ColumnType(length=19)
	@ColumnComment("creat_at")
	private Integer creatAt;

	@Excel(name = "fileid")
	@TableField("fileid")
	@ColumnType(length=50)
	@ColumnComment("fileid")
	private String fileid;

	@Excel(name = "userid")
	@TableField("userid")
	@ColumnType(length=50)
	@ColumnComment("userid")
	private Integer userid;

	@Excel(name = "username")
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	@Excel(name = "template")
	@TableField("template")
	@ColumnType(length=255)
	@ColumnComment("样板")
	private String template;
}
