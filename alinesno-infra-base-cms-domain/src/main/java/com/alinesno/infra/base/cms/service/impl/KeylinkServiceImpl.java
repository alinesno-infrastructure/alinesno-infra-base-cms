package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.KeylinkEntity;
import com.alinesno.infra.base.cms.mapper.KeylinkMapper;
import com.alinesno.infra.base.cms.service.IKeylinkService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 关键词链接Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class KeylinkServiceImpl extends IBaseServiceImpl<KeylinkEntity, KeylinkMapper> implements IKeylinkService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(KeylinkServiceImpl.class);
}