package com.alinesno.infra.base.cms.service;

import com.alinesno.infra.base.cms.entity.CatalogEntity;
import com.alinesno.infra.base.cms.entity.TreeNode;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * 栏目Service接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
public interface ICatalogService extends IBaseService<CatalogEntity> {


    /**
     * 构建栏目树数据
     *
     * @param catalogs
     * @return
     */
    List<TreeNode<String>> buildCatalogTreeData(List<CatalogEntity> catalogs, BiConsumer<CatalogEntity, TreeNode<String>> consumer);
}