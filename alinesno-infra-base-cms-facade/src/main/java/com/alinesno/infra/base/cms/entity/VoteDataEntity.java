package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表： vote_data 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("vote_data")
@Data
public class VoteDataEntity extends InfraBaseEntity {

	// fields
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("userid")
	private Integer userid;

	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("username")
	private String username;

	@TableField("subjectid")
	@ColumnType(length=255)
	@ColumnComment("subjectid")
	private Integer subjectid;

	@TableField("time")
	@ColumnType(length=255)
	@ColumnComment("time")
	private Integer time;

	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("ip")
	private String ip;

	@TableField("data")
	@ColumnType(length=255)
	@ColumnComment("data")
	private String data;

	@TableField("userinfo")
	@ColumnType(length=255)
	@ColumnComment("userinfo")
	private String userinfo;
}
