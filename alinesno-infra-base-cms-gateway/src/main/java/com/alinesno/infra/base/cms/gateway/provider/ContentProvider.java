package com.alinesno.infra.base.cms.gateway.provider;

import com.alinesno.infra.common.web.adapter.rest.SuperController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内容提供者
 */
@Slf4j
@RestController
@RequestMapping("/v1/api/infra/base/cms/content/provider/")
public class ContentProvider extends SuperController {

}
