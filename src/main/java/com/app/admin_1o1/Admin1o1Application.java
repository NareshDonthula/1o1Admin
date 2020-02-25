package com.app.admin_1o1;

import java.io.IOException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Admin1o1Application extends SpringBootServletInitializer{

	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
	         return app.sources(Admin1o1Application.class);
	     }
	public static void main(String[] args) throws IOException {
		   // PropertiesUtils.initProperties();
	        ConfigurableApplicationContext context = SpringApplication.run(Admin1o1Application.class, args);
	        Admin1o1Application fitnessAppApplication = context.getBean(Admin1o1Application.class);
	      //  printEnvironmentsProperties(fitnessAppApplication);
	}
}
