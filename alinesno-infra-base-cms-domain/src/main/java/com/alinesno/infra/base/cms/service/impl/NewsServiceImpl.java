package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.NewsEntity;
import com.alinesno.infra.base.cms.mapper.NewsMapper;
import com.alinesno.infra.base.cms.service.INewsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 新闻Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class NewsServiceImpl extends IBaseServiceImpl<NewsEntity, NewsMapper> implements INewsService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(NewsServiceImpl.class);
}