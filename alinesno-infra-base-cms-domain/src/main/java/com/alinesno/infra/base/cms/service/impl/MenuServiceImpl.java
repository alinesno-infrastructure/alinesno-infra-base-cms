package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MenuEntity;
import com.alinesno.infra.base.cms.mapper.MenuMapper;
import com.alinesno.infra.base.cms.service.IMenuService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 菜单Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MenuServiceImpl extends IBaseServiceImpl<MenuEntity, MenuMapper> implements IMenuService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);
}