package com.retixx.reTixx.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("retixx")
public class IndexController {

    @RequestMapping(value = "")
    public String index (Model model) {

        model.addAttribute("title", "ReTixx");

        return "retixx/index";
    }
}
