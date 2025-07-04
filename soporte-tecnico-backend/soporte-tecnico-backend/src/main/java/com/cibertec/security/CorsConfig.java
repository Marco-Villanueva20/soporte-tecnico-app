package com.cibertec.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    WebMvcConfigurer corsConfigurer() {
		
		return new WebMvcConfigurer() {
			
			public void addCorsMappings(CorsRegistry registry) {
				
				registry.addMapping("/login")
				.allowedOrigins("http://localhost:4200/")
				.allowedMethods("*")
				.exposedHeaders("*");
				
				registry.addMapping("/api/**")
				.allowedOrigins("http://localhost:4200/")
				.allowedMethods("*");
				
			}
			
			
		};
		
	}
	
}
