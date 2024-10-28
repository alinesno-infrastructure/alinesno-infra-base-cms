package com.alinesno.infra.base.cms.config;

import com.alinesno.infra.common.extend.datasource.enable.EnableInfraDataScope;
import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.dtflys.forest.springboot.annotation.ForestScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@EnableInfraDataScope
@EnableActable
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.base.cms.mapper")
@ForestScan({
        "com.alinesno.infra.common.web.adapter.base.consumer"
})
@Configuration
public class AppConfiguration {
}
