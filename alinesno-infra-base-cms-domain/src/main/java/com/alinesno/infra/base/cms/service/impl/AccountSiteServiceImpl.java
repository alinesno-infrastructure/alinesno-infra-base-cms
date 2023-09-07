package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AccountSiteEntity;
import com.alinesno.infra.base.cms.mapper.AccountSiteMapper;
import com.alinesno.infra.base.cms.service.IAccountSiteService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 用户站点Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AccountSiteServiceImpl extends IBaseServiceImpl<AccountSiteEntity, AccountSiteMapper> implements IAccountSiteService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AccountSiteServiceImpl.class);
}
