package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.UrlruleEntity;
import com.alinesno.infra.base.cms.mapper.UrlruleMapper;
import com.alinesno.infra.base.cms.service.IUrlruleService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * URL规则Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class UrlruleServiceImpl extends IBaseServiceImpl<UrlruleEntity, UrlruleMapper> implements IUrlruleService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(UrlruleServiceImpl.class);
}