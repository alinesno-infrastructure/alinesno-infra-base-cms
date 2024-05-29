package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.SiteEntity;
import com.alinesno.infra.base.cms.mapper.SiteMapper;
import com.alinesno.infra.base.cms.service.ISiteService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

/**
 * 站点Service业务层处理
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Service
public class SiteServiceImpl extends IBaseServiceImpl<SiteEntity, SiteMapper> implements ISiteService {
    //日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(SiteServiceImpl.class);

    @Override
    public SiteEntity getCurrentSite(HttpServletRequest request) {
        SiteEntity site = null;
        long siteId = NumberUtils.toLong(request.getHeader("CurrentSite"));
        if (siteId > 0) {
            site = this.getById(siteId);
        }
        // 无当前站点或当前站点无权限则取数据库查找一条有权限的站点数据作为当前站点
        if (Objects.isNull(site)) {
            Optional<SiteEntity> opt = this.lambdaQuery().list().stream().findFirst();
            if (opt.isPresent()) {
                site = opt.get();
            }
        }
        return site;
    }

}