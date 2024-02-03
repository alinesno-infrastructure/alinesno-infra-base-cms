package com.alinesno.infra.base.cms.dto;

import lombok.Data;

/**
 * 文章内容章节配置
 */
@Data
public class ChapterContentDto {

    private String sub ; // 子章节内容
    private String chapter ; // 章节名称
    private String content ; // 保存内容

}