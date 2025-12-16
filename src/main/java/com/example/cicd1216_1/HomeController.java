package com.example.cicd1216_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hi")
    public String home() {
        return "home";
    }

    @GetMapping("/hi2")
    public String home2() {
        return "home2";
    }

    @GetMapping("/hi3")
    public String home3() {
        return "cicd 적용!!";
    }
}
