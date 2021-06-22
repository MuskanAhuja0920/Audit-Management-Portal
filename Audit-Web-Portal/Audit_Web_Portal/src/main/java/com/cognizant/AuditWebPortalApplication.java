package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.builder.SpringApplicationBuilder;

 // This is Application class for Spring boot
 
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class AuditWebPortalApplication extends SpringBootServletInitializer {

	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
	         return app.sources(AuditWebPortalApplication.class);
	     }
	
	public static void main(String[] args) {
		SpringApplication.run(AuditWebPortalApplication.class, args);
	}

}
