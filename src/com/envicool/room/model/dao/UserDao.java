package com.envicool.room.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.envicool.room.model.entity.UserEntity;
import com.envicool.room.model.util.CommonUtil;

@Repository
public class UserDao extends BaseDao {

    private static final String _QL = " FROM " + UserEntity.class.getName() + " user ";
    
    @SuppressWarnings("unchecked")
    public UserEntity findUserByNameAndPassword(String name, String password) {
        String pswd = CommonUtil.md5(password);
        String ql = _QL + " WHERE user.login = ? AND password = ?";
        List<UserEntity> users = getHibernateTemplate().find(ql, name, pswd);
        UserEntity user = null;
        if (users != null && !users.isEmpty()) {
            user = users.get(0);
        }
        return user;
    }


}
