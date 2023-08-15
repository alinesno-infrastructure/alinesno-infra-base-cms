package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.DatacallEntity;
import com.alinesno.infra.base.cms.mapper.DatacallMapper;
import com.alinesno.infra.base.cms.service.IDatacallService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 数据调用Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class DatacallServiceImpl extends IBaseServiceImpl<DatacallEntity, DatacallMapper> implements IDatacallService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(DatacallServiceImpl.class);
}