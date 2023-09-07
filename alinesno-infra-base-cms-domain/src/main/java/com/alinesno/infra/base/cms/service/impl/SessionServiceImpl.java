package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SessionEntity;
import com.alinesno.infra.base.cms.mapper.SessionMapper;
import com.alinesno.infra.base.cms.service.ISessionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会话Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SessionServiceImpl extends IBaseServiceImpl<SessionEntity, SessionMapper> implements ISessionService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SessionServiceImpl.class);
}