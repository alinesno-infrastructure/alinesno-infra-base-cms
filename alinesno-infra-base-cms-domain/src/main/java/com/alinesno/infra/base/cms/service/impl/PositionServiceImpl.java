package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PositionEntity;
import com.alinesno.infra.base.cms.mapper.PositionMapper;
import com.alinesno.infra.base.cms.service.IPositionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 位置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PositionServiceImpl extends IBaseServiceImpl<PositionEntity, PositionMapper> implements IPositionService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PositionServiceImpl.class);
}