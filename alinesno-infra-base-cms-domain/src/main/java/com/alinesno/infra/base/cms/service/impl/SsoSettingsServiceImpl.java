package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoSettingsEntity;
import com.alinesno.infra.base.cms.mapper.SsoSettingsMapper;
import com.alinesno.infra.base.cms.service.ISsoSettingsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO设置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoSettingsServiceImpl extends IBaseServiceImpl<SsoSettingsEntity, SsoSettingsMapper> implements ISsoSettingsService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoSettingsServiceImpl.class);
}