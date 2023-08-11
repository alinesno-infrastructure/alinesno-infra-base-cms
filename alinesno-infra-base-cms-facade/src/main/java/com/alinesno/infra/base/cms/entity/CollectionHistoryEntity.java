package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 数据表：collection_history 表备注：
 * 集合历史实体类
 *
 * @TableName("collection_history")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("collection_history")
public class CollectionHistoryEntity extends InfraBaseEntity {

	// fields

	/**
	 * md5
	 */
	@TableField("md5")
	private String md5;

	/**
	 * siteid
	 */
	@TableField("siteid")
	private Integer siteid;

	// getter and setter methods

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}
}
