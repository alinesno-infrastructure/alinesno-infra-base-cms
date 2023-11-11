package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 数据表：member_verify 表备注：
 * 会员验证实体类
 *
 * @TableName("member_verify")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member_verify")
@Data
public class MemberVerifyEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length = 255)
	@ColumnComment("用户ID")
	private Integer userId;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length = 255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 密码
	 */
	@TableField("password")
	@ColumnType(length = 255)
	@ColumnComment("密码")
	private String password;

	/**
	 * 加密
	 */
	@TableField("encrypt")
	@ColumnType(length = 255)
	@ColumnComment("加密")
	private String encrypt;

	/**
	 * 昵称
	 */
	@TableField("nickname")
	@ColumnType(length = 255)
	@ColumnComment("昵称")
	private String nickname;

	/**
	 * 注册日期
	 */
	@TableField("regdate")
	@ColumnType(length = 255)
	@ColumnComment("注册日期")
	private Integer regDate;

	/**
	 * 注册IP
	 */
	@TableField("regip")
	@ColumnType(length = 255)
	@ColumnComment("注册IP")
	private String regIp;

	/**
	 * 电子邮件
	 */
	@TableField("email")
	@ColumnType(length = 255)
	@ColumnComment("电子邮件")
	private String email;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	@ColumnType(length = 255)
	@ColumnComment("模型ID")
	private Integer modelId;

	/**
	 * 积分
	 */
	@TableField("point")
	@ColumnType(length = 255)
	@ColumnComment("积分")
	private Integer point;

	/**
	 * 金额
	 */
	@TableField("amount")
	@ColumnType(length = 255)
	@ColumnComment("金额")
	private BigDecimal amount;

	/**
	 * 模型信息
	 */
	@TableField("modelinfo")
	@ColumnType(length = 255)
	@ColumnComment("模型信息")
	private String modelInfo;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length = 255)
	@ColumnComment("状态")
	private Integer status;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length = 255)
	@ColumnComment("站点ID")
	private Integer siteId;

	/**
	 * 消息
	 */
	@TableField("message")
	@ColumnType(length = 255)
	@ColumnComment("消息")
	private String message;

	/**
	 * 手机号码
	 */
	@TableField("mobile")
	@ColumnType(length = 255)
	@ColumnComment("手机号码")
	private String mobile;
}
