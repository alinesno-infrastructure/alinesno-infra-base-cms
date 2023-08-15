package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.KeywordEntity;
import com.alinesno.infra.base.cms.mapper.KeywordMapper;
import com.alinesno.infra.base.cms.service.IKeywordService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 关键词Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class KeywordServiceImpl extends IBaseServiceImpl<KeywordEntity, KeywordMapper> implements IKeywordService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(KeywordServiceImpl.class);
}