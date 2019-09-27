package com.vinu.swaggerwithspringboot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerWithSpringBootApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfig(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.vinu"))
				.build()
				.apiInfo(apiInformation());
	}
	
	private ApiInfo apiInformation(){
		return new ApiInfo(
				"This is application name", 
				"This is a description of the application", 
				"1.0",
				"This is a terms field", 
				new springfox.documentation.service.Contact("Vinu Borse", "https://github.com/vinuborse/swagger-with-spring-boot", "borsemoon@gmail.com"), 
				"this is Api license",
				"https://github.com/vinuborse/swagger-with-spring-boot", 
				Collections.emptyList());
	}
}
