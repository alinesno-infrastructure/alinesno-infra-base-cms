package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberDetailEntity;
import com.alinesno.infra.base.cms.mapper.MemberDetailMapper;
import com.alinesno.infra.base.cms.service.IMemberDetailService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员详情Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberDetailServiceImpl extends IBaseServiceImpl<MemberDetailEntity, MemberDetailMapper> implements IMemberDetailService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberDetailServiceImpl.class);
}