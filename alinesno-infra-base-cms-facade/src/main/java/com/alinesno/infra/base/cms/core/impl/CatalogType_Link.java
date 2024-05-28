package com.alinesno.infra.base.cms.core.impl;

import com.alinesno.infra.base.cms.core.ICatalogType;
import org.springframework.stereotype.Component;


/**
 * 栏目类型：链接栏目
 *
 * @author Ocean
 * @version 1.0.0
 */
@Component(ICatalogType.BEAN_NAME_PREFIX + CatalogType_Link.ID)
public class CatalogType_Link implements ICatalogType {

	public final static String ID = "link";
    
    private final static String NAME = "链接栏目";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return NAME;
	}
}
