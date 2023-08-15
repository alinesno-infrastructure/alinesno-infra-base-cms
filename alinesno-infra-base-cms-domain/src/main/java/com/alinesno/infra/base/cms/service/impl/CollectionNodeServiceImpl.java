package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CollectionNodeEntity;
import com.alinesno.infra.base.cms.mapper.CollectionNodeMapper;
import com.alinesno.infra.base.cms.service.ICollectionNodeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 采集节点Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CollectionNodeServiceImpl extends IBaseServiceImpl<CollectionNodeEntity, CollectionNodeMapper> implements ICollectionNodeService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CollectionNodeServiceImpl.class);
}