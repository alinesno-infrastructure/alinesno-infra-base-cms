package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文章分类、链接分类、标签的信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_terms")
@Table(comment = "文章分类、链接分类、标签的信息表")
public class WpTermsEntity extends InfraBaseEntity {

    /**
     * 分类ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("分类ID")
    private Long termId;

    /**
     * 分类名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 200)
    @ColumnComment("分类名")
    private String name;

    /**
     * 缩略名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 200)
    @ColumnComment("缩略名")
    private String slug;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("未知")
    private Long termGroup;

}