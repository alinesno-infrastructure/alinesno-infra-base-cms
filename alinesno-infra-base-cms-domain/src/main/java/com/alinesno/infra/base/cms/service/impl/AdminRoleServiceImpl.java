package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AdminRoleEntity;
import com.alinesno.infra.base.cms.mapper.AdminRoleMapper;
import com.alinesno.infra.base.cms.service.IAdminRoleService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 管理员角色Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AdminRoleServiceImpl extends IBaseServiceImpl<AdminRoleEntity, AdminRoleMapper> implements IAdminRoleService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AdminRoleServiceImpl.class);
}
