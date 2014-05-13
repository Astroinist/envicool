package com.envicool.room.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.envicool.room.model.entity.ContactEntity;

@Repository
public class ContactDao extends BaseDao {
    
    private static final String _QL = " FROM " + ContactEntity.class.getName() + " contact ";
    
    @SuppressWarnings("unchecked")
    public ContactEntity contact() {
        ContactEntity about = null;
        List<ContactEntity> abouts = getHibernateTemplate().find(_QL);
        if (abouts != null && !abouts.isEmpty()) {
            about = abouts.get(0);
        }
        return about;
    }
    
    /**
     * 新增或者修改Contact页面内容
     * @param title
     * @param content
     * @return
     */
    public ContactEntity modify(String title, String content) {
        ContactEntity about = contact();
        if (about == null) {
            about = new ContactEntity();
        }
        about.setTitle(title);
        about.setContent(content);
        getHibernateTemplate().saveOrUpdate(about);
        return about;
    }
}
