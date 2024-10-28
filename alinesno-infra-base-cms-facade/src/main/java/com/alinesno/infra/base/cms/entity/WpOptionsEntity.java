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
 * 基本配置信息,
 * 通常通过 get_option() 函数来操作，该表通常作为插件存储数据的表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_options")
@Table(comment = "基本配置信息表")
public class WpOptionsEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long optionId;

    /**
     * 博客ID，用于多用户博客，默认0
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("博客ID，用于多用户博客，默认0")
    private Long blogId;

    /**
     * 键名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 191)
    @ColumnComment("键名")
    private String optionName;

    /**
     * 键值
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.LONGTEXT)
    @ColumnComment("键值")
    private String optionValue;

    /**
     * 在WordPress载入时自动载入（yes/no）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.CHAR, length = 3)
    @ColumnComment("在WordPress载入时自动载入（yes/no）")
    private String autoload;

}