package com.example.assignments;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Assignment4 {
    //Assignment4

    //http://localhost:3000/myName
    //http://localhost:3000/setCookie
    //http://localhost:3000/deleteCookie

    @RequestMapping(value = "/setCookie", method = RequestMethod.GET)
    public String setCookie(HttpServletResponse response) {

        // 建立一個Cookie 物件
        Cookie cookie = new Cookie("username", "kaijun");

        // 設置過期時間，若無設置時間，其生命週期將持續到Session 過期為止
        cookie.setMaxAge(7*24*60*60);

        // 設置HTTPS 安全的Cookie
        cookie.setSecure(true);

        // 將Cookie 物件加入Response 中
        response.addCookie(cookie);

        return "redirect:http://localhost:3000/myName.html";
    }

    @RequestMapping(value = "/deleteCookie", method = RequestMethod.GET)
    public String deleteCookie(HttpServletResponse response) {

        // 將Cookie 值設置為null
        Cookie cookie = new Cookie("username", null);

        // 設置過期時間為0
        cookie.setMaxAge(0);

        // 將Cookie 物件加入Response 中
        response.addCookie(cookie);

        return "redirect:http://localhost:3000/myName.html";
    }

    @RequestMapping(value = "/myName", method = RequestMethod.GET)
    public String getCookie(@CookieValue(value = "username", required = false) String name, HttpServletResponse hsr) {

//        Cookie cookie = new Cookie("username", "test123");
//        cookie.setMaxAge(60*60);
//        cookie.setPath("/");
//        hsr.addCookie(cookie);

        if( name == null ) {

            return "redirect:http://localhost:3000/trackName.html";

        } else {

//            System.out.println(cookie);
            return "redirect:http://localhost:3000/myName.html";

        }
    }

    @RequestMapping(value = "/trackName", method = RequestMethod.GET)
    public String setCookie(@CookieValue(value = "username", required = false) String name, HttpServletResponse hsr) {

        Cookie cookie = new Cookie("username", "test123");
        cookie.setMaxAge(60*60);
        cookie.setPath("/");
        hsr.addCookie(cookie);

        if( name == null ) {

            return "redirect:http://localhost:3000/trackName.html";

        } else {

//            System.out.println(cookie);
            return "redirect:http://localhost:3000/myName.html";

        }
    }
}

