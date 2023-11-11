package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import java.util.Date;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：member_detail 表备注：
 *
 * 字段：
 * - userid：用户ID
 * - birthday：生日
 *
 * @TableName("member_detail")
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member_detail")
@Data
public class MemberDetailEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 生日
	 */
	@TableField("birthday")
	@ColumnType(length=255)
	@ColumnComment("生日")
	private Date birthday;
}
