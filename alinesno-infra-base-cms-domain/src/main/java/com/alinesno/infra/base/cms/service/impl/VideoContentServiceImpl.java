package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VideoContentEntity;
import com.alinesno.infra.base.cms.mapper.VideoContentMapper;
import com.alinesno.infra.base.cms.service.IVideoContentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 视频内容Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VideoContentServiceImpl extends IBaseServiceImpl<VideoContentEntity, VideoContentMapper> implements IVideoContentService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VideoContentServiceImpl.class);
}