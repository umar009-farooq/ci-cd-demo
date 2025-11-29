package com.rusum.ci_cd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//1.This is the first step and i am creating simple controller
    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Jenkins CI/CD Working!";
        }

}
