package com.loksai.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")  // root mapping
    public String index() {
        return "App is running!";
    }

}
