package com.springboot.kubernetes.springbootk8s.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ResourceController {

    @GetMapping
    public String getUsers(){
        return "Hello Kubernetes";
    }


}

