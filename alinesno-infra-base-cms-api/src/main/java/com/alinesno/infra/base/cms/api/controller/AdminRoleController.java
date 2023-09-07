package com.alinesno.infra.base.cms.api.controller;

import com.alinesno.infra.base.cms.entity.AdminRoleEntity;
import com.alinesno.infra.base.cms.service.IAdminRoleService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
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
 * 处理与管理员角色相关的请求的Controller。
 * 继承自BaseController类并实现IAdminRoleService 接口。
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
 @Api(tags = "AdminRole")
 @RestController
 @Scope(SpringInstanceScope.PROTOTYPE)
 @RequestMapping("/api/infra/simple/crm/admin_role")
 public class AdminRoleController extends BaseController<AdminRoleEntity, IAdminRoleService> {

     // 日志记录
     private static final Logger log = LoggerFactory.getLogger(AdminRoleController.class);

     @Autowired
     private IAdminRoleService service;

     /**
      * 获取管理员角色的DataTables数据。
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
        return this.toDataInfo(model, this.getFeign(), page);
        }

    @Override
    public IAdminRoleService getFeign() {
        return this.service;
    }
 }
