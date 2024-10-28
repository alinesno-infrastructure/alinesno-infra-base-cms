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

import java.util.Date;

/**
 * 链接信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_links")
@Table(comment = "链接信息表")
public class WpLinksEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long linkId;

    /**
     * 链接URL
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("链接URL")
    private String linkUrl;

    /**
     * 链接标题
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("链接标题")
    private String linkName;

    /**
     * 链接图片
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("链接图片")
    private String linkImage;

    /**
     * 链接打开方式
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 25)
    @ColumnComment("链接打开方式")
    private String linkTarget;

    /**
     * 链接描述
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.TEXT)
    @ColumnComment("链接描述")
    private String linkDescription;

    /**
     * 是否可见（Y/N）
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.CHAR, length = 1)
    @ColumnComment("是否可见（Y/N）")
    private String linkVisible;

    /**
     * 添加者用户ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("添加者用户ID")
    private Long linkOwner;

    /**
     * 评分等级
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.INT, length = 11)
    @ColumnComment("评分等级")
    private Integer linkRating;

    /**
     * 未知
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("未知")
    private Date linkUpdated;

    /**
     * XFN关系
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("XFN关系")
    private String linkRel;

    /**
     * XFN注释
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("XFN注释")
    private String linkNotes;

    /**
     * 链接RSS地址
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("链接RSS地址")
    private String linkRss;

}