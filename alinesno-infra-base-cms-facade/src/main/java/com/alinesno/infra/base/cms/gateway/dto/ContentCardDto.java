package com.alinesno.infra.base.cms.gateway.dto;

import com.alinesno.infra.base.cms.gateway.enums.CardType;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ContentCardDto类用于表示内容卡片的数据传输对象
 * 它提供了内容卡片的基本信息，如类型、用户、标题、内容以及多媒体资源链接
 * 使用Lombok注解来简化equals、hashCode和toString方法的生成，以及自动填充getter和setter方法
 * 使用Jackson注解来处理JSON序列化和反序列化时的字段映射
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class ContentCardDto {

    /**
     * CardType类型，标识卡片的种类
     * 使用@JsonAlias注解允许JSON中的"type"字段映射到该属性
     */
    @NotNull(message = "Type类型不能为空")
    @JsonAlias("type")
    private CardType type;

    /**
     * UserDto类型，包含与卡片相关联的用户信息
     * 使用@JsonAlias注解允许JSON中的"user"字段映射到该属性
     */
    private long userId ;

    /**
     * 标题，简短描述卡片内容的主题
     */
    @NotEmpty(message = "标题不能为空")
    private String title;

    /**
     * 内容，详细描述卡片所传达的信息
     */
    private String content;

    /**
     * 图片链接，用于展示卡片的图像内容
     */
    private String image;

    /**
     * 音频源链接，用于播放与卡片相关的音频内容
     */
    private String audioSrc;

    /**
     * 视频源链接，用于播放与卡片相关的视频内容
     */
    private String videoSrc;

}
