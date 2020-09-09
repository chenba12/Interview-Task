package com.example.serviceLog.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @GetMapping("log")
    public String handleB() {
        log.info("Shuffle array requested from micro-service Shuffle");
        return "Shuffle array requested from micro-service Shuffle";
    }
}