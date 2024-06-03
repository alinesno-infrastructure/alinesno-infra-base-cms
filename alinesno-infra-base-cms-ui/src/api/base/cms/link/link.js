import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/link/';
var managerUrl = {
  datatables: prefix + "datatables",
  list: prefix + "list",
  detailUrl: prefix + "detail",
  saveUrl: prefix + 'save',
  updateUrl: prefix + "modify",
  removeUrl: prefix + "delete",

}


// 查询友情链接列表
export function listLink(query) {
  return request({
    url: managerUrl.list,
    method: 'get',
    params: query
  })
}

// 查询友情链接详细
export function getLink(id) {
  return request({
    url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增友情链接
export function addLink(data) {
  return request({
    url: managerUrl.saveUrl,
    method: 'post',
    data: data
  })
}

// 修改友情链接
export function updateLink(data) {
  return request({
    url: managerUrl.updateUrl,
    method: 'put',
    data: data
  })
}

// 删除友情链接
export function delLink(id) {
  return request({
    url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
    method: 'delete'
  })
}