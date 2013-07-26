package com.corrsolutions.dao;


import com.corrsolutions.domain.User;

import java.util.List;

public interface UserDao extends AbstractDao<User, String> {
    void saveUser(User user);
    List<User> findUsers(String userName);
}
