package ru.practicum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @GetMapping("/test2")
    public String test() {
        return "OK from controller2!";
    }
}