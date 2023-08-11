package com.alinesno.infra.base.cms.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("cms_manager_account_record")
public class CMSManagerAccountRecordEntity extends InfraBaseEntity {

    // fields

    /**
     * 操作
     */
    @TableField
    private String operation;

    /**
     * 执行时间
     */
    @TableField("method_time")
    private long methodTime;

    /**
     * 类方法
     */
    @TableField("method")
    private String method;

    /**
     * 请求参数
     */
    @TableField("params")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String params;

    /**
     * 方法描述
     */
    @TableField("method_desc")
    private String methodDesc;

    /**
     * 请求记录
     */
    @TableField("record_type")
    private String recordType;

    /**
     * 服务器IP
     */
    @TableField("ip")
    private String ip;

    /**
     * 请求链接
     */
    @TableField("url")
    private String url;

    /**
     * 浏览器信息
     */
    @TableField("agent")
    @Lob
    private String agent;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 账户ID
     */
    @TableField("account_id")
    private String accountId;

    /**
     * 登录名
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 用户名
     */
    @TableField("account_name")
    private String accountName;

    /**
     * 角色权限
     */
    @TableField("role_power")
    private String rolePower;

    // getter and setter methods

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getMethodTime() {
        return this.methodTime;
    }

    public void setMethodTime(long methodTime) {
        this.methodTime = methodTime;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return this.params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getMethodDesc() {
        return this.methodDesc;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }

    public String getRecordType() {
        return this.recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAgent() {
        return this.agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRolePower() {
        return this.rolePower;
    }

    public void setRolePower(String rolePower) {
        this.rolePower = rolePower;
    }
}
