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
	 * catId
	 */
	@Excel(name = "catId")
	@TableField("cat_id")
	@ColumnType
	@ColumnComment("catId")
	private Integer catId;

	/**
	 * 站点id
	 */
	@TableField("site_id")
	@ColumnType
	@ColumnComment("站点id")
	private Long siteId;

	/**
	 * 资源类型
	 */
	@TableField("resource_type")
	@ColumnType
	@ColumnComment("资源类型")
	private String resourceType;

	/**
	 * 资源类型名称
	 */
	@TableField(exist = false)
	private String resourceTypeName;

	/**
	 * 存储类型，默认：local
	 */
	@TableField("storage_type")
	@ColumnType
	@ColumnComment("存储类型，默认：local")
	private String storageType;

	/**
	 * 资源名称
	 */
	@TableField("name")
	@ColumnType
	@ColumnComment("资源名称")
	private String name;

	/**
	 * 资源路径（相对站点根目录路径）
	 */
	@TableField("path")
	@ColumnType
	@ColumnComment("资源路径（相对站点根目录路径）")
	private String path;

	/**
	 * 文件名称
	 */
	@TableField("file_name")
	@ColumnType
	@ColumnComment("文件名称")
	private String fileName;

	/**
	 * 后缀名，不带.
	 */
	@TableField("suffix")
	@ColumnType
	@ColumnComment("后缀名，不带.")
	private String suffix;

	/**
	 * 图片宽度
	 */
	@TableField("width")
	@ColumnType
	@ColumnComment("图片宽度")
	private Integer width;

	/**
	 * 图片高度
	 */
	@TableField("height")
	@ColumnType
	@ColumnComment("图片高度")
	private Integer height;

	/**
	 * 文件大小
	 */
	@TableField("file_size")
	@ColumnType
	@ColumnComment("文件大小")
	private Long fileSize;

	@TableField(exist = false)
	private String fileSizeName;

	/**
	 * 来源地址
	 */
	@TableField("source_url")
	@ColumnType
	@ColumnComment("来源地址")
	private String sourceUrl;

	/**
	 * 状态
	 */
	@TableField("status")
	@ColumnType
	@ColumnComment("状态")
	private String status;

	/**
	 * 引用关系
	 */
	@TableField("usage_info")
	@ColumnType
	@ColumnComment("引用关系")
	private String usageInfo;

	@TableField(exist = false)
	private String src;

	@TableField(exist = false)
	private String internalUrl;

	/**
	 * 备注
	 */
	@TableField("remark")
	@ColumnType
	@ColumnComment("备注")
	private String remark;
}

