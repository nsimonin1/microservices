/**
 * 
 */
package org.freelancertech.strore.dto;

import com.opencsv.bean.CsvBindByName;

/**
 * @author ngos
 *
 */
public class ProduitDto {
	@CsvBindByName
	private String code;
	@CsvBindByName
	private String designation; 
	private Integer qte;
	private Double prix;
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
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the qte
	 */
	public Integer getQte() {
		return qte;
	}
	/**
	 * @param qte the qte to set
	 */
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	
	public ProduitDto qte(Integer qte) {
		this.qte = qte;
		return this;
	}
	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public ProduitDto prix(Double prix) {
		this.prix = prix;
		return this;
	}
	 
	
	
}
