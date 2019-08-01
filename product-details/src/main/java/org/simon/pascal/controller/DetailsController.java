/**
 *
 */
package org.simon.pascal.controller;

import org.simon.pascal.dto.DetailsProduct;
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
@RequestMapping("/api/details")
public class DetailsController {

	@GetMapping("/{id}")
	public ResponseEntity<DetailsProduct> findDetails(@PathVariable String id){
		final DetailsProduct details=new DetailsProduct();
		details.setFabricant("Onelogic");
		details.setPays("France");
		details.setVille("Paris");
		return ResponseEntity.ok(details);
	}
}
