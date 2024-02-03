package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：block_history 表备注：
 * 区块历史记录实体类
 *
 * @TableName("block_history")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("block_history")
public class BlockHistoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * 区块ID
	 */
	@TableField("blockid")
	@ColumnType
	@ColumnComment("区块ID")
	private Integer blockid;

	/**
	 * 数据
	 */
	@TableField("data")
	@ColumnType(length = 255)
	@ColumnComment("数据")
	private String data;

	/**
	 * 创建时间
	 */
	@TableField("creat_at")
	@ColumnType
	@ColumnComment("创建时间")
	private Integer creatAt;

	/**
	 * 用户ID
	 */
	@TableField("userid")
	@ColumnType
	@ColumnComment("用户ID")
	private Integer userid;

	/**
	 * 用户名
	 */
	@TableField("username")
	@ColumnType(length = 255)
	@ColumnComment("用户名")
	private String username;
}
