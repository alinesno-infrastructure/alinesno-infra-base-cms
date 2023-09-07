package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AnnounceEntity;
import com.alinesno.infra.base.cms.mapper.AnnounceMapper;
import com.alinesno.infra.base.cms.service.IAnnounceService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 公告表Service业务层处理
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Service
public class AnnounceServiceImpl extends IBaseServiceImpl<AnnounceEntity, AnnounceMapper> implements IAnnounceService {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AnnounceServiceImpl.class);
}