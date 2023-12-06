package com.example.authentication.configuration.WebConfiguration;

import com.example.authentication.service.UserDetailsImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
@AllArgsConstructor
public class WebConfiguration {
    private UserDetailsImpl userDetailServiceImpl;
    private PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable());
        http.headers(headers -> headers.disable());
        http.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll());
        http.formLogin(f -> f.permitAll());
        http.userDetailsService(userDetailServiceImpl);
        return http.build();

    }
}
