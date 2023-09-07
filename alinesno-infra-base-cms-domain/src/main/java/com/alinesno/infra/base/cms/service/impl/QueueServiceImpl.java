package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.QueueEntity;
import com.alinesno.infra.base.cms.mapper.QueueMapper;
import com.alinesno.infra.base.cms.service.IQueueService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 队列Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class QueueServiceImpl extends IBaseServiceImpl<QueueEntity, QueueMapper> implements IQueueService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(QueueServiceImpl.class);
}