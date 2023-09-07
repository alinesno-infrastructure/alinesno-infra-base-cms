package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CategoryPrivEntity;
import com.alinesno.infra.base.cms.mapper.CategoryPrivMapper;
import com.alinesno.infra.base.cms.service.ICategoryPrivService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 分类权限Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CategoryPrivServiceImpl extends IBaseServiceImpl<CategoryPrivEntity, CategoryPrivMapper> implements ICategoryPrivService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CategoryPrivServiceImpl.class);
}