package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class MemberVipEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer userId;
}
