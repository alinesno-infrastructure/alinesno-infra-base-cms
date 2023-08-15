package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AttachmentEntity;
import com.alinesno.infra.base.cms.mapper.AttachmentMapper;
import com.alinesno.infra.base.cms.service.IAttachmentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 附件Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AttachmentServiceImpl extends IBaseServiceImpl<AttachmentEntity, AttachmentMapper> implements IAttachmentService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AttachmentServiceImpl.class);
}