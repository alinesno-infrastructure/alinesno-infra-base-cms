package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.PictureDataEntity;
import com.alinesno.infra.base.cms.mapper.PictureDataMapper;
import com.alinesno.infra.base.cms.service.IPictureDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 图片数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class PictureDataServiceImpl extends IBaseServiceImpl<PictureDataEntity, PictureDataMapper> implements IPictureDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PictureDataServiceImpl.class);
}