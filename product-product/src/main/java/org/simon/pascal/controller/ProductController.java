/**
 *
 */
package org.simon.pascal.controller;

import java.net.URI;

import org.simon.pascal.dto.DetailsProduct;
import org.simon.pascal.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author nsimonin1
 *
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/{id}")
	public ResponseEntity<Product> findDetails(@PathVariable String id){
		final URI uri = discoveryClient.getInstances("details-service").get(0).getUri();
		final String url=uri.toString()+"/api/details/1";
		final DetailsProduct details=restTemplate.getForObject(url, DetailsProduct.class);
		final Product product=new Product();
		product.setDesignation("Livre");
		product.setSerie("00000012");
		product.setDetails(details);
		return ResponseEntity.ok(product);
	}
}
