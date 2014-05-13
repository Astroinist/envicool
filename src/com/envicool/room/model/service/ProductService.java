package com.envicool.room.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envicool.room.model.dao.ProductDao;

@Service
public class ProductService {

    @Autowired
    private ProductDao dao;
    
}
