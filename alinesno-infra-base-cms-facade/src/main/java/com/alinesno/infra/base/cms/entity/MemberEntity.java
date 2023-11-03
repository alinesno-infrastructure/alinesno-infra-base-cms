package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class MemberEntity extends InfraBaseEntity {

	// fields
	/**
	 * 用户ID
	 */
	@Excel(name = "userid")
	@TableField("userid")
	@ColumnType(length=255)
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * PHPSSO用户ID
	 */
	@Excel(name = "phpssouid")
	@TableField("phpssouid")
	@ColumnType(length=255)
	@ColumnComment("PHPSSO用户ID")
	private Integer phpssouid;

	/**
	 * 用户名
	 */
	@Excel(name = "username")
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 密码
	 */
	@Excel(name = "password")
	@TableField("password")
	@ColumnType(length=255)
	@ColumnComment("密码")
	private String password;

	/**
	 * 加密字符串
	 */
	@Excel(name = "encrypt")
	@TableField("encrypt")
	@ColumnType(length=255)
	@ColumnComment("加密字符串")
	private String encrypt;

	/**
	 * 昵称
	 */
	@Excel(name = "nickname")
	@TableField("nickname")
	@ColumnType(length=255)
	@ColumnComment("昵称")
	private String nickname;

	/**
	 * 注册日期
	 */
	@Excel(name = "regdate")
	@TableField("regdate")
	@ColumnType(length=255)
	@ColumnComment("注册日期")
	private Integer regdate;

	/**
	 * 最后登录日期
	 */
	@Excel(name = "lastdate")
	@TableField("lastdate")
	@ColumnType(length=255)
	@ColumnComment("最后登录日期")
	private Integer lastdate;

	/**
	 * 注册IP
	 */
	@Excel(name = "regip")
	@TableField("regip")
	@ColumnType(length=255)
	@ColumnComment("注册IP")
	private String regip;

	/**
	 * 最后登录IP
	 */
	@Excel(name = "lastip")
	@TableField("lastip")
	@ColumnType(length=255)
	@ColumnComment("最后登录IP")
	private String lastip;

	/**
	 * 登录次数
	 */
	@Excel(name = "loginnum")
	@TableField("loginnum")
	@ColumnType(length=255)
	@ColumnComment("登录次数")
	private Integer loginnum;

	/**
	 * 邮箱
	 */
	@Excel(name = "email")
	@TableField("email")
	@ColumnType(length=255)
	@ColumnComment("邮箱")
	private String email;

	/**
	 * 用户组ID
	 */
	@Excel(name = "groupid")
	@TableField("groupid")
	@ColumnType(length=255)
	@ColumnComment("用户组ID")
	private Integer groupid;

	/**
	 * 地区ID
	 */
	@Excel(name = "areaid")
	@TableField("areaid")
	@ColumnType(length=255)
	@ColumnComment("地区ID")
	private Integer areaid;

	/**
	 * 金额
	 */
	@Excel(name = "amount")
	@TableField("amount")
	@ColumnType(length=255)
	@ColumnComment("金额")
	private BigDecimal amount;

	/**
	 * 积分
	 */
	@Excel(name = "point")
	@TableField("point")
	@ColumnType(length=255)
	@ColumnComment("积分")
	private Integer point;

	/**
	 * 模型ID
	 */
	@Excel(name = "modelid")
	@TableField("modelid")
	@ColumnType(length=255)
	@ColumnComment("模型ID")
	private Integer modelid;

	/**
	 * 留言数
	 */
	@Excel(name = "message")
	@TableField("message")
	@ColumnType(length=255)
	@ColumnComment("留言数")
	private Integer message;

	/**
	 * 是否锁定
	 */
	@Excel(name = "islock")
	@TableField("islock")
	@ColumnType(length=255)
	@ColumnComment("是否锁定")
	private Integer islock;

	/**
	 * 是否VIP
	 */
	@Excel(name = "vip")
	@TableField("vip")
	@ColumnType(length=255)
	@ColumnComment("是否VIP")
	private Integer vip;

	/**
	 * 过期日期
	 */
	@Excel(name = "overduedate")
	@TableField("overduedate")
	@ColumnType(length=255)
	@ColumnComment("过期日期")
	private Integer overduedate;

	/**
	 * 站点ID
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 连接ID
	 */
	@Excel(name = "connectid")
	@TableField("connectid")
	@ColumnType(length=255)
	@ColumnComment("连接ID")
	private String connectid;

	/**
	 * 来源
	 */
	@Excel(name = "from")
	@TableField("from")
	@ColumnType(length=255)
	@ColumnComment("来源")
	private String from;

	/**
	 * 手机号码
	 */
	@Excel(name = "mobile")
	@TableField("mobile")
	@ColumnType(length=255)
	@ColumnComment("手机号码")
	private String mobile;
}
