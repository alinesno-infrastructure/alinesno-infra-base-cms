package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SiteEntity;
import com.alinesno.infra.base.cms.mapper.SiteMapper;
import com.alinesno.infra.base.cms.service.ISiteService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 站点Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SiteServiceImpl extends IBaseServiceImpl<SiteEntity, SiteMapper> implements ISiteService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SiteServiceImpl.class);
}