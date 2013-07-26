package com.corrsolutions.service.impl;

import com.corrsolutions.dao.UserDao;
import com.corrsolutions.domain.User;
import com.corrsolutions.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

/*    @Override
    public User findByUserId(Integer userId) {
        return userDao.findById(userId);
    }*/

    @Override
    public User findByUserName(String userName) {
        return userDao.findById(userName);
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
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteUser(String userName) {
        User user = userDao.findById(userName);
        if (user != null) {
            userDao.delete(user);
        }
    }

    @Override
    public List<User> findUsers(String user) {
        return userDao.findUsers(user);
    }
}
