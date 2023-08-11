package com.alinesno.infra.base.cms.entity;

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
public class MemberDetailEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * 生日
	 */
	@TableField("birthday")
	private Date birthday;

	// Getters and Setters

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
