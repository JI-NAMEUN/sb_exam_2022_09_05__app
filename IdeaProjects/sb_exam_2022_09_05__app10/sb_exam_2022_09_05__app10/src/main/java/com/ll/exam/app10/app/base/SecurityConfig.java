package com.ll.exam.app10.app.base;

import main.java.com.ll.exam.app10.app.base.Configuration;
import main.java.com.ll.exam.app10.app.base.EnableWebSecurity;
import main.java.com.ll.exam.app10.app.base.HttpSecurity;
import main.java.com.ll.exam.app10.app.base.SecurityFilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**").permitAll();
        return http.build();
    }
}