package com.alinesno.infra.base.cms.gateway.controller;

import com.alinesno.infra.base.cms.core.ICatalogType;
import com.alinesno.infra.base.cms.core.IContentType;
import com.alinesno.infra.base.cms.entity.CatalogEntity;
import com.alinesno.infra.base.cms.service.ICatalogService;
import com.alinesno.infra.base.cms.service.ISiteService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * 处理与栏目相关的请求的Controller。
 * 继承自BaseController类并实现ICatalogService接口。
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Api(tags = "Catalog")
@RestController
@RequiredArgsConstructor
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/cms/catalog")
public class CatalogController extends BaseController<CatalogEntity, ICatalogService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(CatalogController.class);

    @Autowired
    private ICatalogService catalogService;

    private final ISiteService siteService;

    private final List<IContentType> contentTypes;

    private final List<ICatalogType> catalogTypes;


    /**
     * 获取栏目的DataTables数据。
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
    public ICatalogService getFeign() {
        return this.catalogService;
    }


    /**
     * 内容类型数据
     */
    @GetMapping("/getContentTypes")
    public AjaxResult getContentTypes() {
        List<Map<String, String>> list = this.contentTypes.stream().sorted(Comparator.comparingInt(IContentType::getOrder))
                .map(ct -> Map.of("id", ct.getId(), "name", ct.getName())).toList();
        return this.toAjax(list);
    }

    /**
     * 栏目类型数据
     */
    @GetMapping("/getCatalogTypes")
    public AjaxResult getCatalogTypes() {
        List<Map<String, String>> list = this.catalogTypes.stream()
                .map(ct -> Map.of("id", ct.getId(), "name", ct.getName())).toList();
        return this.toAjax(list);
    }

}