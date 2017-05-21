package com.janita.elk.controller;

import com.janita.elk.bean.User;
import com.janita.elk.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-05-21 17:55
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    
    @GetMapping("/login")
    public User login(String username){


        logger.debug("朱晨剑 在登录");
        return userService.doLogin(username, "123456");
    }
}
