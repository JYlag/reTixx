package com.retixx.reTixx.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "retixx")
public class IndexController {

    @RequestMapping(value = "")
    public String index (Model model) {

        model.addAttribute("title", "ReTixx");
        model.addAttribute("page", "ReTixx");

        return "index";
    }
}
