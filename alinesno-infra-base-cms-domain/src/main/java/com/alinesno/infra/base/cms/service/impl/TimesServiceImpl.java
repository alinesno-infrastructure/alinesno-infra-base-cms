package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TimesEntity;
import com.alinesno.infra.base.cms.mapper.TimesMapper;
import com.alinesno.infra.base.cms.service.ITimesService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 时间Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TimesServiceImpl extends IBaseServiceImpl<TimesEntity, TimesMapper> implements ITimesService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TimesServiceImpl.class);
}