package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TagEntity;
import com.alinesno.infra.base.cms.mapper.TagMapper;
import com.alinesno.infra.base.cms.service.ITagService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 标签Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TagServiceImpl extends IBaseServiceImpl<TagEntity, TagMapper> implements ITagService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TagServiceImpl.class);
}