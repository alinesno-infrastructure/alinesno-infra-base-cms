package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AdminRolePrivEntity;
import com.alinesno.infra.base.cms.mapper.AdminRolePrivMapper;
import com.alinesno.infra.base.cms.service.IAdminRolePrivService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 管理员角色权限Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AdminRolePrivServiceImpl extends IBaseServiceImpl<AdminRolePrivEntity, AdminRolePrivMapper> implements IAdminRolePrivService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AdminRolePrivServiceImpl.class);
}
