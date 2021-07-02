package com.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Gateway")
public class GatewayResource {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
       return "Hello Spring Boot";
    }

}
