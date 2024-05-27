import request from '@/utils/request'
import {parseStrEmpty} from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/content/';
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

  init: prefix + "init",
  publish: prefix + "publish",
  lock: prefix + "lock",
  unlock: prefix + "unlock",
  build: prefix + "build",
  copy: prefix + "copy",
  move: prefix + "move",
  setTop: prefix + "setTop",
  cancelTop: prefix + "cancelTop",
  sort: prefix + "sort",
  offline: prefix + "offline",
  toPublish: prefix + "toPublish",
  archive: prefix + "archive",
  attrAdd: prefix + "attrAdd",
  attrRemove: prefix + "attrRemove"
};

// 查询内容列表
export function getContentList(query) {
  return request({
    url: managerUrl.datatables,
    method: 'post',
    params: query
  })
}

// 初始化内容编辑数据
export function getInitContentEditorData(catalogId, contentType, id) {
  return request({
    url: managerUrl.init + '/' + catalogId + "/" + contentType + "/" + id,
    method: 'get'
  })
}

// 新增内容
export function addContent(data) {
  return request({
    url: managerUrl.saveUrl,
    method: 'post',
    data: data
  })
}

// 修改内容
export function saveContent(data) {
  return request({
    url: managerUrl.updateUrl,
    method: 'put',
    data: data
  })
}

// 删除内容
export function delContent(id) {
  return request({
    url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
    method: 'delete'
  })
}

// 发布内容
export function publishContent(ids) {
  return request({
    url: managerUrl.publish,
    method: 'post',
    data: { ids: ids }
  })
}

// 锁定内容
export function lockContent(id) {
  return request({
    url: managerUrl.lock + '/' + id,
    method: 'post'
  })
}

// 解锁内容
export function unLockContent(id) {
  return request({
    url: managerUrl.unlock + '/' + id,
    method: 'post'
  })
}

// 创建索引
export function createIndexes(id) {
  return request({
    url: managerUrl.build + '/' + id,
    method: 'post'
  })
}

// 复制内容
export function copyContent(data) {
  return request({
    url: managerUrl.copy,
    method: 'post',
    data: data
  })
}

// 移动内容
export function moveContent(data) {
  return request({
    url: managerUrl.move,
    method: 'post',
    data: data
  })
}

// 设置置顶内容
export function setTopContent(data) {
  return request({
    url: managerUrl.setTop,
    method: 'post',
    data: data
  })
}

// 取消置顶内容
export function cancelTopContent(data) {
  return request({
    url: managerUrl.cancelTop,
    method: 'post',
    data: data
  })
}

// 排序内容
export function sortContent(data) {
  return request({
    url: managerUrl.sort,
    method: 'post',
    data: data
  })
}

// 下线内容
export function offlineContent(data) {
  return request({
    url: managerUrl.offline,
    method: 'post',
    data: data
  })
}

// 转为发布内容
export function toPublishContent(ids) {
  return request({
    url: managerUrl.toPublish,
    method: 'post',
    data: ids
  })
}

// 归档内容
export function archiveContent(data) {
  return request({
    url: managerUrl.archive,
    method: 'post',
    data: data
  })
}

// 添加内容属性
export function addContentAttribute(data) {
  return request({
    url: managerUrl.attrAdd,
    method: 'post',
    data: data
  })
}

// 移除内容属性
export function removeContentAttribute(data) {
  return request({
    url: managerUrl.attrRemove,
    method: 'delete',
    data: data
  })
}