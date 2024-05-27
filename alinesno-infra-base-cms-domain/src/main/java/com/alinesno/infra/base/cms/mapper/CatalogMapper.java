package com.alinesno.infra.base.cms.mapper;

import com.alinesno.infra.base.cms.entity.CatalogEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 栏目Mapper接口
 *
 * @version 1.0.0
 * @author luoxiaodong
 */
public interface CatalogMapper extends IBaseMapper<CatalogEntity> {

    /**
     * 排序标识范围内[startSort, endSort)的所有栏目排序值+1
     *
     * @param startSort
     * @param endSort
     * @return
     */
    @Update("update catalog set sort_flag = sort_flag + 1 where sort_flag >= #{startSort} and sort_flag < #{endSort}")
    public Long catalogSortPlusOne(@Param("startSort") Long startSort, @Param("endSort") Long endSort);

    /**
     * 排序标识范围内(startSort, endSort]的所有栏目排序值-1
     *
     * @param startSort
     * @param endSort
     * @return
     */
    @Update("update catalog set sort_flag = sort_flag - 1 where sort_flag > #{startSort} and sort_flag <= #{endSort}")
    public Long catalogSortMinusOne(@Param("startSort") Long startSort, @Param("endSort") Long endSort);
}