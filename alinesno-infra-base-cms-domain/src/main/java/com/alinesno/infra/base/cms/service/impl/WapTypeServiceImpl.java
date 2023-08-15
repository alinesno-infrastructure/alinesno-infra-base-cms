package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.WapTypeEntity;
import com.alinesno.infra.base.cms.mapper.WapTypeMapper;
import com.alinesno.infra.base.cms.service.IWapTypeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * WAP类型Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class WapTypeServiceImpl extends IBaseServiceImpl<WapTypeEntity, WapTypeMapper> implements IWapTypeService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(WapTypeServiceImpl.class);
}