package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class SmsReportEntity extends InfraBaseEntity {

	/**
	 * 手机号码
	 */
	@TableField("mobile")
	@ColumnType(length=255)
	@ColumnComment("手机号码")
	private String mobile;

	/**
	 * 发送时间
	 */
	@TableField("posttime")
	@ColumnType(length=255)
	@ColumnComment("发送时间")
	private Integer posttime;

	/**
	 * ID码
	 */
	@TableField("id_code")
	@ColumnType(length=255)
	@ColumnComment("ID码")
	private String idCode;

	/**
	 * 消息内容
	 */
	@TableField("msg")
	@ColumnType(length=255)
	@ColumnComment("消息内容")
	private String msg;

	/**
	 * 发送用户ID
	 */
	@TableField("send_userid")
	@ColumnType(length=255)
	@ColumnComment("发送用户ID")
	private Integer sendUserid;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType(length=255)
	@ColumnComment("状态")
	private Integer status;

	/**
	 * 返回ID
	 */
	@TableField("return_id")
	@ColumnType(length=255)
	@ColumnComment("返回ID")
	private String returnId;

	/**
	 * IP地址
	 */
	@TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("IP地址")
	private String ip;
}
