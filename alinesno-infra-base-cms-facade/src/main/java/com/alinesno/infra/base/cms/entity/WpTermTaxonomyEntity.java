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
 * 分类信息表，区分 wp_terms 信息的分类类型
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_term_taxonomy")
@Table(comment = "分类信息表，区分 wp_terms 信息的分类类型，有 category、link_category 和 tag 三种分类类型")
public class WpTermTaxonomyEntity extends InfraBaseEntity {

    /**
     * 分类方法ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("分类方法ID")
    private Long termTaxonomyId;

    /**
     * 分类ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("分类ID")
    private Long termId;

    /**
     * 分类方法（category/post_tag/link_category）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 32)
    @ColumnComment("分类方法(category/post_tag/link_category)")
    private String taxonomy;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.LONGTEXT)
    @ColumnComment("未知")
    private String description;

    /**
     * 所属父分类方法ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("所属父分类方法ID")
    private Long parent;

    /**
     * 文章数统计
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("文章数统计")
    private Long count;

}