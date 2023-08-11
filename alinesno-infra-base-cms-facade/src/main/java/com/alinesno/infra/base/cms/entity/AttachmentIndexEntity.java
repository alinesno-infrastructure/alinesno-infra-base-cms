package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：attachment_index 表备注：
 * 附件索引表实体类
 *
 * @TableName("attachment_index")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("attachment_index")
public class AttachmentIndexEntity extends InfraBaseEntity {

	// fields

	/**
	 * keyid
	 */
	@Excel(name = "keyid")
	@TableField("keyid")
	private String keyid;

	/**
	 * aid
	 */
	@Excel(name = "aid")
	@TableField("aid")
	private String aid;

	// getter and setter methods

	/**
	 * 获取 keyid
	 */
	public String getKeyid() {
		return this.keyid;
	}

	/**
	 * 设置 keyid
	 */
	public AttachmentIndexEntity setKeyid(String keyid) {
		this.keyid = keyid;
		return this;
	}

	/**
	 * 获取 aid
	 */
	public String getAid() {
		return this.aid;
	}

	/**
	 * 设置 aid
	 */
	public AttachmentIndexEntity setAid(String aid) {
		this.aid = aid;
		return this;
	}
}
