package com.alinesno.infra.base.cms.core.impl;


import com.alinesno.infra.base.cms.core.IContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(IContentType.BEAN_NAME_PREFIX + ArticleContentType.ID)
@RequiredArgsConstructor
public class ArticleContentType implements IContentType {

    public final static String ID = "article";

    private final static String NAME = "文章";


    @Override
    public String getId() {
        return ID;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getComponent() {
        return "cms/article/editor";
    }

}
