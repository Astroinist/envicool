package com.envicool.room.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envicool.room.model.dao.AboutDao;

@Service
public class AboutService {

    @Autowired
    private AboutDao dao;
    
}
