package com.example.assignments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String test() {
        System.out.println("Hi!");
        return "Hello, My Server!";
    }
}
