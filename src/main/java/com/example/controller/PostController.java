package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.Postdao;
import com.example.vo.Post;

@Controller
@RequestMapping("/POST")
public class PostController {

    @Autowired
    private Postdao postDao;

    @RequestMapping("/write")
    public String write(Post post) {

        post.setRegDate(new Date());
        return "redirect:/post/" + postDao.save(post).getId();
    }

}
