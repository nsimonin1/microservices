package org.simon.pascal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("product", r->r.path("/product").uri("http://localhost:8083"))
				.route("details", r->r.path("/details").uri("http://localhost:8081"))
				.route("price", r->r.path("/price").uri("http://localhost:8082"))
				.build();
	}

}
