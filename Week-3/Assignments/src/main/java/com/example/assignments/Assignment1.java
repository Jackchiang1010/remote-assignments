package com.example.assignments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1 {

    //Assignment1

    //http://localhost:3000/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        System.out.println("Hi!");
        return "Hello, My Server!";
    }

}
