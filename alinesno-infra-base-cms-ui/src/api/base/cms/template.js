import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/template/';
var managerUrl = {
    datatables: prefix + "datatables",
    detailUrl: prefix + "detail",
    add: prefix + 'add',
    updateUrl: prefix + "modify",
    removeUrl: prefix + "delete",
    rename: prefix + "rename",
    clearIncludeCache: prefix + "clearIncludeCache"
    
}

// 查询模板文件数据集合
export function getTemplateList(query) {
    return request({
        url: managerUrl.datatables,
        method: 'post',
        params: query
    })
}

// 查询模板文件内容
export function getTemplateDetail(id) {
    return request({
        url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
        method: 'get'
    })
}

// 模板文件重命名
export function renameTemplate(data) {
    return request({
        url: managerUrl.rename,
        method: 'post',
        data: data
    })
}

// 新增模板文件
export function addTemplate(data) {
    return request({
        url: managerUrl.add,
        method: 'post',
        data: data
    })
}

// 修改模板
export function editTemplate(data) {
    return request({
        url: managerUrl.updateUrl,
        method: 'put',
        data: data
    })
}

// 删除模板
export function delTemplate(id) {
    return request({
        url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
        method: 'delete'
    })
}

// 删除区块模板缓存
export function clearIncludeCache(templates) {
    return request({
        url: '/cms/template/clearIncludeCache',
        method: 'delete',
        data: templates
    })
}