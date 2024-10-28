// IWpPostMetaService.java
package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.WpPostMetaEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * 文章元数据服务接口
 * 该接口继承了基础服务接口IBaseService，用于对文章元数据实体(WpPostMetaEntity)进行CRUD操作
 */
public interface IWpPostMetaService extends IBaseService<WpPostMetaEntity> {
 
}