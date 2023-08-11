package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：comment_data_1 表备注：
 *
 * Fields:
 * - commentid: 评论ID号
 * - siteid: 站点ID
 * - userid: 用户ID
 * - username: 用户名
 * - creatAt: 发布时间
 * - ip: 用户IP地址
 * - status: 评论状态{0:未审核,-1:未通过审核,1:通过审核}
 * - content: 评论内容
 * - direction: 评论方向{0:无方向,1:正文,2:反方,3:中立}
 * - support: 支持数
 * - reply: 是否为回复
 *
 * @TableName("comment_data_1")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("comment_data_1")
public class CommentData1Entity extends InfraBaseEntity {

	// Fields

	/**
	 * 评论ID号
	 */
	@TableField("commentid")
	private String commentid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	private Integer userid;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 发布时间
	 */
	@TableField("creat_at")
	private Integer creatAt;

	/**
	 * 用户IP地址
	 */
	@TableField("ip")
	private String ip;

	/**
	 * 评论状态{0:未审核,-1:未通过审核,1:通过审核}
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 评论内容
	 */
	@TableField("content")
	private String content;

	/**
	 * 评论方向{0:无方向,1:正文,2:反方,3:中立}
	 */
	@TableField("direction")
	private Integer direction;

	/**
	 * 支持数
	 */
	@TableField("support")
	private Integer support;

	/**
	 * 是否为回复
	 */
	@TableField("reply")
	private Integer reply;

	// Getter and Setter methods
	public String getCommentid() {
		return this.commentid;
	}

	public CommentData1Entity setCommentid(String commentid) {
		this.commentid = commentid;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public CommentData1Entity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public CommentData1Entity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public CommentData1Entity setUsername(String username) {
		this.username = username;
		return this;
	}

	public Integer getCreatAt() {
		return this.creatAt;
	}

	public CommentData1Entity setCreatAt(Integer creatAt) {
		this.creatAt = creatAt;
		return this;
	}

	public String getIp() {
		return this.ip;
	}

	public CommentData1Entity setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public CommentData1Entity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getContent() {
		return this.content;
	}

	public CommentData1Entity setContent(String content) {
		this.content = content;
		return this;
	}

	public Integer getDirection() {
		return this.direction;
	}

	public CommentData1Entity setDirection(Integer direction) {
		this.direction = direction;
		return this;
	}

	public Integer getSupport() {
		return this.support;
	}

	public CommentData1Entity setSupport(Integer support) {
		this.support = support;
		return this;
	}

	public Integer getReply() {
		return this.reply;
	}

	public CommentData1Entity setReply(Integer reply) {
		this.reply = reply;
		return this;
	}
}
