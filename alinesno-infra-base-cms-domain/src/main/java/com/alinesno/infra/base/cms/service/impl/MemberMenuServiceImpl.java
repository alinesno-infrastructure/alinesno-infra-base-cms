package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberMenuEntity;
import com.alinesno.infra.base.cms.mapper.MemberMenuMapper;
import com.alinesno.infra.base.cms.service.IMemberMenuService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员菜单Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberMenuServiceImpl extends IBaseServiceImpl<MemberMenuEntity, MemberMenuMapper> implements IMemberMenuService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberMenuServiceImpl.class);
}