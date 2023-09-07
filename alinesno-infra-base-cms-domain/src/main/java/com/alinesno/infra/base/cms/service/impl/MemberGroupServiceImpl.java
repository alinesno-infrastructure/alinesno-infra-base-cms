package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberGroupEntity;
import com.alinesno.infra.base.cms.mapper.MemberGroupMapper;
import com.alinesno.infra.base.cms.service.IMemberGroupService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员分组Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberGroupServiceImpl extends IBaseServiceImpl<MemberGroupEntity, MemberGroupMapper> implements IMemberGroupService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberGroupServiceImpl.class);
}