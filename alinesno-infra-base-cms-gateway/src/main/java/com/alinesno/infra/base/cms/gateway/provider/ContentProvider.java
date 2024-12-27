package com.alinesno.infra.base.cms.gateway.provider;

import com.alinesno.infra.base.cms.gateway.dto.*;
import com.alinesno.infra.base.cms.gateway.enums.CardType;
import com.alinesno.infra.base.cms.service.IWpPostsService;
import com.alinesno.infra.common.facade.response.R;
import com.alinesno.infra.common.web.adapter.base.consumer.IBaseAuthorityConsumer;
import com.alinesno.infra.common.web.adapter.base.dto.ManagerAccountDto;
import com.alinesno.infra.common.web.adapter.rest.SuperController;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.jsonwebtoken.lang.Assert;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 内容提供者
 */
@Slf4j
@RestController
@RequestMapping("/v1/api/infra/base/cms/content/provider/")
public class ContentProvider extends SuperController {

    @Autowired
    private IWpPostsService wpPostsService ;

    @Autowired
    private IBaseAuthorityConsumer authorityConsumer ;

    /**
     * 智能体发布渠道
     */
    @PostMapping("/agentHandleContent")
    public R<String> handleContent(@RequestBody ContentCardDto content) {

        log.debug("content = {}", content);

        // 如果type是image content.getImage不能为空
        Assert.isTrue(content.getType() != CardType.image || content.getImages() != null, "image不能为空");
        Assert.isTrue(content.getType() != CardType.audio || content.getAudioSrc() != null, "audioSrc不能为空");
        Assert.isTrue(content.getType() != CardType.video || content.getVideoSrc() != null, "videoSrc不能为空");

        wpPostsService.saveContent(content);

        return R.ok() ;
    }

    /**
     * 查询最新动态文章
     * @return
     */
    @GetMapping("/queryNewDynamicContent")
    public R<List<ContentCardDto>> queryDynamicContent(){
        return R.ok(wpPostsService.queryDynamicContent()) ;
    }

}
