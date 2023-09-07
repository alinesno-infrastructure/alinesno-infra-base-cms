package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SmsReportEntity;
import com.alinesno.infra.base.cms.mapper.SmsReportMapper;
import com.alinesno.infra.base.cms.service.ISmsReportService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 短信报告Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SmsReportServiceImpl extends IBaseServiceImpl<SmsReportEntity, SmsReportMapper> implements ISmsReportService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SmsReportServiceImpl.class);
}