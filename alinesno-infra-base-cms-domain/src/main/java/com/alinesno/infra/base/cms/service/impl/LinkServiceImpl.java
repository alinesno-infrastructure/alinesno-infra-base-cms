package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.LinkEntity;
import com.alinesno.infra.base.cms.mapper.LinkMapper;
import com.alinesno.infra.base.cms.service.ILinkService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 友情链接Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class LinkServiceImpl extends IBaseServiceImpl<LinkEntity, LinkMapper> implements ILinkService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(LinkServiceImpl.class);
}