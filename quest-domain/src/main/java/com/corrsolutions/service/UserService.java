package com.corrsolutions.service;


import com.corrsolutions.domain.GameUser;

import java.util.List;

public interface UserService {

    GameUser findByUserName(String userName);
    void saveUser(GameUser user);
    void deleteUser(String userName);
    List<GameUser> findUsers(String user);
}
