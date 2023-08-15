package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoAdminEntity;
import com.alinesno.infra.base.cms.mapper.SsoAdminMapper;
import com.alinesno.infra.base.cms.service.ISsoAdminService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO管理员Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoAdminServiceImpl extends IBaseServiceImpl<SsoAdminEntity, SsoAdminMapper> implements ISsoAdminService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoAdminServiceImpl.class);
}