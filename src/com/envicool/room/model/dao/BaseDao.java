package com.envicool.room.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BaseDao extends HibernateDaoSupport {

    @Autowired
    protected void setDisthenSessionFacotry(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }
    
}
