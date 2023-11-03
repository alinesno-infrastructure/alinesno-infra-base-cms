package com.alinesno.infra.base.cms.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class CommentData1Entity extends InfraBaseEntity {

	// Fields

	/**
	 * 评论ID号
	 */
	@TableField("commentid")
	@ColumnType(length=10)
	@ColumnComment("评论ID号")
	private String commentid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	@ColumnType(length=10)
	@ColumnComment("站点ID")
	private Integer siteid;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType(length=20)
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length=255)
	@ColumnComment("用户名")
	private String username;

	/**
	 * 发布时间
	 */
	@TableField("creat_at")
	@ColumnType(length=20)
	@ColumnComment("发布时间")
	private Integer creatAt;

	/**
	 * 用户IP地址
	 */
	@TableField("ip")
	@ColumnType(length=15)
	@ColumnComment("用户IP地址")
	private String ip;

	/**
	 * 评论状态{0:未审核,-1:未通过审核,1:通过审核}
	 */
	@TableField("status")
	@ColumnType(length=1)
	@ColumnComment("评论状态")
	private Integer status;

	/**
	 * 评论内容
	 */
	@TableField("content")
	@ColumnType(length=255)
	@ColumnComment("评论内容")
	private String content;

	/**
	 * 评论方向{0:无方向,1:正文,2:反方,3:中立}
	 */
	@TableField("direction")
	@ColumnType(length=1)
	@ColumnComment("评论方向")
	private Integer direction;

	/**
	 * 支持数
	 */
	@TableField("support")
	@ColumnType(length=50)
	@ColumnComment("支持数")
	private Integer support;

	/**
	 * 是否为回复
	 */
	@TableField("reply")
	@ColumnType(length=1)
	@ColumnComment("是否为回复")
	private Integer reply;
}
