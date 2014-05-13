package com.envicool.room.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envicool.room.model.dao.UserDao;
import com.envicool.room.model.entity.UserEntity;

@Service
public class UserService {

    @Autowired
    private UserDao dao;
    
    public UserEntity findUserByNameAndPassword(String name, String password) {
        return dao.findUserByNameAndPassword(name, password);
    }
    
    //public UserEntity newUser

}
