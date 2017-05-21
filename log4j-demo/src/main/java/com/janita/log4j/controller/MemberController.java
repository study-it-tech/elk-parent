package com.janita.log4j.controller;

import com.janita.log4j.bean.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-05-21 18:46
 */
@RestController
@RequestMapping(value = "/member")
public class MemberController {


    @GetMapping("/member")
    public Member member(String name){
        Member member = new Member();
        member.setName(name);
        member.setPassword("123");
        return member;
    }
}
