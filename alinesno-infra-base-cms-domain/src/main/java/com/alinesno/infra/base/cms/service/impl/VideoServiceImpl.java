package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VideoEntity;
import com.alinesno.infra.base.cms.mapper.VideoMapper;
import com.alinesno.infra.base.cms.service.IVideoService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 视频Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VideoServiceImpl extends IBaseServiceImpl<VideoEntity, VideoMapper> implements IVideoService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VideoServiceImpl.class);
}