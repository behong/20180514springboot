package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloJspController {

    @RequestMapping(value = "/helloJsp", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        return "helloJsp";
    }

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String blog(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        return "blog";
    }

}
