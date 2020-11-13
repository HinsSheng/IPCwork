package com.hins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.http.HttpServletRequest;

/**
 * @author HinsChen
 * 设施
 */
@Controller
@RequestMapping("/REST")
public class RestFulController {
    @GetMapping("/method")
    public String one(Model model,HttpServletRequest request) {
        String method = request.getMethod();
        model.addAttribute("msg","GET 请求");
        model.addAttribute("title",method);
        return "any";

    }
    @RequestMapping(method = RequestMethod.POST,value = "/method")
    public String two(Model model,HttpServletRequest request) {
        String method = request.getMethod();
        model.addAttribute("msg"," POST 请求");
        model.addAttribute("title",method);
        return "any";
    }

}
