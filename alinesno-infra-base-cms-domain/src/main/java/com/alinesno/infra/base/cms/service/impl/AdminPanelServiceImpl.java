package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.AdminPanelEntity;
import com.alinesno.infra.base.cms.mapper.AdminPanelMapper;
import com.alinesno.infra.base.cms.service.IAdminPanelService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 管理面板Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class AdminPanelServiceImpl extends IBaseServiceImpl<AdminPanelEntity, AdminPanelMapper> implements IAdminPanelService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AdminPanelServiceImpl.class);
}
