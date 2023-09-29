package com.alinesno.infra.base.cms.api.controller;

import com.alinesno.infra.base.cms.entity.AnnounceEntity;
import com.alinesno.infra.base.cms.service.IAnnounceService;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理与公告表相关的请求的Controller。
 * 继承自BaseController类并实现IAnnounceService接口。
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Api(tags = "Announce")
@RestController
@RequestMapping("/api/infra/simple/crm/announce")
public class AnnounceController extends BaseController<AnnounceEntity, IAnnounceService> {

    private static final Logger log = LoggerFactory.getLogger(AnnounceController.class);

    @Autowired
    private IAnnounceService service;

    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", page);
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public IAnnounceService getFeign() {
        return this.service;
    }
}