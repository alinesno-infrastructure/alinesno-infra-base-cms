package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.BlockHistoryEntity;
import com.alinesno.infra.base.cms.mapper.BlockHistoryMapper;
import com.alinesno.infra.base.cms.service.IBlockHistoryService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 区块历史记录Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class BlockHistoryServiceImpl extends IBaseServiceImpl<BlockHistoryEntity, BlockHistoryMapper> implements IBlockHistoryService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(BlockHistoryServiceImpl.class);
}