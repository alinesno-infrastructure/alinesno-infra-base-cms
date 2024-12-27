package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.WpPostMetaEntity;
import com.alinesno.infra.base.cms.entity.WpPostsEntity;
import com.alinesno.infra.base.cms.enums.AuthorType;
import com.alinesno.infra.base.cms.gateway.dto.ContentCardDto;
import com.alinesno.infra.base.cms.gateway.enums.CardType;
import com.alinesno.infra.base.cms.mapper.WpPostMetaMapper;
import com.alinesno.infra.base.cms.mapper.WpPostsMapper;
import com.alinesno.infra.base.cms.service.IWpPostsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.common.core.utils.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        wpPostsEntity.setAuthorType(content.getAuthorType());

        // 设置智能体角色
        if(content.getAuthorType().equals(AuthorType.AGENT.getType())){
            wpPostsEntity.setAgentId(content.getAgentId());
            wpPostsEntity.setAgentName(content.getAgentName());
            wpPostsEntity.setAgentAvatar(content.getAgentAvatar());
        }else if(content.getAuthorType().equals(AuthorType.PERSON.name())){
            // TODO 待实现
        }

        wpPostsEntity.setAddTime(new Date());
        this.save(wpPostsEntity);

        // 保存文章image/audio/video等附件信息(postmeta表)
        long postId = wpPostsEntity.getId() ;
        WpPostMetaEntity postMetaEntity = new WpPostMetaEntity();
        postMetaEntity.setPostId(postId);

        if(content.getType() == CardType.image){

            // 设置多张图
            for(String imageUr : content.getImages()){
                WpPostMetaEntity postImageMetaEntity = new WpPostMetaEntity();
                postImageMetaEntity.setPostId(postId);

                postImageMetaEntity.setMetaKey("image");
                postImageMetaEntity.setMetaValue(imageUr);

                wpPostMetaMapper.insert(postImageMetaEntity);
            }

        }else if (content.getType() == CardType.audio){
            postMetaEntity.setMetaKey("audio");
            postMetaEntity.setMetaValue(content.getAudioSrc());

            wpPostMetaMapper.insert(postMetaEntity);
        }else if (content.getType() == CardType.video){
            postMetaEntity.setMetaKey("video");
            postMetaEntity.setMetaValue(content.getVideoSrc());
            wpPostMetaMapper.insert(postMetaEntity);
        }
    }

    @Override
    public List<ContentCardDto> queryDynamicContent() {
        // 从 wp_posts 表获取所有已发布的文章
        List<WpPostsEntity> posts = baseMapper.selectList(
                new LambdaQueryWrapper<WpPostsEntity>()
                        .eq(WpPostsEntity::getPostStatus, "publish")
                        .orderByDesc(WpPostsEntity::getAddTime)
        );

        List<ContentCardDto> contentCards = new ArrayList<>();
        for (WpPostsEntity post : posts) {
            ContentCardDto card = new ContentCardDto();

            // 填充基本信息
            card.setUserId(post.getPostAuthor());
            card.setTitle(post.getPostTitle());
            card.setContent(post.getPostExcerpt()); // 或者使用 getPostContent()
            card.setType(CardType.valueOf(post.getPostType()));

            card.setFromTime(fromAgo(post.getAddTime()));

            if (AuthorType.AGENT.getType().equals(post.getAuthorType())) {
                card.setAuthorType(AuthorType.AGENT.getType());
                card.setAgentId(post.getAgentId());
                card.setAgentName(post.getAgentName());
                card.setAgentAvatar(post.getAgentAvatar());
            }

            // 查询 wp_postmeta 表以获取附加信息
            List<WpPostMetaEntity> metas = wpPostMetaMapper.selectList(
                    new QueryWrapper<WpPostMetaEntity>()
                            .eq("post_id", post.getId())
            );

            // 处理不同类型的内容
            for (WpPostMetaEntity meta : metas) {
                String metaKey = meta.getMetaKey();
                String metaValue = meta.getMetaValue();

                if(StringUtils.isEmpty(metaValue)){
                    continue;
                }

                switch (metaKey) {
                    case "image" -> {
                        if (card.getType() == CardType.image) {
                            // 如果是多张图，则添加到集合中
                            if (card.getImages() == null) {
                                card.setImages(new ArrayList<>());
                            }
                            card.getImages().add(metaValue);
                        }
                    }
                    case "audio" -> {
                        if (card.getType() == CardType.audio) {
                            card.setAudioSrc(metaValue);
                        }
                    }
                    case "video" -> {
                        if (card.getType() == CardType.video) {
                            card.setVideoSrc(metaValue);
                        }
                    }
                    default -> {
                    }
                    // 忽略其他元数据或处理其他类型的元数据
                }
            }

            contentCards.add(card);
        }

        return contentCards;
    }

    /**
     * 计算时间距离当前时间的相对时间
     * @param date 时间对象
     * @return 相对时间字符串
     */
    public static String fromAgo(Date date) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        Duration duration = Duration.between(localDateTime, now);

        long seconds = Math.abs(duration.getSeconds());
        long minutes = Math.abs(duration.toMinutes());
        long hours = Math.abs(duration.toHours());
        long days = Math.abs(duration.toDays());
        long months = Math.abs(duration.toDays() / 30);
        long years = Math.abs(duration.toDays() / 365);

        if (seconds < 60) {
            return seconds + "秒";
        } else if (minutes < 60) {
            return minutes + "分";
        } else if (hours < 24) {
            return hours + "时";
        } else if (days < 30) {
            return days + "天";
        } else if (months < 12) {
            return months + "月";
        } else {
            return years + "年";
        }
    }

}