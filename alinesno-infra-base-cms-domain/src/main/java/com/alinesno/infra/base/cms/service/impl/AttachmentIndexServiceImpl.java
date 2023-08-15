package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AttachmentIndexEntity;
import com.alinesno.infra.base.cms.mapper.AttachmentIndexMapper;
import com.alinesno.infra.base.cms.service.IAttachmentIndexService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 附件索引Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AttachmentIndexServiceImpl extends IBaseServiceImpl<AttachmentIndexEntity, AttachmentIndexMapper> implements IAttachmentIndexService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AttachmentIndexServiceImpl.class);
}