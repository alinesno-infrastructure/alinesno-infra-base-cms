// IWpCommentsService.java
package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.WpCommentsEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * 评论服务接口
 * 该接口继承了基础服务接口IBaseService，用于对评论实体(WpCommentsEntity)进行CRUD操作
 */
public interface IWpCommentsService extends IBaseService<WpCommentsEntity> {
 
}