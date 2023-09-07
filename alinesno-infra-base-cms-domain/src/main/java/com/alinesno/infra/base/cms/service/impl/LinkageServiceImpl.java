package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.LinkageEntity;
import com.alinesno.infra.base.cms.mapper.LinkageMapper;
import com.alinesno.infra.base.cms.service.ILinkageService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 联动菜单Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class LinkageServiceImpl extends IBaseServiceImpl<LinkageEntity, LinkageMapper> implements ILinkageService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(LinkageServiceImpl.class);
}