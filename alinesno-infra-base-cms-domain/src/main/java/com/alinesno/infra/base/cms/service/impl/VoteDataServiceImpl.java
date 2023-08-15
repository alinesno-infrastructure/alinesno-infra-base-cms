package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VoteDataEntity;
import com.alinesno.infra.base.cms.mapper.VoteDataMapper;
import com.alinesno.infra.base.cms.service.IVoteDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 投票数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VoteDataServiceImpl extends IBaseServiceImpl<VoteDataEntity, VoteDataMapper> implements IVoteDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VoteDataServiceImpl.class);
}