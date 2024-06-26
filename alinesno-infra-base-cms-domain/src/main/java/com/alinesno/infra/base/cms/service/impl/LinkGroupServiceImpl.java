package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.LinkGroupEntity;
import com.alinesno.infra.base.cms.mapper.LinkGroupMapper;
import com.alinesno.infra.base.cms.service.ILinkGroupService;
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
public class LinkGroupServiceImpl extends IBaseServiceImpl<LinkGroupEntity, LinkGroupMapper> implements ILinkGroupService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(LinkGroupServiceImpl.class);
}