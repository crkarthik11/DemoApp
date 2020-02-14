package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.Admin;
import com.thinkxfactor.demoApp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController{

    @Autowired
    AdminRepository adminRepository;
    
    @GetMapping("/getAdmin")
    public Admin helloAdmin(@RequestParam Long id) {
        Optional<Admin> byId = adminRepository.findById(id);
        return byId.get();
    }

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin){
        Admin persistedAdmin = adminRepository.saveAndFlush(admin);
        return persistedAdmin;
    }








//    @PostMapping("/add")
//    public Admin addUser(@RequestBody Admin admin) {
//
//        return admin;
//    }
}