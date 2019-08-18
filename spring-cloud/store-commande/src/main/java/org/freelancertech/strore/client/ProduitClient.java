/**
 * 
 */
package org.freelancertech.strore.client;

import org.freelancertech.strore.dto.ProduitDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ngos
 *
 */
@FeignClient(name = "store-service")
public interface ProduitClient {

	@GetMapping("/api/produits/{code}")
	ProduitDto getProduit(@PathVariable("code")String code);
}
