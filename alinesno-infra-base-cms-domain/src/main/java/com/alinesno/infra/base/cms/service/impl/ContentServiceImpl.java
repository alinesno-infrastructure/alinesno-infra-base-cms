package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.ContentEntity;
import com.alinesno.infra.base.cms.mapper.ContentMapper;
import com.alinesno.infra.base.cms.service.IContentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 栏目Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class ContentServiceImpl extends IBaseServiceImpl<ContentEntity, ContentMapper> implements IContentService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ContentServiceImpl.class);


}