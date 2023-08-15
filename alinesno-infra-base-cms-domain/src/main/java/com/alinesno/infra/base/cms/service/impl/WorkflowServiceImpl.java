package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.WorkflowEntity;
import com.alinesno.infra.base.cms.mapper.WorkflowMapper;
import com.alinesno.infra.base.cms.service.IWorkflowService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 工作流Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class WorkflowServiceImpl extends IBaseServiceImpl<WorkflowEntity, WorkflowMapper> implements IWorkflowService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(WorkflowServiceImpl.class);
}