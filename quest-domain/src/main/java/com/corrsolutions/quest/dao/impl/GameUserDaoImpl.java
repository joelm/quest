package com.corrsolutions.quest.dao.impl;


import com.corrsolutions.quest.dao.GameUserDao;
import com.corrsolutions.quest.domain.GameUser;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameUserDaoImpl extends AbstractDaoImpl<GameUser, String> implements GameUserDao {

    protected GameUserDaoImpl() {
        super(GameUser.class);
    }

    @Override
    public void saveUser(GameUser user) {
        saveOrUpdate(user);
    }

    @Override
    public List<GameUser> findUsers(String userName) {
        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
    }
}
