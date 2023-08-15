package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.ExtendSettingEntity;
import com.alinesno.infra.base.cms.mapper.ExtendSettingMapper;
import com.alinesno.infra.base.cms.service.IExtendSettingService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 扩展设置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class ExtendSettingServiceImpl extends IBaseServiceImpl<ExtendSettingEntity, ExtendSettingMapper> implements IExtendSettingService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ExtendSettingServiceImpl.class);
}