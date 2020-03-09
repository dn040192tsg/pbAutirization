package com.example.autorization.controller;

import com.example.autorization.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private MessageRepo messageRepo;
    Authentication auth = null;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "hello";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {


        auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.put("messages", messageRepo.findByUsername(name));

        return "main";
    }




}
