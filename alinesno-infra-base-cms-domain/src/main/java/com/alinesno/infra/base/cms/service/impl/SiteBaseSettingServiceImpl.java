package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SiteBaseSettingEntity;
import com.alinesno.infra.base.cms.mapper.SiteBaseSettingMapper;
import com.alinesno.infra.base.cms.service.ISiteBaseSettingService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 站点基本设置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SiteBaseSettingServiceImpl extends IBaseServiceImpl<SiteBaseSettingEntity, SiteBaseSettingMapper> implements ISiteBaseSettingService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SiteBaseSettingServiceImpl.class);
}