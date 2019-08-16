package com.cskaoyan.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("auth/login")
    @ResponseBody
    public Map login() {
        return responseSuccess();
    }

    @RequestMapping("auth/info")
    @ResponseBody
    public Map getInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("errno", 0);
        map.put("errmsg", "成功");
        Map<String, Object> data = new HashMap<>();
        String name = "admin123";
        String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String[] perms = {"*"};
        String[] roles = {"超级管理员"};
        data.put("name", name);
        data.put("avatar", avatar);
        data.put("perms", perms);
        data.put("roles", roles);
        map.put("data", data);
        return map;
    }

    @RequestMapping("dashboard")
    @ResponseBody
    public Map dashBoard() {
        Map<String, Object> map = new HashMap<>();
        map.put("errno", 0);
        map.put("errmsg", "成功");
        Map<String, Object> data = new HashMap<>();
        data.put("goodsTotal", 10);
        data.put("orderTotal", 20);
        data.put("productTotal", 30);
        data.put("userTotal", 40);
        map.put("data", data);
        return map;
    }

    private Map responseSuccess() {
        Map<String, Object> map = new HashMap<>();
        map.put("errno", 0);
        map.put("errmsg", "成功");
        map.put("data", "?");
        return map;
    }
}
