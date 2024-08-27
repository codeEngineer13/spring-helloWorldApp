package com.example.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World! Julia ";
    }

    @GetMapping("/info")
    public String info(){
        return "Informacja.";
    }
}
