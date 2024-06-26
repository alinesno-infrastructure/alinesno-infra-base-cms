import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/site/';
var managerUrl = {
    datatables: prefix + "datatables",
    detailUrl: prefix + "detail",
    saveUrl: prefix + 'save',
    updateUrl: prefix + "modify",
    removeUrl: prefix + "delete",
    publish: prefix + "publish",
    list: prefix + "list"
}

// 查询站点列表
export function listSite(query) {
    return request({
        url: managerUrl.list,
        method: 'get',
        params: query
    })
}

// 查询站点详细
export function getSite(id) {
    return request({
        url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
        method: 'get'
    })
}

// 新增站点
export function addSite(data) {
    return request({
        url: managerUrl.saveUrl,
        method: 'post',
        data: data
    })
}

// 修改站点
export function updateSite(data) {
    return request({
        url: managerUrl.updateUrl,
        method: 'put',
        data: data
    })
}

// 删除站点
export function delSite(id) {
    return request({
        url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
        method: 'delete'
    })
}


// 发布站点
export function publishSite(data) {
    return request({
        url: '/cms/site/publish',
        method: 'post',
        data: data // { siteId:long, publishIndex:boolean, contentStatus:int }
    })
}
