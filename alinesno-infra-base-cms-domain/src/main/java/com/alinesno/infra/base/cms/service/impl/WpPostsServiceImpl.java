package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.WpPostMetaEntity;
import com.alinesno.infra.base.cms.entity.WpPostsEntity;
import com.alinesno.infra.base.cms.gateway.dto.ContentCardDto;
import com.alinesno.infra.base.cms.gateway.enums.CardType;
import com.alinesno.infra.base.cms.mapper.WpPostMetaMapper;
import com.alinesno.infra.base.cms.mapper.WpPostsMapper;
import com.alinesno.infra.base.cms.service.IWpPostsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * WpPosts服务层处理
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Slf4j
@Service
public class WpPostsServiceImpl extends IBaseServiceImpl<WpPostsEntity, WpPostsMapper> implements IWpPostsService {

    @Autowired
    private WpPostMetaMapper wpPostMetaMapper ;

    @Override
    public void saveContent(ContentCardDto content) {

        // 保存文章内容(post表)
        WpPostsEntity wpPostsEntity = new WpPostsEntity();

        wpPostsEntity.setPostStatus("publish");
        wpPostsEntity.setPostAuthor(content.getUserId()) ;
        wpPostsEntity.setPostContent(content.getContent());
        wpPostsEntity.setPostTitle(content.getTitle());
        wpPostsEntity.setPostExcerpt(content.getContent());

        wpPostsEntity.setPostType(content.getType().name());

        this.save(wpPostsEntity);

        // 保存文章image/audio/video等附件信息(postmeta表)
        long postId = wpPostsEntity.getId() ;
        WpPostMetaEntity postMetaEntity = new WpPostMetaEntity();
        postMetaEntity.setPostId(postId);

        if(content.getType() == CardType.image){
            postMetaEntity.setMetaKey("image");
            postMetaEntity.setMetaValue(content.getImage());
        }else if (content.getType() == CardType.music){
            postMetaEntity.setMetaKey("audio");
            postMetaEntity.setMetaValue(content.getAudioSrc());
        }else if (content.getType() == CardType.video){
            postMetaEntity.setMetaKey("video");
            postMetaEntity.setMetaValue(content.getVideoSrc());
        }

        wpPostMetaMapper.insert(postMetaEntity);
    }
}