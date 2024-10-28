// IWpUserMetaService.java
package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.WpUserMetaEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * 用户元数据服务接口
 * 该接口继承了基础服务接口IBaseService，用于对用户元数据实体(WpUserMetaEntity)进行CRUD操作
 */
public interface IWpUserMetaService extends IBaseService<WpUserMetaEntity> {
 
}