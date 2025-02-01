package com.firstHelloapp.helloapp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellojava")
    public String greetHello()
    {
        return "<h1> Hello java </h1>";
    }
}
