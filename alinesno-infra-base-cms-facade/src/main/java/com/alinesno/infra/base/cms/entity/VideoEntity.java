package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表： video 表备注：
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("video")
public class VideoEntity extends InfraBaseEntity {

	// fields
	@TableField("catid")
	private Integer catid;

	@TableField("typeid")
	private Integer typeid;

	@TableField("title")
	private String title;

	@TableField("style")
	private String style;

	@TableField("thumb")
	private String thumb;

	@TableField("keywords")
	private String keywords;

	@TableField("description")
	private String description;

	@TableField("posids")
	private Integer posids;

	@TableField("url")
	private String url;

	@TableField("listorder")
	private Integer listorder;

	@TableField("status")
	private Integer status;

	@TableField("sysadd")
	private Integer sysadd;

	@TableField("islink")
	private Integer islink;

	@TableField("username")
	private String username;

	@TableField("inputtime")
	private Integer inputtime;

	@TableField("updatetime")
	private Integer updatetime;

	@TableField("vision")
	private String vision;

	@TableField("video_category")
	private String videoCategory;

	// getter and setter
	public Integer getCatid() {
		return this.catid;
	}

	public VideoEntity setCatid(Integer arg) {
		this.catid = arg;
		return this;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public VideoEntity setTypeid(Integer arg) {
		this.typeid = arg;
		return this;
	}

	public String getTitle() {
		return this.title;
	}

	public VideoEntity setTitle(String arg) {
		this.title = arg;
		return this;
	}

	public String getStyle() {
		return this.style;
	}

	public VideoEntity setStyle(String arg) {
		this.style = arg;
		return this;
	}

	public String getThumb() {
		return this.thumb;
	}

	public VideoEntity setThumb(String arg) {
		this.thumb = arg;
		return this;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public VideoEntity setKeywords(String arg) {
		this.keywords = arg;
		return this;
	}

	public String getDescription() {
		return this.description;
	}

	public VideoEntity setDescription(String arg) {
		this.description = arg;
		return this;
	}

	public Integer getPosids() {
		return this.posids;
	}

	public VideoEntity setPosids(Integer arg) {
		this.posids = arg;
		return this;
	}

	public String getUrl() {
		return this.url;
	}

	public VideoEntity setUrl(String arg) {
		this.url = arg;
		return this;
	}

	public Integer getListorder() {
		return this.listorder;
	}

	public VideoEntity setListorder(Integer arg) {
		this.listorder = arg;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public VideoEntity setStatus(Integer arg) {
		this.status = arg;
		return this;
	}

	public Integer getSysadd() {
		return this.sysadd;
	}

	public VideoEntity setSysadd(Integer arg) {
		this.sysadd = arg;
		return this;
	}

	public Integer getIslink() {
		return this.islink;
	}

	public VideoEntity setIslink(Integer arg) {
		this.islink = arg;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public VideoEntity setUsername(String arg) {
		this.username = arg;
		return this;
	}

	public Integer getInputtime() {
		return this.inputtime;
	}

	public VideoEntity setInputtime(Integer arg) {
		this.inputtime = arg;
		return this;
	}

	public Integer getUpdatetime() {
		return this.updatetime;
	}

	public VideoEntity setUpdatetime(Integer arg) {
		this.updatetime = arg;
		return this;
	}

	public String getVision() {
		return this.vision;
	}

	public VideoEntity setVision(String arg) {
		this.vision = arg;
		return this;
	}

	public String getVideoCategory() {
		return this.videoCategory;
	}

	public VideoEntity setVideoCategory(String arg) {
		this.videoCategory = arg;
		return this;
	}
}
