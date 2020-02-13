package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController{

    @GetMapping("/hello")
    public String helloAdmin() {
        return "Hello World";
    }

    @GetMapping("/hello2")
    public List<Admin> hello(@RequestParam("name") String name){
        Admin admin = new Admin(name);
        java.util.List adminList =  new ArrayList();
        adminList.add(admin);
        return adminList;
    }
}