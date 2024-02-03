package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.dto.ChapterContentDto;
import com.alinesno.infra.base.cms.entity.PositionDataEntity;
import com.alinesno.infra.base.cms.entity.PositionEntity;
import com.alinesno.infra.base.cms.mapper.PositionMapper;
import com.alinesno.infra.base.cms.service.IPositionDataService;
import com.alinesno.infra.base.cms.service.IPositionService;
import com.alinesno.infra.base.cms.utils.MarkdownToHtmlUtils;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 位置Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Slf4j
@Service
public class PositionServiceImpl extends IBaseServiceImpl<PositionEntity, PositionMapper> implements IPositionService {

    @Autowired
    private IPositionDataService positionDataService ;

    @Override
    public void addPost(List<ChapterContentDto> contentDtos) {

        StringBuilder markdownTxt = new StringBuilder();
        markdownTxt.append("# LLM自动化生成内容").append("\r\n") ;

        for(ChapterContentDto dto : contentDtos){

            String title = "## " + dto.getChapter() ;
            String content = dto.getContent() ;

            if(StringUtils.isNotBlank(dto.getSub())){
                title = "### " +  dto.getSub() ;
            }

            markdownTxt.append(title).append("\r\n") ;
            markdownTxt.append(content).append("\r\n") ;
        }

        String htmlContent = MarkdownToHtmlUtils.markdownToHtmlExtensions(markdownTxt.toString()) ;
        log.debug("html content = {}" , htmlContent);

        PositionDataEntity positionData = new PositionDataEntity() ;
        positionData.setContent(htmlContent);

        positionDataService.save(positionData) ;
    }
}