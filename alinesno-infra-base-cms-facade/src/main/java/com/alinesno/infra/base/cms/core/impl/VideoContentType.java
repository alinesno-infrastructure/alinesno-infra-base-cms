package com.alinesno.infra.base.cms.core.impl;

import com.alinesno.infra.base.cms.core.IContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(IContentType.BEAN_NAME_PREFIX + VideoContentType.ID)
@RequiredArgsConstructor
public class VideoContentType implements IContentType {

	public final static String ID = "video";
    
    private final static String NAME = "视频";


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
		return 4;
	}

	@Override
	public String getComponent() {
		return "cms/videoAlbum/editor";
	}


}
