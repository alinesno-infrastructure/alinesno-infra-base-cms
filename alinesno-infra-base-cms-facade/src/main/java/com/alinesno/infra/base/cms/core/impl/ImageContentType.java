package com.alinesno.infra.base.cms.core.impl;


import com.alinesno.infra.base.cms.core.IContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(IContentType.BEAN_NAME_PREFIX + ImageContentType.ID)
@RequiredArgsConstructor
public class ImageContentType implements IContentType {

	public final static String ID = "image";
    
    private final static String NAME = "图片";


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
		return 2;
	}

	@Override
	public String getComponent() {
		return "cms/imageAlbum/editor";
	}


}
