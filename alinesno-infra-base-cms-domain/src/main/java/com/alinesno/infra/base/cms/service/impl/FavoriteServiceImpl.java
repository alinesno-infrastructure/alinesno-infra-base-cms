package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.FavoriteEntity;
import com.alinesno.infra.base.cms.mapper.FavoriteMapper;
import com.alinesno.infra.base.cms.service.IFavoriteService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 收藏Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class FavoriteServiceImpl extends IBaseServiceImpl<FavoriteEntity, FavoriteMapper> implements IFavoriteService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(FavoriteServiceImpl.class);
}