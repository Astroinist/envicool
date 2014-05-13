package com.envicool.room.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.envicool.room.model.entity.AboutEntity;

@Repository
public class AboutDao extends BaseDao {
    
    private static final String _QL = " FROM " + AboutEntity.class.getName() + " about ";
    
    @SuppressWarnings("unchecked")
    public AboutEntity about() {
        AboutEntity about = null;
        List<AboutEntity> abouts = getHibernateTemplate().find(_QL);
        if (abouts != null && !abouts.isEmpty()) {
            about = abouts.get(0);
        }
        return about;
    }
    
    /**
     * 新增或者修改About页面内容
     * @param title
     * @param content
     * @return
     */
    public AboutEntity modify(String title, String content) {
        AboutEntity about = about();
        if (about == null) {
            about = new AboutEntity();
        }
        about.setTitle(title);
        about.setContent(content);
        getHibernateTemplate().saveOrUpdate(about);
        return about;
    }
}
