import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 接口配置项
var prefix = '/api/infra/base/cms/comment/';
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
    reply: prefix + "reply",
    like: prefix + "like"

}


// 查询评论列表
export function listComment(query) {
    return request({
        url: managerUrl.datatables,
        method: 'post',
        params: query
    })
}

// 查询评论详细
export function getComment(id) {
    return request({
        url: managerUrl.detailUrl + '/' + parseStrEmpty(id),
        method: 'get'
    })
}

// 新增评论
export function addComment(data) {
    return request({
        url: managerUrl.saveUrl,
        method: 'post',
        data: data
    })
}

// 修改评论
export function updateComment(data) {
    return request({
        url: managerUrl.updateUrl,
        method: 'put',
        data: data
    })
}

// 删除评论
export function delComment(id) {
    return request({
        url: managerUrl.removeUrl + '/' + parseStrEmpty(id),
        method: 'delete'
    })
}

// 获取评论回复列表
export function getCommentReplyList(id, params) {
    return request({
        url: managerUrl.reply + '/' + parseStrEmpty(id),
        method: 'get',
        params: params
    })
}

// 获取评论点赞列表
export function getCommentLikeList(id, params) {
    return request({
        url: managerUrl.like + '/' + parseStrEmpty(id),
        method: 'get',
        params: params
    })
}