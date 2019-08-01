/**
 *
 */
package org.simon.pascal.controller;

import org.simon.pascal.dto.PriceProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nsimonin1
 *
 */
@RestController
@RequestMapping("/api/price")
public class PriceController {

	@GetMapping("/{id}")
	public ResponseEntity<PriceProduct> findDetails(@PathVariable String id){
		return ResponseEntity.notFound().build();
	}
}
