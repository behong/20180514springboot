package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/hellohtml")
    public String helloWorld(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        return "hello";
    }

}
