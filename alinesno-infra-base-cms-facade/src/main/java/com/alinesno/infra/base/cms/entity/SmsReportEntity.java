package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 短信报告实体类
 *
 * @TableName("sms_report")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("sms_report")
public class SmsReportEntity extends InfraBaseEntity {

	/**
	 * 手机号码
	 */
	@TableField("mobile")
	private String mobile;

	/**
	 * 发送时间
	 */
	@TableField("posttime")
	private Integer posttime;

	/**
	 * ID码
	 */
	@TableField("id_code")
	private String idCode;

	/**
	 * 消息内容
	 */
	@TableField("msg")
	private String msg;

	/**
	 * 发送用户ID
	 */
	@TableField("send_userid")
	private Integer sendUserid;

	/**
	 * 状态
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 返回ID
	 */
	@TableField("return_id")
	private String returnId;

	/**
	 * IP地址
	 */
	@TableField("ip")
	private String ip;

	// getter and setter
	public String getMobile() {
		return mobile;
	}

	public SmsReportEntity setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public Integer getPosttime() {
		return posttime;
	}

	public SmsReportEntity setPosttime(Integer posttime) {
		this.posttime = posttime;
		return this;
	}

	public String getIdCode() {
		return idCode;
	}

	public SmsReportEntity setIdCode(String idCode) {
		this.idCode = idCode;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public SmsReportEntity setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Integer getSendUserid() {
		return sendUserid;
	}

	public SmsReportEntity setSendUserid(Integer sendUserid) {
		this.sendUserid = sendUserid;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public SmsReportEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getReturnId() {
		return returnId;
	}

	public SmsReportEntity setReturnId(String returnId) {
		this.returnId = returnId;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public SmsReportEntity setIp(String ip) {
		this.ip = ip;
		return this;
	}
}
