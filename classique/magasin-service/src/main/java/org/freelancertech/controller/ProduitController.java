/**
 * 
 */
package org.freelancertech.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.freelancertech.dto.ProduitDto;
import org.freelancertech.service.ProduitService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ngos
 *
 */
@RestController
@RequestMapping("/api")
public class ProduitController {

	private final ProduitService service;
	
	/**
	 * @param service
	 */
	public ProduitController(ProduitService service) { 
		this.service = service;
	}
	
	@GetMapping("/produits")
	public List<ProduitDto> produits() {
		return service.getProduits().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/produits/{code}")
	public ProduitDto produits(@PathVariable String code) {
		return service.getProduit(code);
	}
	
}
