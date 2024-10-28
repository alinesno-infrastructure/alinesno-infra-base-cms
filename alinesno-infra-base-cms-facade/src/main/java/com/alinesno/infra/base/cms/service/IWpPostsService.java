// IWpPostsService.java
package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.WpPostsEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * 文章服务接口
 * 该接口继承了基础服务接口IBaseService，用于对文章实体(WpPostsEntity)进行CRUD操作
 */
public interface IWpPostsService extends IBaseService<WpPostsEntity> {
 
}