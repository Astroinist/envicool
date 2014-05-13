package com.envicool.room.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.envicool.room.model.service.AboutService;

@Controller
public class AboutController {

    @Autowired
    private AboutService service;
    
    private static final ModelAndView DEFAULT_VIEW = new ModelAndView("/about");
    
    private static final ModelAndView ADMIN_VIEW = new ModelAndView("/admin/about");
    
    @RequestMapping("/about")
    public ModelAndView about() {
        return DEFAULT_VIEW;
    }
    
    @RequestMapping("/admin/about")
    public ModelAndView admin() {
        return ADMIN_VIEW;
    }
}
