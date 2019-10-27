package com.dresscode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tipsController {
    @GetMapping("/home/tips")
    public String tips() {
        return "tips";
    }
}
