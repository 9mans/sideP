package com.sample.solo.side.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/side")
public class MainController {

    @GetMapping("/api/greeting")
    public String greet() {
        return "hello spring";
    }
}
