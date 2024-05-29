package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.SiteEntity;
import com.alinesno.infra.common.facade.services.IBaseService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 站点Service接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
public interface ISiteService extends IBaseService<SiteEntity> {

    /**
     * 获取当前站点，保存在token中
     */
    SiteEntity getCurrentSite(HttpServletRequest request);

}