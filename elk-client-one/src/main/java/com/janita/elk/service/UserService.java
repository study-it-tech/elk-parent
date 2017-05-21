package com.janita.elk.service;

import com.janita.elk.bean.User;
import com.janita.elk.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-05-21 17:58
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User doLogin(String usename, String password) {

        return userDao.login(usename,password);
    }
}
