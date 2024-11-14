package com.microservice.emp.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmpService {
    @Autowired
    private RestTemplate restTemplate;



 
    @GetMapping("/emp")
    public String empImfo(){
        String str=restTemplate.getForObject("http://localhost:8082/address",String.class);
        return "hi , i am software developer"+str;
    }
    @GetMapping("/emp/location")
    public String empCurrentLocation(){
        String str1=restTemplate.getForObject("http://localhost:8082/location",String.class);
        return str1;
    }
    
}
