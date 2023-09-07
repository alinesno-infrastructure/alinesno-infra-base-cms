package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.DownloadEntity;
import com.alinesno.infra.base.cms.mapper.DownloadMapper;
import com.alinesno.infra.base.cms.service.IDownloadService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 下载Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class DownloadServiceImpl extends IBaseServiceImpl<DownloadEntity, DownloadMapper> implements IDownloadService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(DownloadServiceImpl.class);
}