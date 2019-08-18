/**
 * 
 */
package org.freelancertech.strore.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.tuple.Pair;
import org.freelancertech.strore.client.ProduitClient;
import org.freelancertech.strore.dto.CommandeDto;
import org.freelancertech.strore.dto.CommandeProduitDto;
import org.freelancertech.strore.dto.ProduitDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author ngos
 *
 */
@Component
public class CommandeService {
	@Value("classpath:data/commande.csv")
	private Resource produitsData;
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ProduitClient produitClient;
	
	private final List<CommandeDto> produits=new ArrayList<>();
	
	@PostConstruct
	public void init() throws IllegalStateException, FileNotFoundException, IOException { 
		produits.addAll(new CsvToBeanBuilder<CommandeDto>(new FileReader(produitsData.getFile()))
			       .withType(CommandeDto.class).build().parse());		 
	}
	/**
	 * @return the produits
	 */
	public Collection<CommandeDto> getCommandes() {
		return produits;
	}
	 
	public Optional<CommandeDto> getCommande(String code) {
		return produits.stream().filter(produit->code.equals(produit.getCode())).findFirst();
	}
	
	public List<CommandeProduitDto> commandesProduits() {		
		Map<String, List<CommandeDto>> result=produits
				.stream().collect(Collectors.groupingBy(CommandeDto::getCode,
						Collectors.toList()));
		List<CommandeProduitDto> cmdProduits=new ArrayList<>();
		result.forEach((key,values)-> {
			Double total=values.stream().map(cmd->cmd.getPrixUnitaire()*cmd.getQte())
					.collect(Collectors.summingDouble(Double::doubleValue));
			Optional<CommandeDto> cmde=values.stream().findFirst();	
		cmdProduits.add(new CommandeProduitDto().code(key)
				.date(cmde.map(CommandeDto::getDate).orElse(new Date()))
				.montant(total) 
				.produits(values.stream().map(cmd->findProduit(cmd)
						.qte(cmd.getQte()).prix(cmd.getPrixUnitaire())
						).collect(Collectors.toList())));
		  }
	     );
		 
		return  cmdProduits;
	}
	
	private ProduitDto findProduit(CommandeDto command) { 
		return produitClient.getProduit(command.getCodeProduit());
		
	}
	
}
