package com.cskaoyan.mall.controller.system;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("admin/admin")
public class AdminController {

    @RequestMapping("list")
    public Map listAdmin() {

    }
}
