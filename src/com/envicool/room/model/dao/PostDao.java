package com.envicool.room.model.dao;

import org.springframework.stereotype.Repository;

import com.envicool.room.model.entity.PostEntity;

@Repository
public class PostDao extends BaseDao {

    public PostEntity publish(String title, String content) {
        PostEntity post = new PostEntity(title, content);
        getHibernateTemplate().saveOrUpdate(post);
        return post;
    }

}
