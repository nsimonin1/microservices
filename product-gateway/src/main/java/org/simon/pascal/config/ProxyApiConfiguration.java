/**
 *
 */
package org.simon.pascal.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author nsimonin1
 *
 */
@Configuration
public class ProxyApiConfiguration {
	@Autowired
	private GatewayProperties properties;

	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider() {
		return () -> {
			final List<Object> resources = new ArrayList<>();
			properties.getRoutes().stream()
					.forEach(route -> resources.add(createResource(route.getServiceId(), route.getId(), "2.0")));
			return resources;
		};
	}

	private SwaggerResource createResource(String name, String location, String version) {
		final SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation("/" + location + "/v2/api-docs");
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}
