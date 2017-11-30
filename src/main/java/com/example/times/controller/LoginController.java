package com.example.times.controller;

import com.example.times.WebSecurityConfig;
import com.example.times.model.TimeUser;
import com.example.times.service.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by rb on 2017/10/24.
 */
@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY)String account, Model model){

        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/loginVerify")
    public String loginVerify(String username,String password,HttpSession session){
        TimeUser user = new TimeUser();
        user.setUsername(username);
        user.setPassword(password);

        boolean verify = loginService.verifyLogin(user);
        if (verify) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
            session.setAttribute("user", user);
            return "index";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }

}
