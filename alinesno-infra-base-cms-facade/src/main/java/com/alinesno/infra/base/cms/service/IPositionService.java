package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.dto.ChapterContentDto;
import com.alinesno.infra.base.cms.entity.PositionEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;

/**
 * 位置Service接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
public interface IPositionService extends IBaseService<PositionEntity> {

    /**
     * 添加文章内容
     * @param contentDtos
     */
    void addPost(List<ChapterContentDto> contentDtos);

}