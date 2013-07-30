package com.corrsolutions.service.impl;

import com.corrsolutions.dao.GameUserDao;
import com.corrsolutions.domain.GameUser;
import com.corrsolutions.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private GameUserDao gameUserDao;

/*    @Override
    public User findByUserId(Integer userId) {
        return userDao.findById(userId);
    }*/

    @Override
    public GameUser findByUserName(String userName) {
        return gameUserDao.findById(userName);
    }

/*    @Override
    @SuppressWarnings("unchecked")
    public User findByUserName(final String username){

        return getHibernateTemplate().execute(new HibernateCallback<User>() {

            @Override
            public User doInHibernate(final Session session) {
                final Query query = session.getNamedQuery("findUserByUsername");
                query.setParameter("username", username);
                List<User> userList = query.list();
                return DataAccessUtils.requiredSingleResult(userList);
            }
        });
    }*/

    @Override
    @Transactional(readOnly = false)
    public void saveUser(GameUser user) {
        gameUserDao.saveUser(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteUser(String userName) {
        GameUser user = gameUserDao.findById(userName);
        if (user != null) {
            gameUserDao.delete(user);
        }
    }

    @Override
    public List<GameUser> findUsers(String user) {
        return gameUserDao.findUsers(user);
    }
}
