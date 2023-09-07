package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PageEntity;
import com.alinesno.infra.base.cms.mapper.PageMapper;
import com.alinesno.infra.base.cms.service.IPageService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 页面Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PageServiceImpl extends IBaseServiceImpl<PageEntity, PageMapper> implements IPageService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PageServiceImpl.class);
}