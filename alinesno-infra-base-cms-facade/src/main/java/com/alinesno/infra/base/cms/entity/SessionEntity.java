package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：session 表备注：
 *
 * 数据表 session 对应的实体类，由 MyBatis Generator 自动生成。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("session")
@Data
public class SessionEntity extends InfraBaseEntity {

	// fields

	/**
	 * sessionid
	 */
	@TableField("sessionid")
	@ColumnType(length=255)
	@ColumnComment("sessionid")
	private String sessionid;

	/**
	 * userid
	 */
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("userid")
	private Integer userid;

	/**
	 * ip
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("ip")
	private String ip;

	/**
	 * lastvisit
	 */
	@TableField("lastvisit")
	@ColumnType(length=255)
	@ColumnComment("lastvisit")
	private Integer lastvisit;

	/**
	 * roleid
	 */
	@TableField("roleid")
	@ColumnType(length=255)
	@ColumnComment("roleid")
	private Integer roleid;

	/**
	 * groupid
	 */
	@TableField("groupid")
	@ColumnType(length=255)
	@ColumnComment("groupid")
	private Integer groupid;

	/**
	 * m
	 */
	@TableField("m")
	@ColumnType(length=255)
	@ColumnComment("m")
	private String m;

	/**
	 * c
	 */
	@TableField("c")
	@ColumnType(length=255)
	@ColumnComment("c")
	private String c;

	/**
	 * a
	 */
	@TableField("a")
	@ColumnType(length=255)
	@ColumnComment("a")
	private String a;

	/**
	 * data
	 */
	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("data")
	private String data;
}
