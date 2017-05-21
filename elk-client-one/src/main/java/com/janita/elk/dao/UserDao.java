package com.janita.elk.dao;

import com.janita.elk.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-05-21 17:58
 */
@Repository
public class UserDao {

    public User login(String username,String password){

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
