package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：collection_history 表备注：
 * 集合历史实体类
 *
 * @TableName("collection_history")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_history")
@Data
public class CollectionHistoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * md5
	 */
	@TableField("md5")
	@ColumnType(length=255)
	@ColumnComment("md5")
	private String md5;

	/**
	 * siteid
	 */
	@TableField("siteid")
	@ColumnType(length=255)
	@ColumnComment("站点ID")
	private Integer siteid;
}
