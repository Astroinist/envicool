package com.envicool.room.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.envicool.room.model.service.PostService;

@Controller
public class PostController {
    
    @Autowired
    private PostService postService;
    
    @RequestMapping("/post")
    public ModelAndView post() {
        return new ModelAndView("/post");
    }

    @RequestMapping("/admin/post")
    public ModelAndView admin() {
        return new ModelAndView("/admin/post");
    }
    
    @ResponseBody
    @RequestMapping("/admin/post/publish")
    public Object publish(
            @RequestParam(value="title", required=true, defaultValue="")String title,
            @RequestParam(value="content", required=true, defaultValue="")String content
            ) {
        return postService.publish(title, content);
    }
    
}
