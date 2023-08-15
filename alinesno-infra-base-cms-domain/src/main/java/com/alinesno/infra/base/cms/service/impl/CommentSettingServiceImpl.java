package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CommentSettingEntity;
import com.alinesno.infra.base.cms.mapper.CommentSettingMapper;
import com.alinesno.infra.base.cms.service.ICommentSettingService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 评论设置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CommentSettingServiceImpl extends IBaseServiceImpl<CommentSettingEntity, CommentSettingMapper> implements ICommentSettingService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CommentSettingServiceImpl.class);
}