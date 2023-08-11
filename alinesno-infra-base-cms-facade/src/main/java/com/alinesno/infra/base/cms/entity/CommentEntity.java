package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：comment 表备注：
 *
 * 字段：
 * - commentid：评论ID
 * - siteid：站点ID
 * - title：标题
 * - url：URL
 * - total：总数
 * - square：正方数
 * - anti：反方数
 * - neutral：中立数
 * - displayType：显示类型
 * - tableid：表格ID
 * - lastupdate：最后更新时间
 *
 * @TableName("comment")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("comment")
public class CommentEntity extends InfraBaseEntity {

	// 字段

	/**
	 * 评论ID
	 */
	@TableField("commentid")
	private String commentid;

	/**
	 * 站点ID
	 */
	@TableField("siteid")
	private Integer siteid;

	/**
	 * 标题
	 */
	@TableField("title")
	private String title;

	/**
	 * URL
	 */
	@TableField("url")
	private String url;

	/**
	 * 总数
	 */
	@TableField("total")
	private Integer total;

	/**
	 * 正方数
	 */
	@TableField("square")
	private Integer square;

	/**
	 * 反方数
	 */
	@TableField("anti")
	private Integer anti;

	/**
	 * 中立数
	 */
	@TableField("neutral")
	private Integer neutral;

	/**
	 * 显示类型
	 */
	@TableField("display_type")
	private Integer displayType;

	/**
	 * 表格ID
	 */
	@TableField("tableid")
	private Integer tableid;

	/**
	 * 最后更新时间
	 */
	@TableField("lastupdate")
	private Integer lastupdate;

	// Getter and Setter methods

	public String getCommentid() {
		return this.commentid;
	}

	public CommentEntity setCommentid(String commentid) {
		this.commentid = commentid;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public CommentEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public CommentEntity setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getUrl() {
		return this.url;
	}

	public CommentEntity setUrl(String url) {
		this.url = url;
		return this;
	}

	public Integer getTotal() {
		return this.total;
	}

	public CommentEntity setTotal(Integer total) {
		this.total = total;
		return this;
	}

	public Integer getSquare() {
		return this.square;
	}

	public CommentEntity setSquare(Integer square) {
		this.square = square;
		return this;
	}

	public Integer getAnti() {
		return this.anti;
	}

	public CommentEntity setAnti(Integer anti) {
		this.anti = anti;
		return this;
	}

	public Integer getNeutral() {
		return this.neutral;
	}

	public CommentEntity setNeutral(Integer neutral) {
		this.neutral = neutral;
		return this;
	}

	public Integer getDisplayType() {
		return this.displayType;
	}

	public CommentEntity setDisplayType(Integer displayType) {
		this.displayType = displayType;
		return this;
	}

	public Integer getTableid() {
		return this.tableid;
	}

	public CommentEntity setTableid(Integer tableid) {
		this.tableid = tableid;
		return this;
	}

	public Integer getLastupdate() {
		return this.lastupdate;
	}

	public CommentEntity setLastupdate(Integer lastupdate) {
		this.lastupdate = lastupdate;
		return this;
	}
}
