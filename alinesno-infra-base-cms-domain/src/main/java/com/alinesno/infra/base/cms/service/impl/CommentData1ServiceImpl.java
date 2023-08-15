package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CommentData1Entity;
import com.alinesno.infra.base.cms.mapper.CommentData1Mapper;
import com.alinesno.infra.base.cms.service.ICommentData1Service;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 评论数据1Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CommentData1ServiceImpl extends IBaseServiceImpl<CommentData1Entity, CommentData1Mapper> implements ICommentData1Service {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CommentData1ServiceImpl.class);
}