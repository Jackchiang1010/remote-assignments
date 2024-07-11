package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//http://localhost:3000/index
//mysqldump -u root -p assignment > backup.sql

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String goIndex() {

        return "home";

    }

    @RequestMapping(value = "/user/signUp", method = RequestMethod.POST)
    public String getUser(@RequestParam String email) {

        User user = userService.getUserByEmail(email);

        try {

            if(user != null) {

                return "member";

            } else {

                return "home";

            }

        } catch (Exception e) {

            e.printStackTrace();
            return "home";

        }

    }

    @RequestMapping(value = "/user/signIn", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User userRequest) {

        User user = userService.getUserByEmail(userRequest.getEmail());

        try {

            if(user != null) {

                return "home";

            } else {

                return "member";

            }

        } catch (Exception e) {

            e.printStackTrace();
            return "home";

        }

    }
}
