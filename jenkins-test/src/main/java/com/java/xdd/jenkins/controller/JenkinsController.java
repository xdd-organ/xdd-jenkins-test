package com.java.xdd.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @RequestMapping("test")
    public String test() {
        return "jenkins test success";
    }
}
