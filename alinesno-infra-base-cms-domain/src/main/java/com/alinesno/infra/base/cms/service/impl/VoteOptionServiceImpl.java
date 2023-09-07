package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.VoteOptionEntity;
import com.alinesno.infra.base.cms.mapper.VoteOptionMapper;
import com.alinesno.infra.base.cms.service.IVoteOptionService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 投票选项Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class VoteOptionServiceImpl extends IBaseServiceImpl<VoteOptionEntity, VoteOptionMapper> implements IVoteOptionService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(VoteOptionServiceImpl.class);
}