package com.alinesno.infra.base.cms.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：attachment 表备注：
 * 附件表实体类
 *
 * @TableName("attachment")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("attachment")
public class AttachmentEntity extends InfraBaseEntity {

	// fields

	/**
	 * aid
	 */
	@Excel(name = "aid")
	@TableField("aid")
	@ColumnType
	@ColumnComment("aid")
	private Integer aid;

	/**
	 * module
	 */
	@Excel(name = "module")
	@TableField("module")
	@ColumnType(length = 255)
	@ColumnComment("module")
	private String module;

	/**
	 * catid
	 */
	@Excel(name = "catid")
	@TableField("catid")
	@ColumnType
	@ColumnComment("catid")
	private Integer catid;

	/**
	 * filename
	 */
	@Excel(name = "filename")
	@TableField("filename")
	@ColumnType(length = 255)
	@ColumnComment("filename")
	private String filename;

	/**
	 * filepath
	 */
	@Excel(name = "filepath")
	@TableField("filepath")
	@ColumnType(length = 255)
	@ColumnComment("filepath")
	private String filepath;

	/**
	 * filesize
	 */
	@Excel(name = "filesize")
	@TableField("filesize")
	@ColumnType
	@ColumnComment("filesize")
	private Integer filesize;

	/**
	 * fileext
	 */
	@Excel(name = "fileext")
	@TableField("fileext")
	@ColumnType(length = 255)
	@ColumnComment("fileext")
	private String fileext;

	/**
	 * isimage
	 */
	@Excel(name = "isimage")
	@TableField("isimage")
	@ColumnType
	@ColumnComment("isimage")
	private Integer isimage;

	/**
	 * isthumb
	 */
	@Excel(name = "isthumb")
	@TableField("isthumb")
	@ColumnType
	@ColumnComment("isthumb")
	private Integer isthumb;

	/**
	 * downloads
	 */
	@Excel(name = "downloads")
	@TableField("downloads")
	@ColumnType
	@ColumnComment("downloads")
	private Integer downloads;

	/**
	 * userid
	 */
	@Excel(name = "userid")
	@TableField("userid")
	@ColumnType
	@ColumnComment("userid")
	private Integer userid;

	/**
	 * uploadtime
	 */
	@Excel(name = "uploadtime")
	@TableField("uploadtime")
	@ColumnType
	@ColumnComment("uploadtime")
	private Integer uploadtime;

	/**
	 * uploadip
	 */
	@Excel(name = "uploadip")
	@TableField("uploadip")
	@ColumnType(length = 255)
	@ColumnComment("uploadip")
	private String uploadip;

	/**
	 * status
	 */
	@Excel(name = "status")
	@TableField("status")
	@ColumnType
	@ColumnComment("status")
	private Integer status;

	/**
	 * authcode
	 */
	@Excel(name = "authcode")
	@TableField("authcode")
	@ColumnType(length = 255)
	@ColumnComment("authcode")
	private String authcode;

	/**
	 * siteid
	 */
	@Excel(name = "siteid")
	@TableField("siteid")
	@ColumnType
	@ColumnComment("siteid")
	private Integer siteid;
}

