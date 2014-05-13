package com.envicool.room.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envicool.room.model.dao.PostDao;
import com.envicool.room.model.entity.PostEntity;

@Service
public class PostService {

    @Autowired
    private PostDao dao;
    
    public PostEntity publish(String title, String content) {
        return dao.publish(title, content);
    }
    
}
