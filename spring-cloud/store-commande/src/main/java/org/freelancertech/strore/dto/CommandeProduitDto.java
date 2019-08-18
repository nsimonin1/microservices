/**
 * 
 */
package org.freelancertech.strore.dto;

import java.util.Date;
import java.util.List;

/**
 * @author ngos
 *
 */
public class CommandeProduitDto {
	
	private Date date;
	private String code;
	private Double montant; 
	private List<ProduitDto>produits;
	/**
	 * @return the produits
	 */
	public List<ProduitDto> getProduits() {
		return produits;
	}
	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<ProduitDto> produits) {
		this.produits = produits;
	}
	public CommandeProduitDto produits(List<ProduitDto> produits) {
		this.produits = produits;
		return this;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	public CommandeProduitDto code(String code) {
		this.code = code;
		return this;
	}
	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public CommandeProduitDto montant(Double montant) {
		this.montant = montant;
		return this;
	}
	 
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public CommandeProduitDto date(Date date) {
		this.date = date;
		return this;
	}
	
	
}
