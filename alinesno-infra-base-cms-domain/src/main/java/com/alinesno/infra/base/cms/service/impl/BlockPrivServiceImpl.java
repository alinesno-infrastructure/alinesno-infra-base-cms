package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.BlockPrivEntity;
import com.alinesno.infra.base.cms.mapper.BlockPrivMapper;
import com.alinesno.infra.base.cms.service.IBlockPrivService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 区块权限Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class BlockPrivServiceImpl extends IBaseServiceImpl<BlockPrivEntity, BlockPrivMapper> implements IBlockPrivService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(BlockPrivServiceImpl.class);
}