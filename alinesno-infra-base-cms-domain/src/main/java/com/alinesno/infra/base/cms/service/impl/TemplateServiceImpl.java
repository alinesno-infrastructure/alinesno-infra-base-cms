package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TemplateEntity;
import com.alinesno.infra.base.cms.mapper.TemplateMapper;
import com.alinesno.infra.base.cms.service.ITemplateService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 模板备份Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TemplateServiceImpl extends IBaseServiceImpl<TemplateEntity, TemplateMapper> implements ITemplateService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TemplateServiceImpl.class);
}