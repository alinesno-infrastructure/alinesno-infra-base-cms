package com.alinesno.infra.base.cms.entity;

import java.math.BigDecimal;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

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
public class MemberVerifyEntity extends InfraBaseEntity {

	// 字段
	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userId;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 密码
	 */
	@TableField("password")
	private String password;

	/**
	 * 加密
	 */
	@TableField("encrypt")
	private String encrypt;

	/**
	 * 昵称
	 */
	@TableField("nickname")
	private String nickname;

	/**
	 * 注册日期
	 */
	@TableField("regdate")
	private Integer regDate;

	/**
	 * 注册IP
	 */
	@TableField("regip")
	private String regIp;

	/**
	 * 电子邮件
	 */
	@TableField("email")
	private String email;

	/**
	 * 模型ID
	 */
	@TableField("modelid")
	private Integer modelId;

	/**
	 * 积分
	 */
	@TableField("point")
	private Integer point;

	/**
	 * 金额
	 */
	@TableField("amount")
	private BigDecimal amount;

	/**
	 * 模型信息
	 */
	@TableField("modelinfo")
	private String modelInfo;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteId;

	/**
	 * 消息
	 */
	@TableField("message")
	private String message;

	/**
	 * 手机号码
	 */
	@TableField("mobile")
	private String mobile;

	// getter and setter
	public Integer getUserId() {
		return this.userId;
	}

	public MemberVerifyEntity setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public MemberVerifyEntity setUsername(String username) {
		this.username = username;
		return this;
	}
	public String getPassword() {
		return this.password;
	}

	public MemberVerifyEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getEncrypt() {
		return this.encrypt;
	}

	public MemberVerifyEntity setEncrypt(String encrypt) {
		this.encrypt = encrypt;
		return this;
	}

	public String getNickname() {
		return this.nickname;
	}

	public MemberVerifyEntity setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public Integer getRegDate() {
		return this.regDate;
	}

	public MemberVerifyEntity setRegDate(Integer regDate) {
		this.regDate = regDate;
		return this;
	}

	public String getRegIp() {
		return this.regIp;
	}

	public MemberVerifyEntity setRegIp(String regIp) {
		this.regIp = regIp;
		return this;
	}

	public String getEmail() {
		return this.email;
	}

	public MemberVerifyEntity setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getModelId() {
		return this.modelId;
	}

	public MemberVerifyEntity setModelId(Integer modelId) {
		this.modelId = modelId;
		return this;
	}

	public Integer getPoint() {
		return this.point;
	}

	public MemberVerifyEntity setPoint(Integer point) {
		this.point = point;
		return this;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public MemberVerifyEntity setAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	public String getModelInfo() {
		return this.modelInfo;
	}

	public MemberVerifyEntity setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public MemberVerifyEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Integer getSiteId() {
		return this.siteId;
	}

	public MemberVerifyEntity setSiteId(Integer siteId) {
		this.siteId = siteId;
		return this;
	}

	public String getMessage() {
		return this.message;
	}

	public MemberVerifyEntity setMessage(String message) {
		this.message = message;
		return this;
	}

	public String getMobile() {
		return this.mobile;
	}

	public MemberVerifyEntity setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
}

