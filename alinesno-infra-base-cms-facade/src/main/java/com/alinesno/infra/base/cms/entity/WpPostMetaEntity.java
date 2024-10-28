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
 * 文章额外数据
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_postmeta")
@Table(comment = "文章额外数据表，例如文章浏览次数，文章的自定义字段等都存储在这里")
public class WpPostMetaEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long metaId;

    /**
     * 对应文章ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("对应文章ID")
    private Long postId;

    /**
     * 键名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("键名")
    private String metaKey;

    /**
     * 键值
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.LONGTEXT)
    @ColumnComment("键值")
    private String metaValue;

}