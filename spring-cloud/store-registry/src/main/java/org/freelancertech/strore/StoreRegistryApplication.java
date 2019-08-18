package org.freelancertech.strore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StoreRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreRegistryApplication.class, args);
	}

}
