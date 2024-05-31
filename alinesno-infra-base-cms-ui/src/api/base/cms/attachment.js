import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/attachment/';
var managerUrl = {
    datatables: prefix + "datatables",
    detailUrl: prefix + "detail",
    saveUrl: prefix + 'save',
    updateUrl: prefix + "modify",
    removeUrl: prefix + "delete",
    types: prefix + "types"
}

export function getResourceTypes() {
    return request({
        url: managerUrl+types,
        method: 'get'
    })
}

// 查询资源列表
export function getResrouceList(query) {
    return request({
        url: managerUrl.datatables,
        method: 'post',
        params: query
    })
}

// 获取资源详情
export function getResourceDetail(id) {
    return request({
        url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
        method: 'get'
    })
}

// 删除资源
export function delResource(id) {
    return request({
        url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
        method: 'delete'
    })
}