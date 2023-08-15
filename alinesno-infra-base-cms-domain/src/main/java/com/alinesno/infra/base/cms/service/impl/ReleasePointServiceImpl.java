package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.ReleasePointEntity;
import com.alinesno.infra.base.cms.mapper.ReleasePointMapper;
import com.alinesno.infra.base.cms.service.IReleasePointService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 发布点Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class ReleasePointServiceImpl extends IBaseServiceImpl<ReleasePointEntity, ReleasePointMapper> implements IReleasePointService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ReleasePointServiceImpl.class);
}