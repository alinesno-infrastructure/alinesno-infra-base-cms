package com.alinesno.infra.base.cms.gateway.provider;

import com.alinesno.infra.base.cms.dto.ChapterContentDto;
import com.alinesno.infra.base.cms.service.IPositionService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.web.adapter.rest.SuperController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 解析从LLM处理的文章内容
 */
@Slf4j
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/simple/crm/llmPosition")
public class LLMPositionController extends SuperController {

    @Autowired
    private IPositionService service;

    /**
     * 添加文章
     * @param contentDtos
     * @return
     */
    @PostMapping("/addPost")
    public boolean addPost(@RequestBody List<ChapterContentDto> contentDtos){

        service.addPost(contentDtos) ;

        return true ;
    }


}