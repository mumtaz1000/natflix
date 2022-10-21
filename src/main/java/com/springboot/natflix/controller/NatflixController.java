package com.springboot.natflix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NatflixController {

    @GetMapping("/hello-check")
    public String hello() {
        return "Hello";
    }



}
