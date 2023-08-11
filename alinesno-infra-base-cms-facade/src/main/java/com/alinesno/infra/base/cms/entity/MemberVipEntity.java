package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：member_vip 表备注：
 * 会员VIP实体类
 *
 * @TableName("member_vip")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member_vip")
public class MemberVipEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userId;

	// getter and setter
	public Integer getUserId() {
		return this.userId;
	}

	public MemberVipEntity setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}
}
