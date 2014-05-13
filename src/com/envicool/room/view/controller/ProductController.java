package com.envicool.room.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.envicool.room.model.service.ProductService;

@Controller
public class ProductController {
    
    @Autowired
    private ProductService service; 
    
}
