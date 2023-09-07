package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CacheEntity;
import com.alinesno.infra.base.cms.mapper.CacheMapper;
import com.alinesno.infra.base.cms.service.ICacheService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 缓存Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CacheServiceImpl extends IBaseServiceImpl<CacheEntity, CacheMapper> implements ICacheService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CacheServiceImpl.class);
}