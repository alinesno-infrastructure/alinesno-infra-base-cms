package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MessageEntity;
import com.alinesno.infra.base.cms.mapper.MessageMapper;
import com.alinesno.infra.base.cms.service.IMessageService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消息Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MessageServiceImpl extends IBaseServiceImpl<MessageEntity, MessageMapper> implements IMessageService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MessageServiceImpl.class);
}