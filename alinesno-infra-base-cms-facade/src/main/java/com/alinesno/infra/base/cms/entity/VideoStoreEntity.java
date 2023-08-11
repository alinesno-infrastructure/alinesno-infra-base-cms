package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： video_store 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video_store")
public class VideoStoreEntity extends InfraBaseEntity {
	
	// fields
	@TableField("videoid")
	private Integer videoid;

	@TableField("title")
	private String title;

	@TableField("vid")
	private String vid;

	@TableField("keywords")
	private String keywords;

	@TableField("description")
	private String description;

	@TableField("status")
	private Integer status;

	@TableField("listorder")
	private Integer listorder;

	@TableField("addtime")
	private Integer addtime;

	@TableField("userid")
	private Integer userid;

	@TableField("picpath")
	private String picpath;

	@TableField("size")
	private String size;

	@TableField("timelen")
	private Integer timelen;

	@TableField("userupload")
	private Integer userupload;

	@TableField("channelid")
	private Integer channelid;

	// getter and setter
	public Integer getVideoid() {
		return this.videoid;
	}

	public VideoStoreEntity setVideoid(Integer arg) {
		this.videoid = arg;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public VideoStoreEntity setTitle(String arg) {
		this.title = arg;
		return this;
	}

	public String getVid() {
		return this.vid;
	}

	public VideoStoreEntity setVid(String arg) {
		this.vid = arg;
		return this;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public VideoStoreEntity setKeywords(String arg) {
		this.keywords = arg;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public VideoStoreEntity setDescription(String arg) {
		this.description = arg;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public VideoStoreEntity setStatus(Integer arg) {
		this.status = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public VideoStoreEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}

	public Integer getAddtime() {
		return this.addtime;
	}

	public VideoStoreEntity setAddtime(Integer arg) {
		this.addtime = arg;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public VideoStoreEntity setUserid(Integer arg) {
		this.userid = arg;
		return this;
	}

	public String getPicpath() {
		return this.picpath;
	}

	public VideoStoreEntity setPicpath(String arg) {
		this.picpath = arg;
		return this;
	}

	public String getSize() {
		return this.size;
	}

	public VideoStoreEntity setSize(String arg) {
		this.size = arg;
		return this;
	}

	public Integer getTimelen() {
		return this.timelen;
	}

	public VideoStoreEntity setTimelen(Integer arg) {
		this.timelen = arg;
		return this;
	}

	public Integer getUserupload() {
		return this.userupload;
	}

	public VideoStoreEntity setUserupload(Integer arg) {
		this.userupload = arg;
		return this;
	}

	public Integer getChannelid() {
		return this.channelid;
	}

	public VideoStoreEntity setChannelid(Integer arg) {
		this.channelid = arg;
		return this;
	}
}
