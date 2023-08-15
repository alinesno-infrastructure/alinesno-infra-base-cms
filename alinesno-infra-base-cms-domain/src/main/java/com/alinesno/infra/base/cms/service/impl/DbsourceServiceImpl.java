package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.DbsourceEntity;
import com.alinesno.infra.base.cms.mapper.DbsourceMapper;
import com.alinesno.infra.base.cms.service.IDbsourceService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 数据源Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class DbsourceServiceImpl extends IBaseServiceImpl<DbsourceEntity, DbsourceMapper> implements IDbsourceService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(DbsourceServiceImpl.class);
}