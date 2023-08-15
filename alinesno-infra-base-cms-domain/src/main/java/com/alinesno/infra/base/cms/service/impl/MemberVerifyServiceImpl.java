package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberVerifyEntity;
import com.alinesno.infra.base.cms.mapper.MemberVerifyMapper;
import com.alinesno.infra.base.cms.service.IMemberVerifyService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员审核Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberVerifyServiceImpl extends IBaseServiceImpl<MemberVerifyEntity, MemberVerifyMapper> implements IMemberVerifyService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberVerifyServiceImpl.class);
}