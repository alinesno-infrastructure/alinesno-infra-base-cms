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
 * 分类与文章信息表 wp_posts 、链接表 wp_links 的关联表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_term_relationships")
@Table(comment = "分类与文章信息表 wp_posts 、链接表 wp_links 的关联表")
public class WpTermRelationshipsEntity extends InfraBaseEntity {

    /**
     * 对应文章ID/链接ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("对应文章ID/链接ID")
    private Long objectId;

    /**
     * 对应分类方法ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("对应分类方法ID")
    private Long termTaxonomyId;

    /**
     * 排序
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.INT, length = 11)
    @ColumnComment("排序")
    private Integer termOrder;

}