package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CollectionHistoryEntity;
import com.alinesno.infra.base.cms.mapper.CollectionHistoryMapper;
import com.alinesno.infra.base.cms.service.ICollectionHistoryService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 采集历史Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CollectionHistoryServiceImpl extends IBaseServiceImpl<CollectionHistoryEntity, CollectionHistoryMapper> implements ICollectionHistoryService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CollectionHistoryServiceImpl.class);
}