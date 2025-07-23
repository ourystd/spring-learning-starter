package com.ourystd.springlearningstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${SERVER_PORT}")
    private String serverPort;
    private final Environment env;

    public HelloWorldController(Environment env) {
        this.env = env;
    }

    @GetMapping(path="/env")
    public String env() {
        return String.join(" ", this.env.getProperty("spring.application.name", "unknown"),
                serverPort);
    }

    @GetMapping(path="/hello")
    public String hello() {
        return "Hello, World!";
    }
}
