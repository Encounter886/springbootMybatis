package com.zzx.springbootmybatis.controller;

import com.zzx.springbootmybatis.bean.Login;
import com.zzx.springbootmybatis.bean.Person;
import com.zzx.springbootmybatis.mapper.LoginMapper;
import com.zzx.springbootmybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginMapper loginMapper;

    @Autowired
    PersonMapper personMapper;

    @GetMapping("/login/{id}")
    public Login getLoginById(@PathVariable("id")Integer id){
        System.out.println("进入controller查询login模块——————————");
        return loginMapper.getLoginById(id);
    }
    @GetMapping("/hello")
    public String get(){
        System.out.println("hello——————————");
        return "hello nihao ";
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id")Integer id){
        System.out.println("进入person查询模块——————————");
        return personMapper.getPersonById(id);
    }
}
