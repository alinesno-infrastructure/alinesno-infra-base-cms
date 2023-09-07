package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoSessionEntity;
import com.alinesno.infra.base.cms.mapper.SsoSessionMapper;
import com.alinesno.infra.base.cms.service.ISsoSessionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO会话Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoSessionServiceImpl extends IBaseServiceImpl<SsoSessionEntity, SsoSessionMapper> implements ISsoSessionService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoSessionServiceImpl.class);
}