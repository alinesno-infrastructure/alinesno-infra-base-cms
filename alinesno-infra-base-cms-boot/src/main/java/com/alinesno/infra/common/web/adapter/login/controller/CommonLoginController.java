package com.alinesno.infra.common.web.adapter.login.controller;

import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.dto.LoginBodyDto;
import com.alinesno.infra.common.web.adapter.dto.menus.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CommonLoginController {

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBodyDto loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = UUID.randomUUID().toString() ;
        ajax.put(TOKEN, token);
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo() {

        Map<String, Object> data = new HashMap<>();
        // 将数据填充到data中...
        data.put("permissions", new String[]{"*:*:*"});

        Map<String, Object> user = new HashMap<>();
        user.put("createBy", "admin");
        user.put("createTime", "2023-04-23 16:11:38");
        user.put("updateBy", null);
        user.put("updateTime", null);
        user.put("remark", "管理员");
        user.put("userId", 1);
        user.put("deptId", 103);
        user.put("userName", "admin");
        user.put("nickName", "AIP技术团队");
        user.put("email", "aip-team@163.com");
        user.put("phonenumber", "15888888888");
        user.put("sex", "1");
        user.put("avatar", "");
        user.put("password", "");
        user.put("status", "0");
        user.put("delFlag", "0");
        user.put("loginIp", "");
        user.put("loginDate", "2023-09-21T16:54:12.000+08:00");

        Map<String, Object> dept = new HashMap<>();
        dept.put("createBy", null);
        dept.put("createTime", null);
        dept.put("updateBy", null);
        dept.put("updateTime", null);
        dept.put("remark", null);
        dept.put("deptId", 103);
        dept.put("parentId", 101);
        dept.put("ancestors", "0,100,101");
        dept.put("deptName", "研发部门");
        dept.put("orderNum", 1);
        dept.put("leader", "AIP技术团队");
        dept.put("phone", null);
        dept.put("email", null);
        dept.put("status", "0");
        dept.put("delFlag", null);
        dept.put("parentName", null);
        dept.put("children", new Object[]{});

        user.put("dept", dept);

        Map<String, Object> role = new HashMap<>();
        role.put("createBy", null);
        role.put("createTime", null);
        role.put("updateBy", null);
        role.put("updateTime", null);
        role.put("remark", null);
        role.put("roleId", 1);
        role.put("roleName", "超级管理员");
        role.put("roleKey", "admin");
        role.put("roleSort", 1);
        role.put("dataScope", "1");
        role.put("menuCheckStrictly", false);
        role.put("deptCheckStrictly", false);
        role.put("status", "0");
        role.put("delFlag", null);
        role.put("flag", false);
        role.put("menuIds", null);
        role.put("deptIds", null);
        role.put("permissions", null);
        role.put("admin", true);

        user.put("roles", new Object[]{role});

        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
        ajax.put("roles", user.get("roles"));
        ajax.put("permissions", data.get("permissions"));

        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters() {

        Menu dashboardMenu = new Menu("Dashboard", "/dashboard", false, "noRedirect", "Layout", true, new Menu.Meta("概览", "dashboard", false, null), List.of(
                new Menu("Dashboard", "index", false, false , "dashboard", new Menu.Meta("仪盘表", "dashboard", false, null))
        ));

        Menu contentMenu = new Menu("Content", "/content", false, "noRedirect", "Layout", true, new Menu.Meta("内容管理", "post", false, null),
                List.of(
                        new Menu("Post", "base/cms/post/index", false,false,  "base/cms/post/index", new Menu.Meta("内容管理", "tree", false, null)),
                        new Menu("Attachment", "base/cms/attachment/index", false,false,  "base/cms/attachment/index", new Menu.Meta("附件管理", "user", false, null)),
                        new Menu("Special", "base/cms/special/index", false,false,  "base/cms/special/index", new Menu.Meta("专题", "tree", false, null)),
                        new Menu("Collection", "base/cms/collection/index", false,false,  "base/cms/collection/index", new Menu.Meta("采集管理", "tree", false, null)),
                        new Menu("Comment", "base/cms/comment/index", false,false,  "base/cms/comment/index", new Menu.Meta("评论管理", "tree", false, null)),
                        new Menu("Link", "base/cms/link/index", false,false,  "base/cms/link/index", new Menu.Meta("友情链接", "tree", false, null))

                ));

        Menu postMenu = new Menu("Post", "/Post", false, "noRedirect", "Layout", true, new Menu.Meta("发布管理", "monitor", false, null),
                List.of(
                        new Menu("Content", "base/cms/add/index", false,false, "base/cms/add/index", new Menu.Meta("文章发布", "content", false, null)),
                        new Menu("Tag", "base/cms/tag/index", false,false, "base/cms/tag/index", new Menu.Meta("标签管理", "Tag", false, null)),
                        new Menu("Template", "base/cms/template/index", false,false, "base/cms/template/index", new Menu.Meta("模板管理", "template", false, null))
                ));

        Menu cataMenu = new Menu("Cate", "/cate", false, "noRedirect", "Layout", true, new Menu.Meta("栏目管理", "log", false, null),
                List.of(
                        new Menu("Cate", "base/cms/cate/index", false,false, "base/cms/cate/index", new Menu.Meta("栏目管理", "cate", false, null)),
                        new Menu("Logininfor", "base/cms/logininfor/index", false,false, "base/cms/logininfor/index", new Menu.Meta("推荐位管理", "logininfor", false, null)),
                        new Menu("Type", "base/cms/type/index", false,false, "base/cms/type/index", new Menu.Meta("类别管理", "type", false, null)),
                        new Menu("Model", "base/cms/model/index", false,false, "base/cms/model/index", new Menu.Meta("模型管理", "model", false, null))
                ));

        Menu systemMenu = new Menu("System", "/system", false, "noRedirect", "Layout", true, new Menu.Meta("系统设置", "tool", false, null),
                List.of(
                        new Menu("Site", "base/cms/site/index", false,false, "base/cms/site/index", new Menu.Meta("站点管理", "tree", false, null)),
                        new Menu("Basic", "base/cms/basic/index",false, false, "base/cms/basic/index", new Menu.Meta("基础设置", "user", false, null)),
                        new Menu("Security", "base/cms/security/index",false, false, "base/cms/security/index", new Menu.Meta("安全设置", "logininfo", false, null)),
                        new Menu("Email", "base/cms/email/index",false, false, "base/cms/email/index", new Menu.Meta("邮箱配置", "tree", false, null))
                ));

        List<Menu> menus = List.of(dashboardMenu , contentMenu, postMenu , cataMenu , systemMenu);

        return AjaxResult.success(menus) ;
    }
}