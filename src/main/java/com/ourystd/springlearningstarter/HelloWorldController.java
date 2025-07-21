package com.ourystd.springlearningstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String hello() {
        return "Hello, World!";
    }
}
