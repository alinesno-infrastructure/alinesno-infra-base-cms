package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.HitsEntity;
import com.alinesno.infra.base.cms.mapper.HitsMapper;
import com.alinesno.infra.base.cms.service.IHitsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 点击量Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class HitsServiceImpl extends IBaseServiceImpl<HitsEntity, HitsMapper> implements IHitsService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(HitsServiceImpl.class);
}