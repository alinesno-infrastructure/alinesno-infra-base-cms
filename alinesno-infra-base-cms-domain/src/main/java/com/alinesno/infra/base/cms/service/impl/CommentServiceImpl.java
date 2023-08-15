package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CommentEntity;
import com.alinesno.infra.base.cms.mapper.CommentMapper;
import com.alinesno.infra.base.cms.service.ICommentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 评论Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CommentServiceImpl extends IBaseServiceImpl<CommentEntity, CommentMapper> implements ICommentService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CommentServiceImpl.class);
}