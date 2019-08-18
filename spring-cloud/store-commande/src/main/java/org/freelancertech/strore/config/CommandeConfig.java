/**
 * 
 */
package org.freelancertech.strore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ngos
 *
 */
@Configuration
public class CommandeConfig {

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
