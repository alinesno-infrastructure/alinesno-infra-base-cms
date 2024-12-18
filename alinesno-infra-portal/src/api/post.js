import request from '@/utils/request'

// 查询当前会话是否登录
export function queryDynamic(){
  return request({
    url: '/v1/api/infra/base/cms/content/provider/queryNewDynamicContent',
    method: 'get'
  })
}