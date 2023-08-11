package com.alinesno.infra.base.cms.entity;

import java.math.BigDecimal;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： member 表备注：
 * 会员实体类
 *
 * @TableName("member") 数据库表名：member
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member")
public class MemberEntity extends InfraBaseEntity {

	// fields
	/**
	 * 用户ID
	 */
	@Excel(name = "userid")
	@TableField("userid")
	private Integer userid;

	/**
	 * PHPSSO用户ID
	 */
	@Excel(name = "phpssouid")
	@TableField("phpssouid")
	private Integer phpssouid;

	/**
	 * 用户名
	 */
	@Excel(name = "username")
	@TableField("username")
	private String username;

	/**
	 * 密码
	 */
	@Excel(name = "password")
	@TableField("password")
	private String password;

	/**
	 * 加密字符串
	 */
	@Excel(name = "encrypt")
	@TableField("encrypt")
	private String encrypt;

	/**
	 * 昵称
	 */
	@Excel(name = "nickname")
	@TableField("nickname")
	private String nickname;

	/**
	 * 注册日期
	 */
	@Excel(name = "regdate")
	@TableField("regdate")
	private Integer regdate;

	/**
	 * 最后登录日期
	 */
	@Excel(name = "lastdate")
	@TableField("lastdate")
	private Integer lastdate;

	/**
	 * 注册IP
	 */
	@Excel(name = "regip")
	@TableField("regip")
	private String regip;

	/**
	 * 最后登录IP
	 */
	@Excel(name = "lastip")
	@TableField("lastip")
	private String lastip;

	/**
	 * 登录次数
	 */
	@Excel(name = "loginnum")
	@TableField("loginnum")
	private Integer loginnum;

	/**
	 * 邮箱
	 */
	@Excel(name = "email")
	@TableField("email")
	private String email;

	/**
	 * 用户组ID
	 */
	@Excel(name = "groupid")
	@TableField("groupid")
	private Integer groupid;

	/**
	 * 地区ID
	 */
	@Excel(name = "areaid")
	@TableField("areaid")
	private Integer areaid;

	/**
	 * 金额
	 */
	@Excel(name = "amount")
	@TableField("amount")
	private BigDecimal amount;

	/**
	 * 积分
	 */
	@Excel(name = "point")
	@TableField("point")
	private Integer point;

	/**
	 * 模型ID
	 */
	@Excel(name = "modelid")
	@TableField("modelid")
	private Integer modelid;

	/**
	 * 留言数
	 */
	@Excel(name = "message")
	@TableField("message")
	private Integer message;

	/**
	 * 是否锁定
	 */
	@Excel(name = "islock")
	@TableField("islock")
	private Integer islock;

	/**
	 * 是否VIP
	 */
	@Excel(name = "vip")
	@TableField("vip")
	private Integer vip;

	/**
	 * 过期日期
	 */
	@Excel(name = "overduedate")
	@TableField("overduedate")
	private Integer overduedate;

	/**
	 * 站点ID
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 连接ID
	 */
	@Excel(name = "connectid")
	@TableField("connectid")
	private String connectid;

	/**
	 * 来源
	 */
	@Excel(name = "from")
	@TableField("from")
	private String from;

	/**
	 * 手机号码
	 */
	@Excel(name = "mobile")
	@TableField("mobile")
	private String mobile;

	// getter and setter
	public Integer getUserid() {
		return this.userid;
	}

	public MemberEntity setUserid(Integer arg) {
		this.userid = arg;
		return this;
	}

	public Integer getPhpssouid() {
		return this.phpssouid;
	}

	public MemberEntity setPhpssouid(Integer arg) {
		this.phpssouid = arg;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public MemberEntity setUsername(String arg) {
		this.username = arg;
		return this;
	}

	public String getPassword() {
		return this.password;
	}

	public MemberEntity setPassword(String arg) {
		this.password = arg;
		return this;
	}

	public String getEncrypt() {
		return this.encrypt;
	}

	public MemberEntity setEncrypt(String arg) {
		this.encrypt = arg;
		return this;
	}

	public String getNickname() {
		return this.nickname;
	}

	public MemberEntity setNickname(String arg) {
		this.nickname = arg;
		return this;
	}

	public Integer getRegdate() {
		return this.regdate;
	}

	public MemberEntity setRegdate(Integer arg) {
		this.regdate = arg;
		return this;
	}

	public Integer getLastdate() {
		return this.lastdate;
	}

	public MemberEntity setLastdate(Integer arg) {
		this.lastdate = arg;
		return this;
	}

	public String getRegip() {
		return this.regip;
	}

	public MemberEntity setRegip(String arg) {
		this.regip = arg;
		return this;
	}

	public String getLastip() {
		return this.lastip;
	}

	public MemberEntity setLastip(String arg) {
		this.lastip = arg;
		return this;
	}

	public Integer getLoginnum() {
		return this.loginnum;
	}

	public MemberEntity setLoginnum(Integer arg) {
		this.loginnum = arg;
		return this;
	}

	public String getEmail() {
		return this.email;
	}

	public MemberEntity setEmail(String arg) {
		this.email = arg;
		return this;
	}

	public Integer getGroupid() {
		return this.groupid;
	}

	public MemberEntity setGroupid(Integer arg) {
		this.groupid = arg;
		return this;
	}

	public Integer getAreaid() {
		return this.areaid;
	}

	public MemberEntity setAreaid(Integer arg) {
		this.areaid = arg;
		return this;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public MemberEntity setAmount(BigDecimal arg) {
		this.amount = arg;
		return this;
	}

	public Integer getPoint() {
		return this.point;
	}

	public MemberEntity setPoint(Integer arg) {
		this.point = arg;
		return this;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public MemberEntity setModelid(Integer arg) {
		this.modelid = arg;
		return this;
	}

	public Integer getMessage() {
		return this.message;
	}

	public MemberEntity setMessage(Integer arg) {
		this.message = arg;
		return this;
	}

	public Integer getIslock() {
		return this.islock;
	}

	public MemberEntity setIslock(Integer arg) {
		this.islock = arg;
		return this;
	}

	public Integer getVip() {
		return this.vip;
	}

	public MemberEntity setVip(Integer arg) {
		this.vip = arg;
		return this;
	}

	public Integer getOverduedate() {
		return this.overduedate;
	}

	public MemberEntity setOverduedate(Integer arg) {
		this.overduedate = arg;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public MemberEntity setSiteid(Integer arg) {
		this.siteid = arg;
		return this;
	}

	public String getConnectid() {
		return this.connectid;
	}

	public MemberEntity setConnectid(String arg) {
		this.connectid = arg;
		return this;
	}

	public String getFrom() {
		return this.from;
	}

	public MemberEntity setFrom(String arg) {
		this.from = arg;
		return this;
	}

	public String getMobile() {
		return this.mobile;
	}

	public MemberEntity setMobile(String arg) {
		this.mobile = arg;
		return this;
	}
}
