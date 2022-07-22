package com.dias.mainapp.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingEndpoint {

    @GetMapping
    public String greet() {
        return "Be welcome";
    }
}
