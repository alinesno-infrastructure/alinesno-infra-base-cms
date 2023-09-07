package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SpecialEntity;
import com.alinesno.infra.base.cms.mapper.SpecialMapper;
import com.alinesno.infra.base.cms.service.ISpecialService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 特殊Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SpecialServiceImpl extends IBaseServiceImpl<SpecialEntity, SpecialMapper> implements ISpecialService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SpecialServiceImpl.class);
}