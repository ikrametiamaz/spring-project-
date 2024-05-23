package com.example.jee.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Config implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Handling WebJars
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");

        // Handling static resources for CSS
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/");

        // Handling static resources for JavaScript
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/");

        // Handling static resources for images
        registry.addResourceHandler("/img/**")
                .addResourceLocations("classpath:/static/img/");
    }
}
