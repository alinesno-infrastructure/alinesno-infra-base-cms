package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据表：cache 表备注：
 * 缓存实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 * @TableName("cache")
 */
@EqualsAndHashCode(callSuper = true)
@TableName("cache")
@Data
public class CacheEntity extends InfraBaseEntity {

    /**
     * 文件名
     */
	@ColumnType(length=255)
	@ColumnComment("文件名")
	@TableField("file_name")
    private String fileName;

    /**
     * 路径
     */
	@ColumnType(length=255)
	@ColumnComment("路径")
	@TableField("path")
    private String path;

    /**
     * 数据
     */
	@ColumnType(length=255)
	@ColumnComment("数据")
	@TableField("data")
    private String data;
}
