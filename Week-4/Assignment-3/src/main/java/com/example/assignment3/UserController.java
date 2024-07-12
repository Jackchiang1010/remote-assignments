package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

//http://localhost:3000/home
//mysqldump -u root -p assignment > backup.sql

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String goIndex() {

        return "home";

    }

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public String goMember() {

        return "member";

    }

    @RequestMapping(value = "/user/signIn", method = RequestMethod.POST)
    public ResponseEntity<String> getUser(@RequestBody User userRequest) {

        try {

            User userEmail = userService.getUserByEmail(userRequest.getEmail());
            User userPassword = userService.getUserByPassword(userRequest.getPassword());

            if(userEmail != null && userPassword != null) {

                System.out.println(userRequest.getEmail());
                System.out.println(userRequest.getPassword());
                return ResponseEntity.ok("success");

            } else {

                System.out.println(userEmail);
                System.out.println(userPassword);
                return ResponseEntity.ok("failure");

            }

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println(e);
            return ResponseEntity.ok("failure");

        }

    }

    @RequestMapping(value = "/user/signUp", method = RequestMethod.POST)
    public ResponseEntity<String> createUser(@RequestBody User userRequest) {

        try {

            User user = userService.getUserByEmail(userRequest.getEmail());

            if(user != null) {

                return ResponseEntity.ok("failure");

            } else if(userRequest.getEmail().isEmpty() || userRequest.getPassword().isEmpty()){

                return ResponseEntity.ok("empty");

            } else {

                userService.createUser(userRequest);
                System.out.println(userRequest.getEmail());
                System.out.println(userRequest.getPassword());
                return ResponseEntity.ok("success");

            }

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.ok("failure");

        }

    }
}
