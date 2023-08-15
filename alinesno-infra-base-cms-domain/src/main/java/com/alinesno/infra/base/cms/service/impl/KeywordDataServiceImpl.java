package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.KeywordDataEntity;
import com.alinesno.infra.base.cms.mapper.KeywordDataMapper;
import com.alinesno.infra.base.cms.service.IKeywordDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 关键词数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class KeywordDataServiceImpl extends IBaseServiceImpl<KeywordDataEntity, KeywordDataMapper> implements IKeywordDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(KeywordDataServiceImpl.class);
}