package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.NewsDataEntity;
import com.alinesno.infra.base.cms.mapper.NewsDataMapper;
import com.alinesno.infra.base.cms.service.INewsDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 新闻数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class NewsDataServiceImpl extends IBaseServiceImpl<NewsDataEntity, NewsDataMapper> implements INewsDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(NewsDataServiceImpl.class);
}