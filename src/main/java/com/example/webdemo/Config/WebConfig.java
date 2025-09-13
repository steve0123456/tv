package com.example.webdemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class WebConfig {

        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/api/**")
                            .allowedOrigins("https://enchanting-liger-9649d3.netlify.app/") // 👈 replace with your Netlify site
                            .allowedMethods("GET", "POST", "PUT", "DELETE")
                            .allowCredentials(true);
                }
            };
        }
    }


