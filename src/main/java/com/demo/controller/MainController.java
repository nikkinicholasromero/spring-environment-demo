package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private Environment environment;

    @GetMapping("/{name}")
    public String main(@PathVariable("name") String name) {
        return environment.getProperty("greetings.for." + name);
    }
}
