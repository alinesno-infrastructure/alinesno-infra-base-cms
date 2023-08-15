package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CMSManagerAccountRecordEntity;
import com.alinesno.infra.base.cms.mapper.CMSManagerAccountRecordMapper;
import com.alinesno.infra.base.cms.service.ICMSManagerAccountRecordService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * CMS管理员账号记录Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CMSManagerAccountRecordServiceImpl extends IBaseServiceImpl<CMSManagerAccountRecordEntity, CMSManagerAccountRecordMapper> implements ICMSManagerAccountRecordService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CMSManagerAccountRecordServiceImpl.class);
}