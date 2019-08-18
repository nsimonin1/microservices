/**
 * 
 */
package org.freelancertech.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.freelancertech.dto.CommandeDto;
import org.freelancertech.dto.CommandeProduitDto;
import org.freelancertech.dto.ProduitDto;
import org.freelancertech.service.CommandeService; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
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
public class CommandeController {

	private final CommandeService service;
	
	/**
	 * @param service
	 */
	public CommandeController(CommandeService service) { 
		this.service = service;
	}
	
	@GetMapping("/commandes")
	public List<CommandeDto> commande() {
		return service.getCommandes().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/commandes/{code}") 
	public ResponseEntity<CommandeDto> commande(@PathVariable String code) {
		return service.getCommande(code)
				.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/commandes-produits") 
	public List<CommandeProduitDto> commandeProduits() {
		return service.commandesProduits();
	}
	
}
