package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SearchKeywordEntity;
import com.alinesno.infra.base.cms.mapper.SearchKeywordMapper;
import com.alinesno.infra.base.cms.service.ISearchKeywordService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 搜索关键词Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SearchKeywordServiceImpl extends IBaseServiceImpl<SearchKeywordEntity, SearchKeywordMapper> implements ISearchKeywordService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SearchKeywordServiceImpl.class);
}