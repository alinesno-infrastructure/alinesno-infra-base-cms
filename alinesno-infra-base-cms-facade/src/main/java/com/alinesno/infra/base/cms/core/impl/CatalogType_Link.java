/*
 * Copyright 2022-2024 兮玥(190785909@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
