package com.alinesno.infra.base.cms.entity;

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
public class MemberGroupEntity extends InfraBaseEntity {

	// fields
	/**
	 * groupid
	 */
	@Excel(name = "groupid")
	@TableField("groupid")
	private Integer groupid;

	/**
	 * 名称
	 */
	@Excel(name = "name")
	@TableField("name")
	private String name;

	/**
	 * 是否系统组
	 */
	@Excel(name = "issystem")
	@TableField("issystem")
	private Integer issystem;

	/**
	 * 星级
	 */
	@Excel(name = "starnum")
	@TableField("starnum")
	private Integer starnum;

	/**
	 * 积分
	 */
	@Excel(name = "point")
	@TableField("point")
	private Integer point;

	/**
	 * 是否允许发短消息
	 */
	@Excel(name = "allowmessage")
	@TableField("allowmessage")
	private Integer allowmessage;

	/**
	 * 是否允许访问
	 */
	@Excel(name = "allowvisit")
	@TableField("allowvisit")
	private Integer allowvisit;

	/**
	 * 是否允许发帖
	 */
	@Excel(name = "allowpost")
	@TableField("allowpost")
	private Integer allowpost;

	/**
	 * 发帖是否需要审核
	 */
	@Excel(name = "allowpostverify")
	@TableField("allowpostverify")
	private Integer allowpostverify;

	/**
	 * 是否允许搜索
	 */
	@Excel(name = "allowsearch")
	@TableField("allowsearch")
	private Integer allowsearch;

	/**
	 * 是否允许升级
	 */
	@Excel(name = "allowupgrade")
	@TableField("allowupgrade")
	private Integer allowupgrade;

	/**
	 * 是否允许发送短消息
	 */
	@Excel(name = "allowsendmessage")
	@TableField("allowsendmessage")
	private Integer allowsendmessage;

	/**
	 * 允许的最大发帖数
	 */
	@Excel(name = "allowpostnum")
	@TableField("allowpostnum")
	private Integer allowpostnum;

	/**
	 * 是否允许附件
	 */
	@Excel(name = "allowattachment")
	@TableField("allowattachment")
	private Integer allowattachment;

	/**
	 * 年费价格
	 */
	@Excel(name = "priceY")
	@TableField("price_y")
	private BigDecimal priceY;

	/**
	 * 月费价格
	 */
	@Excel(name = "priceM")
	@TableField("price_m")
	private BigDecimal priceM;

	/**
	 * 日费价格
	 */
	@Excel(name = "priceD")
	@TableField("price_d")
	private BigDecimal priceD;

	/**
	 * 图标
	 */
	@Excel(name = "icon")
	@TableField("icon")
	private String icon;

	/**
	 * 用户名颜色
	 */
	@Excel(name = "usernamecolor")
	@TableField("usernamecolor")
	private String usernamecolor;

	/**
	 * 描述
	 */
	@Excel(name = "description")
	@TableField("description")
	private String description;

	/**
	 * 排序
	 */
	@Excel(name = "sort")
	@TableField("sort")
	private Integer sort;

	/**
	 * 是否禁用
	 */
	@Excel(name = "disabled")
	@TableField("disabled")
	private Integer disabled;

	// getter and setter
	public Integer getGroupid() {
		return this.groupid;
	}

	public MemberGroupEntity setGroupid(Integer arg) {
		this.groupid = arg;
		return this;
	}

	public String getName() {
		return this.name;
	}

	public MemberGroupEntity setName(String arg) {
		this.name = arg;
		return this;
	}

	public Integer getIssystem() {
		return this.issystem;
	}

	public MemberGroupEntity setIssystem(Integer arg) {
		this.issystem = arg;
		return this;
	}

	public Integer getStarnum() {
		return this.starnum;
	}

	public MemberGroupEntity setStarnum(Integer arg) {
		this.starnum = arg;
		return this;
	}

	public Integer getPoint() {
		return this.point;
	}

	public MemberGroupEntity setPoint(Integer arg) {
		this.point = arg;
		return this;
	}

	public Integer getAllowmessage() {
		return this.allowmessage;
	}

	public MemberGroupEntity setAllowmessage(Integer arg) {
		this.allowmessage = arg;
		return this;
	}

	public Integer getAllowvisit() {
		return this.allowvisit;
	}

	public MemberGroupEntity setAllowvisit(Integer arg) {
		this.allowvisit = arg;
		return this;
	}

	public Integer getAllowpost() {
		return this.allowpost;
	}

	public MemberGroupEntity setAllowpost(Integer arg) {
		this.allowpost = arg;
		return this;
	}

	public Integer getAllowpostverify() {
		return this.allowpostverify;
	}

	public MemberGroupEntity setAllowpostverify(Integer arg) {
		this.allowpostverify = arg;
		return this;
	}

	public Integer getAllowsearch() {
		return this.allowsearch;
	}

	public MemberGroupEntity setAllowsearch(Integer arg) {
		this.allowsearch = arg;
		return this;
	}

	public Integer getAllowupgrade() {
		return this.allowupgrade;
	}

	public MemberGroupEntity setAllowupgrade(Integer arg) {
		this.allowupgrade = arg;
		return this;
	}

	public Integer getAllowsendmessage() {
		return this.allowsendmessage;
	}

	public MemberGroupEntity setAllowsendmessage(Integer arg) {
		this.allowsendmessage = arg;
		return this;
	}

	public Integer getAllowpostnum() {
		return this.allowpostnum;
	}

	public MemberGroupEntity setAllowpostnum(Integer arg) {
		this.allowpostnum = arg;
		return this;
	}

	public Integer getAllowattachment() {
		return this.allowattachment;
	}

	public MemberGroupEntity setAllowattachment(Integer arg) {
		this.allowattachment = arg;
		return this;
	}

	public BigDecimal getPriceY() {
		return this.priceY;
	}

	public MemberGroupEntity setPriceY(BigDecimal arg) {
		this.priceY = arg;
		return this;
	}

	public BigDecimal getPriceM() {
		return this.priceM;
	}

	public MemberGroupEntity setPriceM(BigDecimal arg) {
		this.priceM = arg;
		return this;
	}

	public BigDecimal getPriceD() {
		return this.priceD;
	}

	public MemberGroupEntity setPriceD(BigDecimal arg) {
		this.priceD = arg;
		return this;
	}

	public String getIcon() {
		return this.icon;
	}

	public MemberGroupEntity setIcon(String arg) {
		this.icon = arg;
		return this;
	}

	public String getUsernamecolor() {
		return this.usernamecolor;
	}

	public MemberGroupEntity setUsernamecolor(String arg) {
		this.usernamecolor = arg;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public MemberGroupEntity setDescription(String arg) {
		this.description = arg;
		return this;
	}

	public Integer getSort() {
		return this.sort;
	}

	public MemberGroupEntity setSort(Integer arg) {
		this.sort = arg;
		return this;
	}

	public Integer getDisabled() {
		return this.disabled;
	}

	public MemberGroupEntity setDisabled(Integer arg) {
		this.disabled = arg;
		return this;
	}
}
