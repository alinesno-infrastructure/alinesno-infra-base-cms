package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VideoDataEntity;
import com.alinesno.infra.base.cms.mapper.VideoDataMapper;
import com.alinesno.infra.base.cms.service.IVideoDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 视频数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VideoDataServiceImpl extends IBaseServiceImpl<VideoDataEntity, VideoDataMapper> implements IVideoDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VideoDataServiceImpl.class);
}