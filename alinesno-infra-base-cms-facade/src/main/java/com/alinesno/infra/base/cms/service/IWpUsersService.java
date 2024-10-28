// IWpUsersService.java
package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.WpUsersEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * 用户服务接口
 * 该接口继承了基础服务接口IBaseService，用于对用户实体(WpUsersEntity)进行CRUD操作
 */
public interface IWpUsersService extends IBaseService<WpUsersEntity> {
 
}