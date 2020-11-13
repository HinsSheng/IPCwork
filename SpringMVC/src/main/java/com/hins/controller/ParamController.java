package com.hins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author HinsChen
 * 测试请求类型及参数
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @GetMapping("/item/{p1}/{p2}")
    public String firstMethod(Model model,@PathVariable int p1,@PathVariable int p2) {
        int result =p1+p2;
        model.addAttribute("result",result);
        model.addAttribute("title","添加");
        return "item";
    }

    @PostMapping("/item/{p1}/{p2}")
    public String nextMethod(Model model,@PathVariable int p1,@PathVariable int p2) {
        int result =p1-p2;
        model.addAttribute("result",result);
        model.addAttribute("title","减少价格");
        return "item";
    }
    @PostMapping("/item")
    public String threeMethod(Model model,@RequestParam ("name") String name) {

        model.addAttribute("name",name);
        model.addAttribute("title",name);
        return "item";
    }
}
