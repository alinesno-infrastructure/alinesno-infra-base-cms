package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoMessagequeueEntity;
import com.alinesno.infra.base.cms.mapper.SsoMessagequeueMapper;
import com.alinesno.infra.base.cms.service.ISsoMessagequeueService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO消息队列Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoMessagequeueServiceImpl extends IBaseServiceImpl<SsoMessagequeueEntity, SsoMessagequeueMapper> implements ISsoMessagequeueService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoMessagequeueServiceImpl.class);
}