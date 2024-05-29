package com.alinesno.infra.base.cms.service.impl;

import com.alinesno.infra.base.cms.entity.CatalogEntity;
import com.alinesno.infra.base.cms.entity.TreeNode;
import com.alinesno.infra.base.cms.mapper.CatalogMapper;
import com.alinesno.infra.base.cms.service.ICatalogService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

/**
 * 栏目Service业务层处理
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
@Service
public class CatalogServiceImpl extends IBaseServiceImpl<CatalogEntity, CatalogMapper> implements ICatalogService {
    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CatalogServiceImpl.class);


    @Override
    public List<TreeNode<String>> buildCatalogTreeData(List<CatalogEntity> catalogs, BiConsumer<CatalogEntity, TreeNode<String>> consumer) {
        if (Objects.isNull(catalogs)) {
            return List.of();
        }
        List<TreeNode<String>> list = catalogs.stream().map(c -> {
            TreeNode<String> treeNode = new TreeNode<>(String.valueOf(c.getId()), String.valueOf(c.getParentId()), c.getName(), c.getParentId() == 0);
            Map<String, Object> props = Map.of("path", c.getPath(), "description", c.getDescription() == null ? "" : c.getDescription());
            treeNode.setProps(props);
            return treeNode;
        }).toList();
        return TreeNode.build(list);
    }
}