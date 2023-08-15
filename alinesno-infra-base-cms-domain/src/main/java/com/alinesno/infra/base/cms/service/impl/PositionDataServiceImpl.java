package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PositionDataEntity;
import com.alinesno.infra.base.cms.mapper.PositionDataMapper;
import com.alinesno.infra.base.cms.service.IPositionDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 位置数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PositionDataServiceImpl extends IBaseServiceImpl<PositionDataEntity, PositionDataMapper> implements IPositionDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PositionDataServiceImpl.class);
}