package com.janita.elk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017-05-21 17:54
 */
public class User implements Serializable {

    private Long userId;

    private String username;

    private String password;

    private Integer age;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
