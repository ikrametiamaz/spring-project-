package com.example.jee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {

    @GetMapping("/index")
    public String Start()
    {
        return "index";
    }

    @GetMapping("login")
    public String Login()
    {
        return "login";
    }
}
