package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberVipEntity;
import com.alinesno.infra.base.cms.mapper.MemberVipMapper;
import com.alinesno.infra.base.cms.service.IMemberVipService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员VIPService业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberVipServiceImpl extends IBaseServiceImpl<MemberVipEntity, MemberVipMapper> implements IMemberVipService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberVipServiceImpl.class);
}