package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PosterEntity;
import com.alinesno.infra.base.cms.mapper.PosterMapper;
import com.alinesno.infra.base.cms.service.IPosterService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 海报Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PosterServiceImpl extends IBaseServiceImpl<PosterEntity, PosterMapper> implements IPosterService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PosterServiceImpl.class);
}