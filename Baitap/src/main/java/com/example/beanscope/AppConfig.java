package com.example.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(scopeName = "prototype")
    public Student studentBean() {
        return new Student();

    }
}
