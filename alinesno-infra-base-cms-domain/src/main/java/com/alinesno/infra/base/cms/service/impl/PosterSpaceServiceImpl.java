package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PosterSpaceEntity;
import com.alinesno.infra.base.cms.mapper.PosterSpaceMapper;
import com.alinesno.infra.base.cms.service.IPosterSpaceService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 海报空间Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PosterSpaceServiceImpl extends IBaseServiceImpl<PosterSpaceEntity, PosterSpaceMapper> implements IPosterSpaceService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PosterSpaceServiceImpl.class);
}