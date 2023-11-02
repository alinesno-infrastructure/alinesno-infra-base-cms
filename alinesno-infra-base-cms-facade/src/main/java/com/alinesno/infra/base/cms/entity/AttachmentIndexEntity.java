package com.alinesno.infra.base.cms.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 数据表：attachment_index 表备注：
 * 附件索引表实体类
 *
 * @TableName("attachment_index")
 * @author luoxiaodong
 *@version 1.0.0
 */
@Data
@TableName("attachment_index")
public class AttachmentIndexEntity extends InfraBaseEntity {

	// fields

	/**
	 * keyid
	 */
	@Excel(name = "keyid")
	@TableField("keyid")
	@ColumnType(length = 255)
	@ColumnComment("keyid")
	private String keyid;

	/**
	 * aid
	 */
	@Excel(name = "aid")
	@TableField("aid")
	@ColumnType(length = 255)
	@ColumnComment("aid")
	private String aid;
}
