package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：block_history 表备注：
 * 区块历史记录实体类
 *
 * @TableName("block_history")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("block_history")
public class BlockHistoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * 区块ID
	 */
	@TableField("blockid")
	private Integer blockid;

	/**
	 * 数据
	 */
	@TableField("data")
	private String data;

	/**
	 * 创建时间
	 */
	@TableField("creat_at")
	private Integer creatAt;

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

	// getter and setter methods

	public Integer getBlockid() {
		return this.blockid;
	}

	public BlockHistoryEntity setBlockid(Integer blockid) {
		this.blockid = blockid;
		return this;
	}

	public String getData() {
		return this.data;
	}

	public BlockHistoryEntity setData(String data) {
		this.data = data;
		return this;
	}

	public Integer getCreatAt() {
		return this.creatAt;
	}

	public BlockHistoryEntity setCreatAt(Integer creatAt) {
		this.creatAt = creatAt;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public BlockHistoryEntity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public BlockHistoryEntity setUsername(String username) {
		this.username = username;
		return this;
	}
}
