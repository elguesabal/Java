package com.java.Project_1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class Vampeta {
    @GetMapping
    public String vampeta() {
        return ("Vampeta");
    }
}