package com.address.microservice.address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Location{

    @GetMapping("/location")
    public String currentLocation(){
        return "current location is Noida";
    }
    
}