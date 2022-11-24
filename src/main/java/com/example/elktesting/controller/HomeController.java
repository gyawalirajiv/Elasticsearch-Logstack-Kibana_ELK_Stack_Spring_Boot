package com.example.elktesting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/{name}")
    public String home(@PathVariable String name){
        log.info("welcome " + name);
        return "Welcome";
    }
}