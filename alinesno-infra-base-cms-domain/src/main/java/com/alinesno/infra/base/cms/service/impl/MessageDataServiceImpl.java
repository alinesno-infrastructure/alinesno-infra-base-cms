package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MessageDataEntity;
import com.alinesno.infra.base.cms.mapper.MessageDataMapper;
import com.alinesno.infra.base.cms.service.IMessageDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消息数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MessageDataServiceImpl extends IBaseServiceImpl<MessageDataEntity, MessageDataMapper> implements IMessageDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MessageDataServiceImpl.class);
}