package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.IpbannedEntity;
import com.alinesno.infra.base.cms.mapper.IpbannedMapper;
import com.alinesno.infra.base.cms.service.IIpbannedService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * IP禁止Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class IpbannedServiceImpl extends IBaseServiceImpl<IpbannedEntity, IpbannedMapper> implements IIpbannedService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(IpbannedServiceImpl.class);
}