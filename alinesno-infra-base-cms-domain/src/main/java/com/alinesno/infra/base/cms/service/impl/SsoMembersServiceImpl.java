package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SsoMembersEntity;
import com.alinesno.infra.base.cms.mapper.SsoMembersMapper;
import com.alinesno.infra.base.cms.service.ISsoMembersService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * SSO成员Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class SsoMembersServiceImpl extends IBaseServiceImpl<SsoMembersEntity, SsoMembersMapper> implements ISsoMembersService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SsoMembersServiceImpl.class);
}