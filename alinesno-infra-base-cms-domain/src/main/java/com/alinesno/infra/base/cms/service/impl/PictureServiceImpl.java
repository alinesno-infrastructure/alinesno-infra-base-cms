package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PictureEntity;
import com.alinesno.infra.base.cms.mapper.PictureMapper;
import com.alinesno.infra.base.cms.service.IPictureService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 图片Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PictureServiceImpl extends IBaseServiceImpl<PictureEntity, PictureMapper> implements IPictureService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PictureServiceImpl.class);
}