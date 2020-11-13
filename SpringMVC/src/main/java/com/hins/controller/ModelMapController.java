package com.hins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HinsChen
 */
@Controller
public class ModelMapController {

    @GetMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("viewName","使用modelandview对象跳转");
        return modelAndView;
    }
    @GetMapping("/test1")
    public String test(@RequestParam("name") String name,ModelMap modelMap){

        modelMap.addAttribute("viewName","modelMap对象跳转"+name);
        Object viewName = modelMap.get("viewName");
        System.out.println(viewName);
        return "test";
    }

}
