package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TestEntity;
import com.alinesno.infra.base.cms.mapper.TestMapper;
import com.alinesno.infra.base.cms.service.ITestService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 测试Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TestServiceImpl extends IBaseServiceImpl<TestEntity, TestMapper> implements ITestService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
}