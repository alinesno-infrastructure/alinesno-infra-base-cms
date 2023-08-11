package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

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
@TableName("template_bak")
public class TemplateBakEntity extends InfraBaseEntity {

	// fields
	@Excel(name = "creatAt")
	@TableField("creat_at")
	private Integer creatAt;

	@Excel(name = "fileid")
	@TableField("fileid")
	private String fileid;

	@Excel(name = "userid")
	@TableField("userid")
	private Integer userid;

	@Excel(name = "username")
	@TableField("username")
	private String username;

	@Excel(name = "template")
	@TableField("template")
	private String template;

	// getter and setter
	public Integer getCreatAt() {
		return this.creatAt;
	}

	public TemplateBakEntity setCreatAt(Integer arg) {
		this.creatAt = arg;
		return this;
	}

	public String getFileid() {
		return this.fileid;
	}

	public TemplateBakEntity setFileid(String arg) {
		this.fileid = arg;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public TemplateBakEntity setUserid(Integer arg) {
		this.userid = arg;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public TemplateBakEntity setUsername(String arg) {
		this.username = arg;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public TemplateBakEntity setTemplate(String arg) {
		this.template = arg;
		return this;
	}
}
