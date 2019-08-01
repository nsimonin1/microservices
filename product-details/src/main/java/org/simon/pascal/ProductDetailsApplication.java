package org.simon.pascal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class ProductDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
	}

	@Bean
	 public Docket swaggerApi() {
	  return new Docket(DocumentationType.SWAGGER_2)
	   .select()
	   .apis(RequestHandlerSelectors.basePackage("org.simon.pascal.controller"))
	   .paths(PathSelectors.any())
	   .build()
	   .apiInfo(new ApiInfoBuilder().version("1.0").title("Product details API").description("Documentation Employee API v1.0").build());
	 }

}
