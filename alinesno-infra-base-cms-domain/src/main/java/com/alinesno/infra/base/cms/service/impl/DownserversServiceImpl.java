package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.DownserversEntity;
import com.alinesno.infra.base.cms.mapper.DownserversMapper;
import com.alinesno.infra.base.cms.service.IDownserversService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 下载服务器Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class DownserversServiceImpl extends IBaseServiceImpl<DownserversEntity, DownserversMapper> implements IDownserversService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(DownserversServiceImpl.class);
}