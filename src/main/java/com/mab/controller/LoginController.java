package com.mab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

    @PostMapping("/login")
    public String postLogin(
            HttpServletRequest request,
            @RequestParam(name = "username", required = true) String username,
            @RequestParam(name = "password", required = true) String password) {
        log.info("Request Client : " + request.getRemoteAddr());
        log.info("Request Param : " + username + " | " + password);
        
        return "dashboard";
    }

}
