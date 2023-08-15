package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SiteSafetySettingEntity;
import com.alinesno.infra.base.cms.mapper.SiteSafetySettingMapper;
import com.alinesno.infra.base.cms.service.ISiteSafetySettingService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 站点安全设置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SiteSafetySettingServiceImpl extends IBaseServiceImpl<SiteSafetySettingEntity, SiteSafetySettingMapper> implements ISiteSafetySettingService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SiteSafetySettingServiceImpl.class);
}