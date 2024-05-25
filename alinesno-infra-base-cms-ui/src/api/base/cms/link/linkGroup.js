import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/link_group/';
var managerUrl = {
  datatables: prefix + "datatables",
  createUrl: prefix + 'add',
  saveUrl: prefix + 'save',
  updateUrl: prefix + "modify",
  statusUrl: prefix + "changeStatus",
  cleanUrl: prefix + "clean",
  detailUrl: prefix + "detail",
  removeUrl: prefix + "delete",
  choiceLink: prefix + "choiceLink",
  exportUrl: prefix + "exportExcel",
  changeField: prefix + "changeField",
  currentLink: prefix + "currentLink",
  downloadfile: prefix + "downloadfile" ,
  latestList: prefix + "latestList"
}


// 查询友情链接分组列表
export function listLinkGroup(query) {
  return request({
    url: managerUrl.datatables,
    method: 'post',
    params: query
  })
}

// 查询友情链接分组详细
export function getLinkGroup(id) {
  return request({
    url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增友情链接分组
export function addLinkGroup(data) {
  return request({
    url: managerUrl.saveUrl,
    method: 'post',
    data: data
  })
}

// 修改友情链接分组
export function updateLinkGroup(data) {
  return request({
    url: managerUrl.updateUrl,
    method: 'put',
    data: data
  })
}

// 删除友情链接分组
export function delLinkGroup(id) {
  return request({
    url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
    method: 'delete'
  })
}