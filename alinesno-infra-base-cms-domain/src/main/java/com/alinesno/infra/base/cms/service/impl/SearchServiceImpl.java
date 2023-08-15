package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SearchEntity;
import com.alinesno.infra.base.cms.mapper.SearchMapper;
import com.alinesno.infra.base.cms.service.ISearchService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 搜索Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SearchServiceImpl extends IBaseServiceImpl<SearchEntity, SearchMapper> implements ISearchService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SearchServiceImpl.class);
}