package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 功能名： 【请填写功能名称】 数据表： test_data 表备注：
 *
 * TestDataEntity类是对应数据库表test_data的实体类。
 *
 * content: 内容
 * readpoint: 阅读点数
 * groupidsView: 可见组
 * paginationtype: 分页类型
 * maxcharperpage: 每页字符数
 * template: 模板
 * paytype: 支付类型
 * allowComment: 是否允许评论
 * relation: 关联字段
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
@TableName("test_data")
public class TestDataEntity extends InfraBaseEntity {

	// fields
	@Excel(name = "content")
	@TableField("content")
	private String content;

	@Excel(name = "readpoint")
	@TableField("readpoint")
	private Integer readpoint;

	@Excel(name = "groupidsView")
	@TableField("groupids_view")
	private String groupidsView;

	@Excel(name = "paginationtype")
	@TableField("paginationtype")
	private Integer paginationtype;

	@Excel(name = "maxcharperpage")
	@TableField("maxcharperpage")
	private Integer maxcharperpage;

	@Excel(name = "template")
	@TableField("template")
	private String template;

	@Excel(name = "paytype")
	@TableField("paytype")
	private Integer paytype;

	@Excel(name = "allowComment")
	@TableField("allow_comment")
	private Integer allowComment;

	@Excel(name = "relation")
	@TableField("relation")
	private String relation;

	// getter and setter
	public String getContent() {
		return this.content;
	}

	public TestDataEntity setContent(String arg) {
		this.content = arg;
		return this;
	}

	public Integer getReadpoint() {
		return this.readpoint;
	}

	public TestDataEntity setReadpoint(Integer arg) {
		this.readpoint = arg;
		return this;
	}

	public String getGroupidsView() {
		return this.groupidsView;
	}

	public TestDataEntity setGroupidsView(String arg) {
		this.groupidsView = arg;
		return this;
	}

	public Integer getPaginationtype() {
		return this.paginationtype;
	}

	public TestDataEntity setPaginationtype(Integer arg) {
		this.paginationtype = arg;
		return this;
	}

	public Integer getMaxcharperpage() {
		return this.maxcharperpage;
	}

	public TestDataEntity setMaxcharperpage(Integer arg) {
		this.maxcharperpage = arg;
		return this;
	}

	public String getTemplate() {
		return this.template;
	}

	public TestDataEntity setTemplate(String arg) {
		this.template = arg;
		return this;
	}

	public Integer getPaytype() {
		return this.paytype;
	}

	public TestDataEntity setPaytype(Integer arg) {
		this.paytype = arg;
		return this;
	}

	public Integer getAllowComment() {
		return this.allowComment;
	}

	public TestDataEntity setAllowComment(Integer arg) {
		this.allowComment = arg;
		return this;
	}

	public String getRelation() {
		return this.relation;
	}

	public TestDataEntity setRelation(String arg) {
		this.relation = arg;
		return this;
	}
}
