package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：attachment 表备注：
 * 附件表实体类
 *
 * @TableName("attachment")
 * @author luoxiaodong
 *@version 1.0.0
 */
@TableName("attachment")
public class AttachmentEntity extends InfraBaseEntity {

	// fields

	/**
	 * aid
	 */
	@Excel(name = "aid")
	@TableField("aid")
	private Integer aid;

	/**
	 * module
	 */
	@Excel(name = "module")
	@TableField("module")
	private String module;

	/**
	 * catid
	 */
	@Excel(name = "catid")
	@TableField("catid")
	private Integer catid;

	/**
	 * filename
	 */
	@Excel(name = "filename")
	@TableField("filename")
	private String filename;

	/**
	 * filepath
	 */
	@Excel(name = "filepath")
	@TableField("filepath")
	private String filepath;

	/**
	 * filesize
	 */
	@Excel(name = "filesize")
	@TableField("filesize")
	private Integer filesize;

	/**
	 * fileext
	 */
	@Excel(name = "fileext")
	@TableField("fileext")
	private String fileext;

	/**
	 * isimage
	 */
	@Excel(name = "isimage")
	@TableField("isimage")
	private Integer isimage;

	/**
	 * isthumb
	 */
	@Excel(name = "isthumb")
	@TableField("isthumb")
	private Integer isthumb;

	/**
	 * downloads
	 */
	@Excel(name = "downloads")
	@TableField("downloads")
	private Integer downloads;

	/**
	 * userid
	 */
	@Excel(name = "userid")
	@TableField("userid")
	private Integer userid;
	/**
	 * uploadtime
	 */
	@Excel(name = "uploadtime")
	@TableField("uploadtime")
	private Integer uploadtime;

	/**
	 * uploadip
	 */
	@Excel(name = "uploadip")
	@TableField("uploadip")
	private String uploadip;

	/**
	 * status
	 */
	@Excel(name = "status")
	@TableField("status")
	private Integer status;

	/**
	 * authcode
	 */
	@Excel(name = "authcode")
	@TableField("authcode")
	private String authcode;

	/**
	 * siteid
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	private Integer siteid;

	// getter and setter methods

	public Integer getAid() {
		return this.aid;
	}

	public AttachmentEntity setAid(Integer aid) {
		this.aid = aid;
		return this;
	}

	public String getModule() {
		return this.module;
	}

	public AttachmentEntity setModule(String module) {
		this.module = module;
		return this;
	}

	public Integer getCatid() {
		return this.catid;
	}

	public AttachmentEntity setCatid(Integer catid) {
		this.catid = catid;
		return this;
	}

	public String getFilename() {
		return this.filename;
	}

	public AttachmentEntity setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public AttachmentEntity setFilepath(String filepath) {
		this.filepath = filepath;
		return this;
	}

	public Integer getFilesize() {
		return this.filesize;
	}

	public AttachmentEntity setFilesize(Integer filesize) {
		this.filesize = filesize;
		return this;
	}

	public String getFileext() {
		return this.fileext;
	}

	public AttachmentEntity setFileext(String fileext) {
		this.fileext = fileext;
		return this;
	}

	public Integer getIsimage() {
		return this.isimage;
	}

	public AttachmentEntity setIsimage(Integer isimage) {
		this.isimage = isimage;
		return this;
	}

	public Integer getIsthumb() {
		return this.isthumb;
	}

	public AttachmentEntity setIsthumb(Integer isthumb) {
		this.isthumb = isthumb;
		return this;
	}

	public Integer getDownloads() {
		return this.downloads;
	}

	public AttachmentEntity setDownloads(Integer downloads) {
		this.downloads = downloads;
		return this;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public AttachmentEntity setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	public Integer getUploadtime() {
		return this.uploadtime;
	}

	public AttachmentEntity setUploadtime(Integer uploadtime) {
		this.uploadtime = uploadtime;
		return this;
	}

	public String getUploadip() {
		return this.uploadip;
	}

	public AttachmentEntity setUploadip(String uploadip) {
		this.uploadip = uploadip;
		return this;
	}

	public Integer getStatus() {
		return this.status;
	}

	public AttachmentEntity setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getAuthcode() {
		return this.authcode;
	}

	public AttachmentEntity setAuthcode(String authcode) {
		this.authcode = authcode;
		return this;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public AttachmentEntity setSiteid(Integer siteid) {
		this.siteid = siteid;
		return this;
	}
}

