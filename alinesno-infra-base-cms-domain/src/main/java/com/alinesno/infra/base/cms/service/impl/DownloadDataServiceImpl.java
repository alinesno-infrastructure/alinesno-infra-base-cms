package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.DownloadDataEntity;
import com.alinesno.infra.base.cms.mapper.DownloadDataMapper;
import com.alinesno.infra.base.cms.service.IDownloadDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 下载数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class DownloadDataServiceImpl extends IBaseServiceImpl<DownloadDataEntity, DownloadDataMapper> implements IDownloadDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(DownloadDataServiceImpl.class);
}