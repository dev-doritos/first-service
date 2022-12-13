package com.example.firstservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome(@RequestHeader(value = "first-request") String header) {
        log.info("header : {}", header);
        return "Welcome First Service";
    }

    @GetMapping("/check")
    public String welcome() {
        return "LogFilter Test";
    }
}
