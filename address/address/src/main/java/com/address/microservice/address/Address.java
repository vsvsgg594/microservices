package com.address.microservice.address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Address {

    @GetMapping("/address")
    public String showAddress()
    {
        return " i am from Bihar";
    }
}
