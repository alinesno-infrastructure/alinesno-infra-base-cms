package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.TypeEntity;
import com.alinesno.infra.base.cms.mapper.TypeMapper;
import com.alinesno.infra.base.cms.service.ITypeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 类型Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class TypeServiceImpl extends IBaseServiceImpl<TypeEntity, TypeMapper> implements ITypeService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(TypeServiceImpl.class);
}