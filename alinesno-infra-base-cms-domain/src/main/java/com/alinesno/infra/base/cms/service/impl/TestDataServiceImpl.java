package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TestDataEntity;
import com.alinesno.infra.base.cms.mapper.TestDataMapper;
import com.alinesno.infra.base.cms.service.ITestDataService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 测试数据Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TestDataServiceImpl extends IBaseServiceImpl<TestDataEntity, TestDataMapper> implements ITestDataService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TestDataServiceImpl.class);
}