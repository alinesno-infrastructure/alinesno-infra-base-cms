package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VideoStoreEntity;
import com.alinesno.infra.base.cms.mapper.VideoStoreMapper;
import com.alinesno.infra.base.cms.service.IVideoStoreService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 视频存储Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VideoStoreServiceImpl extends IBaseServiceImpl<VideoStoreEntity, VideoStoreMapper> implements IVideoStoreService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VideoStoreServiceImpl.class);
}