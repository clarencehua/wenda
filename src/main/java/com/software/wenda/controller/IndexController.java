package com.software.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index(){
        String a="1";
        return  "hello";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        String a=10+"";
        return "hello";
    }
}
