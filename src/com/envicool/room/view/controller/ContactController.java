package com.envicool.room.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.envicool.room.model.service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService service;
    
    private static final ModelAndView DEFAULT_VIEW = new ModelAndView("/contact");
    
    private static final ModelAndView ADMIN_VIEW = new ModelAndView("/admin/contact");
    
    @RequestMapping("/contact")
    public ModelAndView about() {
        return DEFAULT_VIEW;
    }
    
    @RequestMapping("/admin/contact")
    public ModelAndView admin() {
        return ADMIN_VIEW;
    }
}
