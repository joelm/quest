package com.corrsolutions.quest.dao;


import com.corrsolutions.quest.domain.GameUser;

import java.util.List;

public interface GameUserDao extends AbstractDao<GameUser, String> {

    void saveUser(GameUser user);
    List<GameUser> findUsers(String userName);
}
