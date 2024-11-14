package com.microservice.emp.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigarationEmp {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
}
