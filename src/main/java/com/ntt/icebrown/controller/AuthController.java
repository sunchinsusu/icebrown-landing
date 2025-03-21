package com.ntt.icebrown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/auth")
public class AuthController {
    @GetMapping("/request")
    public String requestAuth() {
        return "login";
    }

    @GetMapping
    public String landing() {
        return "landing";
    }
}
