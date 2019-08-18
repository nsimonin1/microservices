/**
 * 
 */
package org.freelancertech.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.freelancertech.dto.ProduitDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author ngos
 *
 */
@Component
public class ProduitService {
	@Value("classpath:data/produits.csv")
	private Resource produitsData;
	private final Map<String,ProduitDto> produits=new ConcurrentHashMap<>(10);
	
	@PostConstruct
	public void init() throws IllegalStateException, FileNotFoundException, IOException { 
		List<ProduitDto> result = new CsvToBeanBuilder<ProduitDto>(new FileReader(produitsData.getFile()))
			       .withType(ProduitDto.class).build().parse();
		produits.putAll(
		result.stream().collect(Collectors.toMap(ProduitDto::getCode, produit->produit)));
	}
	/**
	 * @return the produits
	 */
	public Collection<ProduitDto> getProduits() {
		return produits.values();
	}
	 
	public ProduitDto getProduit(String code) {
		return produits.get(code);
	}
	
	
}
