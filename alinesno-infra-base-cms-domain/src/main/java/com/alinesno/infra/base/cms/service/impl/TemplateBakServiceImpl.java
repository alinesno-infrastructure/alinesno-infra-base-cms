package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TemplateBakEntity;
import com.alinesno.infra.base.cms.mapper.TemplateBakMapper;
import com.alinesno.infra.base.cms.service.ITemplateBakService;
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
public class TemplateBakServiceImpl extends IBaseServiceImpl<TemplateBakEntity, TemplateBakMapper> implements ITemplateBakService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TemplateBakServiceImpl.class);
}