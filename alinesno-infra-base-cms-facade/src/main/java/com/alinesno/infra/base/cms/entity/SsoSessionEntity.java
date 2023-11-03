package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表： sso_session 表备注：
 *
 * SsoSessionEntity类是对应数据库表sso_session的实体类。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sso_session")
@Data
public class SsoSessionEntity extends InfraBaseEntity {

	// fields
	@TableField("sessionid")
	@ColumnType(length=255)
	@ColumnComment("sessionid")
	private String sessionid; // sessionid

	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("userid")
	private Integer userid; // userid

	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("ip")
	private String ip; // ip

	@TableField("lastvisit")
	@ColumnType(length=255)
	@ColumnComment("lastvisit")
	private Integer lastvisit; // lastvisit

	@TableField("roleid")
	@ColumnType(length=255)
	@ColumnComment("roleid")
	private Integer roleid; // roleid

	@TableField("groupid")
	@ColumnType(length=255)
	@ColumnComment("groupid")
	private Integer groupid; // groupid

	@TableField("m")
	@ColumnType(length=255)
	@ColumnComment("m")
	private String m; // m

	@TableField("c")
	@ColumnType(length=255)
	@ColumnComment("c")
	private String c; // c

	@TableField("a")
	@ColumnType(length=255)
	@ColumnComment("a")
	private String a; // a

	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("data")
	private String data; // data
}
