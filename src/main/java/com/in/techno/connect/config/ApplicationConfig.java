package com.in.techno.connect.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@SpringBootApplication
@ComponentScan(basePackages = {"com.in.techno.connect"})
public class ApplicationConfig extends SpringBootServletInitializer {
	
	
	public static void main(String[] args) {
 		ApplicationContext context = SpringApplication.run(ApplicationConfig.class, args);
	}
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(ApplicationConfig.class);
	}
}
