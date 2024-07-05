package com.example.assignments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class AssignmentsApplicationTest {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentsApplicationTest.class, args);

	}

//	@Bean
//	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> serverCustomizer() {
//		return server -> server.setPort(3000);
//	}
}
