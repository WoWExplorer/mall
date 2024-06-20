package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 活动页面控制器
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @GetMapping("/index")
    public String test(Model model){
        model.addAttribute("name","张三");
        return "index";
    }

}
