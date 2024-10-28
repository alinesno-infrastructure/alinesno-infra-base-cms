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
 * 用户基本信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("wp_users")
@Table(comment = "用户基本信息表，存放系统所有用户基本信息")
public class WpUsersEntity extends InfraBaseEntity {

    /**
     * 自增唯一ID
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.BIGINT, length = 20)
    @ColumnComment("自增唯一ID")
    private Long id;

    /**
     * 登录名
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 60)
    @ColumnComment("登录名")
    private String userLogin;

    /**
     * 密码
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("密码")
    private String userPass;

    /**
     * 昵称
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 50)
    @ColumnComment("昵称")
    private String userNicename;

    /**
     * Email
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 100)
    @ColumnComment("Email")
    private String userEmail;

    /**
     * 网址
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 100)
    @ColumnComment("网址")
    private String userUrl;

    /**
     * 注册时间
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.DATETIME)
    @ColumnComment("注册时间")
    private Date userRegistered;

    /**
     * 激活码
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 255)
    @ColumnComment("激活码")
    private String userActivationKey;

    /**
     * 用户状态
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.INT, length = 11)
    @ColumnComment("用户状态")
    private Integer userStatus;

    /**
     * 显示名称
     */
    @TableField
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 250)
    @ColumnComment("显示名称")
    private String displayName;

}