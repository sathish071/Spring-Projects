package com.example.sect.sect.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SecurityDemo{
	
	PasswordEncoder ecoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	
	@Bean
	public UserDetailsService userDetailsService() {
	    UserDetails user = withUsername("user")
	            .password(ecoder.encode("password"))
	            .roles("USER")
	            .build();

	    UserDetails admin = User.withUsername("admin")
	            .password(passwordEncoder().encode("admin"))
	            .roles("ADMIN")
	            .build();

	    return new InMemoryUserDetailsManager(user, admin);
	}
	
	
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.
	
} 
