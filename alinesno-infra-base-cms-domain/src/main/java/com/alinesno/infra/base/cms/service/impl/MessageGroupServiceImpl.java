package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MessageGroupEntity;
import com.alinesno.infra.base.cms.mapper.MessageGroupMapper;
import com.alinesno.infra.base.cms.service.IMessageGroupService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消息分组Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MessageGroupServiceImpl extends IBaseServiceImpl<MessageGroupEntity, MessageGroupMapper> implements IMessageGroupService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MessageGroupServiceImpl.class);
}