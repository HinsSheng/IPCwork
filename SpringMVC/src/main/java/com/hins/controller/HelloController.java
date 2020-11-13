package com.hins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**
 * @author HinsChen
 */
@Controller
@RequestMapping("/any")
public class HelloController {
    @RequestMapping("/any")
    public String anyWay(Model model){
        model.addAttribute("msg","注解式开发 first");
        model.addAttribute("title","first of annotation");
        return "any";
    }
    @RequestMapping("/next")
    public String next(Model model){
        model.addAttribute("msg","request Test 测试 ");
        model.addAttribute("title","next of annotation");

        return "any";

    }
}
