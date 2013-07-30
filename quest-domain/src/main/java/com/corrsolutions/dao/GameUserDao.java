package com.corrsolutions.dao;


import com.corrsolutions.domain.GameUser;

import java.util.List;

public interface GameUserDao extends AbstractDao<GameUser, String> {

    void saveUser(GameUser user);
    List<GameUser> findUsers(String userName);
}
