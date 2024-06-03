package com.alinesno.infra.base.cms.gateway.controller;

import com.alinesno.infra.base.cms.entity.LinkEntity;
import com.alinesno.infra.base.cms.service.ILinkService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.facade.wrapper.RpcWrapper;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.Min;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 处理与LinkEntity相关的请求的Controller。
 * 继承自BaseController类并实现ILinkService接口。
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@Api(tags = "Link")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/cms/link")
public class LinkController extends BaseController<LinkEntity, ILinkService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(LinkController.class);

    @Autowired
    private ILinkService linkService;

    /**
     * 获取LinkEntity的DataTables数据。
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
    public ILinkService getFeign() {
        return this.linkService;
    }

    @ResponseBody
    @GetMapping("/list")
    public AjaxResult getPageList(HttpServletRequest request,@RequestParam("groupId") @Min(1) Long groupId,
                                  @RequestParam(value = "query", required = false) String query, DatatablesPageBean page) {
        RpcWrapper<LinkEntity> restWrapper = page.buildWrapper(request);
        Page<LinkEntity> linkEntityPage = this.linkService.lambdaQuery().eq(LinkEntity::getGroupId, groupId)
                .like(StringUtils.isNotEmpty(query), LinkEntity::getName, query)
                .orderByAsc(LinkEntity::getSortFlag)
                .page(new Page<>(restWrapper.getPageNumber(), restWrapper.getPageSize(), true));
        return AjaxResult.success(linkEntityPage);
    }
}