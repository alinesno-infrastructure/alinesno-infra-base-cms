package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SpecialContentEntity;
import com.alinesno.infra.base.cms.mapper.SpecialContentMapper;
import com.alinesno.infra.base.cms.service.ISpecialContentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 特殊内容Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SpecialContentServiceImpl extends IBaseServiceImpl<SpecialContentEntity, SpecialContentMapper> implements ISpecialContentService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SpecialContentServiceImpl.class);
}