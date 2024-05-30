package com.alinesno.infra.base.cms.gateway.controller;

import com.alinesno.infra.base.cms.entity.SiteEntity;
import com.alinesno.infra.base.cms.entity.TemplateEntity;
import com.alinesno.infra.base.cms.service.ISiteService;
import com.alinesno.infra.base.cms.service.ITemplateService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 处理与TemplateEntity相关的请求的Controller。
 * 继承自BaseController类并实现ITemplateService接口。
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@Api(tags = "Template")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequiredArgsConstructor
@RequestMapping("/api/infra/base/cms/template")
public class TemplateController extends BaseController<TemplateEntity, ITemplateService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(TemplateController.class);

    private final ITemplateService templateService;

    private final ISiteService siteService;

    /**
     * 获取TemplateEntity的DataTables数据。
     *
     * @param request HttpServletRequest对象。
     * @param model Model对象。
     * @param page DatatablesPageBean对象。
     * @return 包含DataTables数据的TableDataInfo对象。
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public ITemplateService getFeign() {
        return this.templateService;
    }


    @ApiOperation("添加模板")
    @ResponseBody
    @PostMapping({"add"})
    public AjaxResult add(HttpServletRequest request, Model model, @RequestBody TemplateEntity entity) throws Exception {
        SiteEntity site = this.siteService.getCurrentSite(request);
        entity.setSiteId(site.getId());
        this.getFeign().save(entity);
        return this.ok();
    }
}