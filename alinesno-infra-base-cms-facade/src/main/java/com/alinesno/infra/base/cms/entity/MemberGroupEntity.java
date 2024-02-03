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
 * 数据表： member_group 表备注：
 * 会员组实体类
 *
 * @TableName("member_group")
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("member_group")
@Data
public class MemberGroupEntity extends InfraBaseEntity {

	// fields
	/**
	 * groupid
	 */
	@Excel(name = "groupid")
	@TableField("groupid")
	@ColumnType(length=255)
	@ColumnComment("groupid")
	private Integer groupid;

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
	private String name;

	/**
	 * 是否系统组
	 */
	@Excel(name = "issystem")
	@TableField("issystem")
	@ColumnType(length=255)
	@ColumnComment("是否系统组")
	private Integer issystem;

	/**
	 * 星级
	 */
	@Excel(name = "starnum")
	@TableField("starnum")
	@ColumnType(length=255)
	@ColumnComment("星级")
	private Integer starnum;

	/**
	 * 积分
	 */
	@Excel(name = "point")
	@TableField("point")
	@ColumnType(length=255)
	@ColumnComment("积分")
	private Integer point;

	/**
	 * 是否允许发短消息
	 */
	@Excel(name = "allowmessage")
	@TableField("allowmessage")
	@ColumnType(length=255)
	@ColumnComment("是否允许发短消息")
	private Integer allowmessage;

	/**
	 * 是否允许访问
	 */
	@Excel(name = "allowvisit")
	@TableField("allowvisit")
	@ColumnType(length=255)
	@ColumnComment("是否允许访问")
	private Integer allowvisit;

	/**
	 * 是否允许发帖
	 */
	@Excel(name = "allowpost")
	@TableField("allowpost")
	@ColumnType(length=255)
	@ColumnComment("是否允许发帖")
	private Integer allowpost;

	/**
	 * 发帖是否需要审核
	 */
	@Excel(name = "allowpostverify")
	@TableField("allowpostverify")
	@ColumnType(length=255)
	@ColumnComment("发帖是否需要审核")
	private Integer allowpostverify;

	/**
	 * 是否允许搜索
	 */
	@Excel(name = "allowsearch")
	@TableField("allowsearch")
	@ColumnType(length=255)
	@ColumnComment("是否允许搜索")
	private Integer allowsearch;

	/**
	 * 是否允许升级
	 */
	@Excel(name = "allowupgrade")
	@TableField("allowupgrade")
	@ColumnType(length=255)
	@ColumnComment("是否允许升级")
	private Integer allowupgrade;

	/**
	 * 是否允许发送短消息
	 */
	@Excel(name = "allowsendmessage")
	@TableField("allowsendmessage")
	@ColumnType(length=255)
	@ColumnComment("是否允许发送短消息")
	private Integer allowsendmessage;

	/**
	 * 允许的最大发帖数
	 */
	@Excel(name = "allowpostnum")
	@TableField("allowpostnum")
	@ColumnType(length=255)
	@ColumnComment("允许的最大发帖数")
	private Integer allowpostnum;

	/**
	 * 是否允许附件
	 */
	@Excel(name = "allowattachment")
	@TableField("allowattachment")
	@ColumnType(length=255)
	@ColumnComment("是否允许附件")
	private Integer allowattachment;

	/**
	 * 年费价格
	 */
	@Excel(name = "priceY")
	@TableField("price_y")
	@ColumnType(length=255)
	@ColumnComment("年费价格")
	private BigDecimal priceY;

	/**
	 * 月费价格
	 */
	@Excel(name = "priceM")
	@TableField("price_m")
	@ColumnType(length=255)
	@ColumnComment("月费价格")
	private BigDecimal priceM;

	/**
	 * 日费价格
	 */
	@Excel(name = "priceD")
	@TableField("price_d")
	@ColumnType(length=255)
	@ColumnComment("日费价格")
	private BigDecimal priceD;

	/**
	 * 图标
	 */
	@Excel(name = "icon")
	@TableField("icon")
	@ColumnType(length=255)
	@ColumnComment("图标")
	private String icon;

	/**
	 * 用户名颜色
	 */
	@Excel(name = "usernamecolor")
	@TableField("usernamecolor")
	@ColumnType(length=255)
	@ColumnComment("用户名颜色")
	private String usernamecolor;

	/**
	 * 描述
	 */
	@Excel(name = "description")
	@TableField("description")
	@ColumnType(length=255)
	@ColumnComment("描述")
	private String description;

	/**
	 * 排序
	 */
	@Excel(name = "sort")
	@TableField("sort")
	@ColumnType(length=255)
	@ColumnComment("排序")
	private Integer sort;

	/**
	 * 是否禁用
	 */
	@Excel(name = "disabled")
	@TableField("disabled")
	@ColumnType(length=255)
	@ColumnComment("是否禁用")
	private Integer disabled;
}
