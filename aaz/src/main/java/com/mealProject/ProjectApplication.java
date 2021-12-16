package com.mealProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
@SpringBootApplication
public class ProjectApplication extends SpringBootServletInitializer{

public static void main(String[] args) {
    SpringApplication applicatino = new SpringApplication(ProjectApplication.class);
}

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    // TODO Auto-generated method stub
    return builder.sources(ProjectApplication.class);
}

}
//@SpringBootApplication
//public class ProjectApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ProjectApplication.class, args);
//	}
//
//}
