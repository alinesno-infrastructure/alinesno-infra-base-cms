package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CommentCheckEntity;
import com.alinesno.infra.base.cms.mapper.CommentCheckMapper;
import com.alinesno.infra.base.cms.service.ICommentCheckService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 评论审核Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CommentCheckServiceImpl extends IBaseServiceImpl<CommentCheckEntity, CommentCheckMapper> implements ICommentCheckService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CommentCheckServiceImpl.class);
}