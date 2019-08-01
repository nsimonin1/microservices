/**
 *
 */
package org.simon.pascal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author nsimonin1
 *
 */
@Configuration
public class ProductConfiguration {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
