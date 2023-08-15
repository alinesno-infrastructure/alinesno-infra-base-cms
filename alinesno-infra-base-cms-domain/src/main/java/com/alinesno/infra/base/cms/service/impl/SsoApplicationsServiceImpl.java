package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoApplicationsEntity;
import com.alinesno.infra.base.cms.mapper.SsoApplicationsMapper;
import com.alinesno.infra.base.cms.service.ISsoApplicationsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO应用Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoApplicationsServiceImpl extends IBaseServiceImpl<SsoApplicationsEntity, SsoApplicationsMapper> implements ISsoApplicationsService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoApplicationsServiceImpl.class);
}