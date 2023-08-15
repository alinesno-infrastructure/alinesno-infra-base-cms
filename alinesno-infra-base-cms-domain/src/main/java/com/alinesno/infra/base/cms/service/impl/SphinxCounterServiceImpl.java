package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SphinxCounterEntity;
import com.alinesno.infra.base.cms.mapper.SphinxCounterMapper;
import com.alinesno.infra.base.cms.service.ISphinxCounterService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Sphinx计数器Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SphinxCounterServiceImpl extends IBaseServiceImpl<SphinxCounterEntity, SphinxCounterMapper> implements ISphinxCounterService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SphinxCounterServiceImpl.class);
}