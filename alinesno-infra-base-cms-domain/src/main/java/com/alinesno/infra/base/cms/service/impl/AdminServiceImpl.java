package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AdminEntity;
import com.alinesno.infra.base.cms.mapper.AdminMapper;
import com.alinesno.infra.base.cms.service.IAdminService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 管理员Service业务层实现
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AdminServiceImpl extends IBaseServiceImpl<AdminEntity, AdminMapper> implements IAdminService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
}
