package com.example.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * HelloWorld method
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello World! Julia ";
    }

    /**
     * Info method
     * @return
     */
    @GetMapping("/info")
    public String info(){
        return "Informacja.";
    }
}
