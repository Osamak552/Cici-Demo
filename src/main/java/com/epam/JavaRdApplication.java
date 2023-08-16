package com.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//sqp_d47a6ea3f138ca8935d12c2e246f9486f6c90ab1
//TOKEN

//mvn clean verify sonar:sonar -Dsonar.projectKey=DEMO-TOKEN -Dsonar.projectName='DEMO TOKEN'
//		-Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_d47a6ea3f138ca8935d12c2e246f9486f6c90ab1

@SpringBootApplication
public class JavaRdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRdApplication.class, args);
	}

}
