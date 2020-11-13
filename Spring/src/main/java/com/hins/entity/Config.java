package com.hins.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Any any(){
        Any any = new Any();
        any.setId(5);
        any.setName("java config");
        return any;
    }
}
