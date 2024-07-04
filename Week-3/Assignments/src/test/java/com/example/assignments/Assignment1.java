package com.example.assignments;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

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
