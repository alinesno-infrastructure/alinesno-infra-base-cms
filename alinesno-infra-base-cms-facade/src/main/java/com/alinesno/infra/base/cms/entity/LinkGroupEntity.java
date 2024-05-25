package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;

/**
 * 友情链接分组表对象 [link_group]
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("link_group")
@Data
public class LinkGroupEntity extends InfraBaseEntity {

    @TableField("link_group_id")
    @ColumnType(length=255)
    @ColumnComment("链接分组id")
    private Long linkGroupId;

    /**
     * 所属站点ID
     */
    @TableField("site_id")
    @ColumnType(length=255)
    @ColumnComment("所属站点ID")
    private Long siteId;

    /**
     * 链接名称
     */
    @TableField("name")
    @ColumnType(length=255)
    @ColumnComment("链接名称")
    private String name;

    /**
     * 链接编码
     */
    @TableField("code")
    @ColumnType(length=255)
    @ColumnComment("链接编码")
    private String code;
    
    /**
     * 排序标识
     */
    @TableField("sort_flag")
    @ColumnType(length=255)
    @ColumnComment("排序标识")
    private Long sortFlag;
}
