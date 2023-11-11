package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import java.util.Date;

/**
 * 数据表：cms_manager_account_record 表备注：
 * CMS管理员账户记录实体类
 *
 * @TableName("cms_manager_account_record")
 * @author luoxiaodong
 *@version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("cms_manager_account_record")
@Data
public class CMSManagerAccountRecordEntity extends InfraBaseEntity {

    // fields

    /**
     * 操作
     */
    @TableField
	@ColumnType(length=255)
	@ColumnComment("活动")
    private String operation;

    /**
     * 执行时间
     */
    @TableField("method_time")
	@ColumnType(length=255)
	@ColumnComment("methodTime")
    private long methodTime;

    /**
     * 类方法
     */
    @TableField("method")
	@ColumnType(length=255)
	@ColumnComment("方法")
    private String method;

    /**
     * 请求参数
     */
    @TableField("params")
    @Lob
    @Basic(fetch = FetchType.LAZY)
	@ColumnType(length=255)
	@ColumnComment("params")
    private String params;

    /**
     * 方法描述
     */
    @TableField("method_desc")
	@ColumnType(length=255)
	@ColumnComment("methodDesc")
    private String methodDesc;

    /**
     * 请求记录
     */
    @TableField("record_type")
	@ColumnType(length=255)
	@ColumnComment("recordType")
    private String recordType;

    /**
     * 服务器IP
     */
    @TableField("ip")
	@ColumnType(length=255)
	@ColumnComment("ip")
    private String ip;

    /**
     * 请求链接
     */
    @TableField("url")
	@ColumnType(length=255)
	@ColumnComment("url")
    private String url;

    /**
     * 浏览器信息
     */
    @Lob
	@ColumnType(length=255)
	@ColumnComment("代理人")
	@TableField("agent")
    private String agent;

    /**
     * 创建时间
     */
    @TableField("create_time")
	@ColumnType(length=255)
	@ColumnComment("createTime")
    private Date createTime;

    /**
     * 账户ID
     */
    @TableField("account_id")
	@ColumnType(length=255)
	@ColumnComment("accountId")
    private String accountId;

    /**
     * 登录名
     */
    @TableField("login_name")
	@ColumnType(length=255)
	@ColumnComment("登录名")
    private String loginName;

    /**
     * 用户名
     */
    @TableField("account_name")
	@ColumnType(length=255)
	@ColumnComment("accountName")
    private String accountName;

    /**
     * 角色权限
     */
    @TableField("role_power")
	@ColumnType(length=255)
	@ColumnComment("rolePower")
    private String rolePower;
}
