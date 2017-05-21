package com.janita.elk.controller;

import com.janita.elk.bean.User;
import com.janita.elk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-05-21 17:55
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    
    @PostMapping("/login")
    public User login(@RequestBody User user){

        //config
        //TODO 在这里需要向ELK中写入日志
        String username = user.getUsername();
        String password = user.getPassword();
        return userService.doLogin(username, password);
    }
}
