package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.BlockEntity;
import com.alinesno.infra.base.cms.mapper.BlockMapper;
import com.alinesno.infra.base.cms.service.IBlockService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 区块Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class BlockServiceImpl extends IBaseServiceImpl<BlockEntity, BlockMapper> implements IBlockService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(BlockServiceImpl.class);
}