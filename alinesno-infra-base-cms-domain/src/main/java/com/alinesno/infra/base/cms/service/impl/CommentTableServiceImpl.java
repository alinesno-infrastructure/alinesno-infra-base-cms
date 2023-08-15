package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CommentTableEntity;
import com.alinesno.infra.base.cms.mapper.CommentTableMapper;
import com.alinesno.infra.base.cms.service.ICommentTableService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 评论表Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CommentTableServiceImpl extends IBaseServiceImpl<CommentTableEntity, CommentTableMapper> implements ICommentTableService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CommentTableServiceImpl.class);
}