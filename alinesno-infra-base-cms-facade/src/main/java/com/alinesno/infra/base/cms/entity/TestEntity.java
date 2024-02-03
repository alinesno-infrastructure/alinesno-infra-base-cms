package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： test 表备注：
 *
 * TestEntity类是对应数据库表test的实体类。
 *
 * catid: 分类ID
 * typeid: 类型ID
 * title: 标题
 * style: 样式
 * thumb: 缩略图
 * keywords: 关键词
 * description: 描述
 * posids: 位置ID
 * url: URL链接
 * listorder: 排序
 * status: 状态
 * sysadd: 系统添加
 * islink: 是否链接
 * username: 用户名
 * inputtime: 输入时间
 * updatetime: 更新时间
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
@TableName("test")
@Data
public class TestEntity extends InfraBaseEntity {

	// fields
	@TableField("catid")
	@ColumnType(length=255)
	@ColumnComment("catid")
	private Integer catid;

	@TableField("typeid")
	@ColumnType(length=255)
	@ColumnComment("typeid")
	private Integer typeid;

	@Excel(name = "title")
	@TableField("title")
	@ColumnType(length=255)
	@ColumnComment("title")
	private String title;

	@Excel(name = "style")
	@TableField("style")
	@ColumnType(length=255)
	@ColumnComment("style")
	private String style;

	@Excel(name = "thumb")
	@TableField("thumb")
	@ColumnType(length=255)
	@ColumnComment("thumb")
	private String thumb;

	@Excel(name = "keywords")
	@TableField("keywords")
	@ColumnType(length=255)
	@ColumnComment("keywords")
	private String keywords;

	@Excel(name = "description")
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("description")
	private String description;

	@Excel(name = "posids")
	@TableField("posids")
	@ColumnType(length=255)
	@ColumnComment("posids")
	private Integer posids;

	@Excel(name = "url")
	@TableField("url")
	@ColumnType(length=255)
	@ColumnComment("url")
	private String url;

	@Excel(name = "listorder")
	@TableField("listorder")
	@ColumnType(length=255)
	@ColumnComment("listorder")
	private Integer listorder;

	@Excel(name = "status")
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("status")
	private Integer status;

	@Excel(name = "sysadd")
	@TableField("sysadd")
	@ColumnType(length=255)
	@ColumnComment("sysadd")
	private Integer sysadd;

	@Excel(name = "islink")
	@TableField("islink")
	@ColumnType(length=255)
	@ColumnComment("islink")
	private Integer islink;

	@Excel(name = "username")
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("username")
	private String username;

	@Excel(name = "inputtime")
	@TableField("inputtime")
	@ColumnType(length=255)
	@ColumnComment("inputtime")
	private Integer inputtime;

	@Excel(name = "updatetime")
	@TableField("updatetime")
	@ColumnType(length=255)
	@ColumnComment("updatetime")
	private Integer updatetime;
}
