package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CategoryEntity;
import com.alinesno.infra.base.cms.mapper.CategoryMapper;
import com.alinesno.infra.base.cms.service.ICategoryService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 栏目Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CategoryServiceImpl extends IBaseServiceImpl<CategoryEntity, CategoryMapper> implements ICategoryService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CategoryServiceImpl.class);
}