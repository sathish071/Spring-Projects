package com.example.swag2.demoSwag2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class DemoSwag2Application{

	public static void main(String[] args) {
		SpringApplication.run(DemoSwag2Application.class, args);
		
		@Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI().info(new Info().title("My API").version("1.0"));
	    }
	}

}
