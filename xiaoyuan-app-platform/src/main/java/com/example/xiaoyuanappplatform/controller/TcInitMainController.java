package com.example.xiaoyuanappplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/init")
public class TcInitMainController {
    @RequestMapping("/menu")
    public @ResponseBody Map<String,Object> menu(){
        Map<String,Object> resultMap = new HashMap<>();
        //查询所有父级

        //查询二级菜单
        return resultMap;

    }
}
