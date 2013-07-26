package com.corrsolutions.service;


import com.corrsolutions.domain.User;

import java.util.List;

public interface UserService {

    User findByUserName(String userName);
    void saveUser(User user);
    void deleteUser(String userName);
    List<User> findUsers(String user);
}
