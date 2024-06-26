package com.alinesno.infra.base.cms.gateway.controller;

import com.alinesno.infra.base.cms.entity.LinkEntity;
import com.alinesno.infra.base.cms.entity.SiteEntity;
import com.alinesno.infra.base.cms.service.ISiteService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.wrapper.RpcWrapper;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 处理与SiteEntity相关的请求的Controller。
 * 继承自BaseController类并实现ISiteService接口。
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@Api(tags = "Site")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/cms/site")
public class SiteController extends BaseController<SiteEntity, ISiteService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(SiteController.class);

    @Autowired
    private ISiteService siteService;

    /**
     * 获取SiteEntity的DataTables数据。
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
    public ISiteService getFeign() {
        return this.siteService;
    }

    @GetMapping("/list")
    public TableDataInfo list(HttpServletRequest request,@RequestParam(value = "siteName", required = false) String siteName, DatatablesPageBean page) {
        RpcWrapper<LinkEntity> restWrapper = page.buildWrapper(request);
        LambdaQueryWrapper<SiteEntity> q = new LambdaQueryWrapper<SiteEntity>().like(StringUtils.isNotEmpty(siteName), SiteEntity::getName, siteName);
        Page<SiteEntity> siteEntityPage = siteService.page(new Page<>(restWrapper.getPageNumber(), restWrapper.getPageSize(), true), q);
        TableDataInfo dInfo = new TableDataInfo();
        dInfo.setCode(200);
        dInfo.setMsg("查询成功");
        dInfo.setRows(siteEntityPage.getRecords());
        dInfo.setTotal(((int)siteEntityPage.getTotal()));
        return dInfo;
    }
}