import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/tag/';
var managerUrl = {
    datatables: prefix + "datatables",
    detailUrl: prefix + "detail",
    saveUrl: prefix + 'save',
    updateUrl: prefix + "modify",
    removeUrl: prefix + "delete",
}

// 查询标签列表
export function listTag(query) {
    return request({
        url: managerUrl.datatables,
        method: 'post',
        params: query
    })
}

// 查询标签详细
export function getTag(id) {
    return request({
        url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
        method: 'get'
    })
}

// 新增标签
export function addTag(data) {
    return request({
        url: managerUrl.saveUrl,
        method: 'post',
        data: data
    })
}

// 修改标签
export function updateTag(data) {
    return request({
        url: managerUrl.updateUrl,
        method: 'put',
        data: data
    })
}

// 删除标签
export function delTag(id) {
    return request({
        url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
        method: 'delete'
    })
}


