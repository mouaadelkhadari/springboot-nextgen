package com.spproject.spproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/message")
    public String message(){
        return "voici mon message";
    }

    @GetMapping("/deuxiememessage")
    public String deuxiemeMessage(){
        return "voici mon deuxième message";
    }
}
