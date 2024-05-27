package com.alinesno.infra.base.cms.core.impl;


import com.alinesno.infra.base.cms.core.IContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(IContentType.BEAN_NAME_PREFIX + AudioContentType.ID)
@RequiredArgsConstructor
public class AudioContentType implements IContentType {

	public final static String ID = "audio";
    
    private final static String NAME = "音频";


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
		return 3;
	}

	@Override
	public String getComponent() {
		return "cms/audioAlbum/editor";
	}


}
