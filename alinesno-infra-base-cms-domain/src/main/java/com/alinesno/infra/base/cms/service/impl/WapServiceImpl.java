package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.WapEntity;
import com.alinesno.infra.base.cms.mapper.WapMapper;
import com.alinesno.infra.base.cms.service.IWapService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * WAPService业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class WapServiceImpl extends IBaseServiceImpl<WapEntity, WapMapper> implements IWapService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(WapServiceImpl.class);
}