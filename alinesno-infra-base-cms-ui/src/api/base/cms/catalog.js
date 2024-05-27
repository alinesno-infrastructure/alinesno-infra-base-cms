import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/catalog/';
var managerUrl = {
  datatables: prefix + "datatables",
  createUrl: prefix + 'add',
  saveUrl: prefix + 'save',
  updateUrl: prefix + "modify",
  statusUrl: prefix + "changeStatus",
  cleanUrl: prefix + "clean",
  detailUrl: prefix + "detail",
  removeUrl: prefix + "delete",
  choiceApplication: prefix + "choiceApplication",
  exportUrl: prefix + "exportExcel",
  changeField: prefix + "changeField",
  currentApplication: prefix + "currentApplication",
  downloadfile: prefix + "downloadfile" ,
  latestList: prefix + "latestList",
  catalogTypes: prefix + "getCatalogTypes",
  contentTypes: prefix + "getContentTypes",
  treeData: prefix + "treeData",
  catalogData: prefix + "detail", // 注意：假设detailUrl是获取栏目信息的接口
  addCatalog: prefix + "add",
  updateCatalog: prefix + "modify",
  delCatalog: prefix + "delete",
  moveCatalog: prefix + "move",
  publishCatalog: prefix + "publish",
  catalogExtends: prefix + "extends",
  saveCatalogExtends: prefix + "extends",
  applyConfigPropsToChildren: prefix + "apply_children/config_props",
  applyPublishPipeToChildren: prefix + "apply_children/publish_pipe",
  changeVisible: prefix + "visible", // 注意：假设visibleUrl是修改栏目显示状态的接口
  sortCatalog: prefix + "sort"
}

// 查询栏目类型
export function getCatalogTypes() {
  return request({
    url: managerUrl.catalogTypes,
    method: 'get',
  })
}

// 查询内容类型
export function getContentTypes() {
  return request({
    url: managerUrl.contentTypes,
    method: 'get',
  })
}

export function getCatalogTreeData(params) {
  return request({
    url: managerUrl.treeData,
    method: 'get',
    params: params
  })
}


// 查询栏目信息
export function getCatalogData(catalogId) {
  return request({
    url: managerUrl.catalogData + '/' + catalogId,
    method: 'get'
  })
}

// 新增栏目
export function addCatalog(data) {
  return request({
    url: managerUrl.addCatalog,
    method: 'post',
    data: data
  })
}

// 修改栏目
export function updateCatalog(data) {
  return request({
    url: managerUrl.updateCatalog,
    method: 'put',
    data: data
  })
}

// 删除栏目
export function delCatalog(catalogId) {
  return request({
    url: managerUrl.delCatalog + '/' + catalogId,
    method: 'delete'
  })
}

// 转移栏目
export function moveCatalog(fromCatalogId, toCatalogId) {
  return request({
    url: managerUrl.moveCatalog + '/' + fromCatalogId + '/' + toCatalogId,
    method: 'post'
  })
}

// 发布栏目
export function publishCatalog(data) {
  return request({
    url: managerUrl.publishCatalog,
    method: 'post',
    data: data
  })
}

// 获取栏目扩展属性
export function getCatalogExtends(params) {
  return request({
    url: managerUrl.catalogExtends,
    method: 'get',
    params: params
  })
}

// 保存栏目扩展属性
export function saveCatalogExtends(catalogId, data) {
  return request({
    url: managerUrl.saveCatalogExtends + '/' + catalogId,
    method: 'put',
    data: data
  })
}

// 栏目扩展配置应用到栏目
export function applyConfigPropsToChildren(data) {
  return request({
    url: managerUrl.applyConfigPropsToChildren,
    method: 'put',
    data: data
  })
}

// 栏目发布通道配置应用到子栏目
export function applyPublishPipeToChildren(data) {
  return request({
    url: managerUrl.applyPublishPipeToChildren,
    method: 'put',
    data: data
  })
}

// 修改栏目显示状态
export function changeVisible(catalogId, visible) {
  return request({
    url: managerUrl.changeVisible,
    method: 'put',
    data: { catalogId: catalogId, visible: visible }
  })
}

export function sortCatalog(data) {
  return request({
    url: managerUrl.sortCatalog,
    method: 'put',
    data: data
  })
}
