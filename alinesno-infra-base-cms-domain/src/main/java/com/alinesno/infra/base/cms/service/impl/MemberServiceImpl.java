package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.MemberEntity;
import com.alinesno.infra.base.cms.mapper.MemberMapper;
import com.alinesno.infra.base.cms.service.IMemberService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 会员Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class MemberServiceImpl extends IBaseServiceImpl<MemberEntity, MemberMapper> implements IMemberService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
}