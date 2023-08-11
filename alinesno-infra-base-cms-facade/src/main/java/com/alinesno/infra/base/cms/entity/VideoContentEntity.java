package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： video_content 表备注：
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_content")
public class VideoContentEntity extends InfraBaseEntity {
	// fields
	@TableField("contentid")
	private Integer contentid;

	@TableField("modelid")
	private Integer modelid;

	@TableField("videoid")
	private Integer videoid;

	@TableField("listorder")
	private Integer listorder;

	// getter and setter
	public Integer getContentid() {
		return this.contentid;
	}

	public VideoContentEntity setContentid(Integer arg) {
		this.contentid = arg;
		return this;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public VideoContentEntity setModelid(Integer arg) {
		this.modelid = arg;
		return this;
	}

	public Integer getVideoid() {
		return this.videoid;
	}

	public VideoContentEntity setVideoid(Integer arg) {
		this.videoid = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public VideoContentEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}
}
