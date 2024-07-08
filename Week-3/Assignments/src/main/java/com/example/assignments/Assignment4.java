package com.example.assignments;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Assignment4 {
    //Assignment4

    //http://localhost:3000/myName
    //http://localhost:3000/setCookie
    //http://localhost:3000/deleteCookie

//    @RequestMapping(value = "/setCookie", method = RequestMethod.GET)
//    public String setCookie(HttpServletResponse response) {
//
//        // create Cookie object
//        Cookie cookie = new Cookie("username", "kaijun");
//
//        // set overtime，若無設置時間，其生命週期將持續到Session 過期為止
//        cookie.setMaxAge(7*24*60*60);
//
//        // set HTTPS safe Cookie
//        cookie.setSecure(true);
//
//        // Add Cookie object to Response
//        response.addCookie(cookie);
//
//        return "myName";
//    }
//
//    @RequestMapping(value = "/deleteCookie", method = RequestMethod.GET)
//    public String deleteCookie(HttpServletResponse response) {
//
//        // set Cookie = null
//        Cookie cookie = new Cookie("username", null);
//
//        // set overtime = 0
//        cookie.setMaxAge(0);
//
//        // Add Cookie object to Response
//        response.addCookie(cookie);
//
//        return "myName";
//    }

    @RequestMapping(value = "/myName", method = RequestMethod.GET)
    public String getCookie(@CookieValue(value = "username", required = false) String name, HttpServletResponse hsr) {

        if( name == null ) {

//            return "redirect:http://localhost:3000/trackName.html";
            return "trackName";

        } else {

            return "myName";

        }
    }

    @RequestMapping(value = "/trackName", method = RequestMethod.GET)
    public String setCookie(@CookieValue(value = "username", required = false) String name, HttpServletResponse hsr) {

//        Cookie cookie = new Cookie("username", "test123");
//        cookie.setMaxAge(60*60);
//        cookie.setPath("/");
//        hsr.addCookie(cookie);

        if( name == null ) {

            return "trackName";

        } else {

            return "myName";

        }
    }
}

