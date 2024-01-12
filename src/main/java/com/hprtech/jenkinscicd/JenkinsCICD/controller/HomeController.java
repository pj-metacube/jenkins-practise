package com.hprtech.jenkinscicd.JenkinsCICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("")
    public String printHello(){
        return "SpringBoot app is up and running............";
    }
}
