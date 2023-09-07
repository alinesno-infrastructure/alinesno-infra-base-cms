package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CollectionProgramEntity;
import com.alinesno.infra.base.cms.mapper.CollectionProgramMapper;
import com.alinesno.infra.base.cms.service.ICollectionProgramService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 采集程序Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CollectionProgramServiceImpl extends IBaseServiceImpl<CollectionProgramEntity, CollectionProgramMapper> implements ICollectionProgramService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CollectionProgramServiceImpl.class);
}