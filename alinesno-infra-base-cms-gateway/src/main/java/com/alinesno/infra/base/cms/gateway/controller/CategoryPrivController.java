package com.alinesno.infra.base.cms.gateway.controller;

import com.alinesno.infra.base.cms.entity.CategoryPrivEntity;
import com.alinesno.infra.base.cms.service.ICategoryPrivService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理与CategoryPrivEntity相关的请求的Controller。
 * 继承自BaseController类并实现ICategoryPrivService接口。
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Api(tags = "CategoryPriv")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/cms/category_priv")
public class CategoryPrivController extends BaseController<CategoryPrivEntity, ICategoryPrivService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(CategoryPrivController.class);

    @Autowired
    private ICategoryPrivService service;

    /**
     * 获取CategoryPrivEntity的DataTables数据。
     *
     * @param request HttpServletRequest对象。
     * @param model   Model对象。
     * @param page    DatatablesPageBean对象。
     * @return 包含DataTables数据的TableDataInfo对象。
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public ICategoryPrivService getFeign() {
        return this.service;
    }
}