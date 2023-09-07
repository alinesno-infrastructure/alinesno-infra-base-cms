package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.ContentCheckEntity;
import com.alinesno.infra.base.cms.mapper.ContentCheckMapper;
import com.alinesno.infra.base.cms.service.IContentCheckService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 内容审核Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class ContentCheckServiceImpl extends IBaseServiceImpl<ContentCheckEntity, ContentCheckMapper> implements IContentCheckService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ContentCheckServiceImpl.class);
}