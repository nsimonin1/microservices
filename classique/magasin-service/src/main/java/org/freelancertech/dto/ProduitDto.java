/**
 * 
 */
package org.freelancertech.dto;

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
	@CsvBindByName
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
	
	
}
