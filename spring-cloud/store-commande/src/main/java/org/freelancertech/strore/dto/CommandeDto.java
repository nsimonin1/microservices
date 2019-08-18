/**
 * 
 */
package org.freelancertech.strore.dto;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

/**
 * @author ngos
 *
 */
public class CommandeDto {
	@CsvBindByName
	private String code;
	@CsvBindByName(column = "produit")
	private String codeProduit;
	@CsvBindByName
	private Integer qte;
	@CsvBindByName(column = "prix_unitaire")
	private Double prixUnitaire;
	@CsvBindByName
	@CsvDate("dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date date;
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
	 * @return the codeProduit
	 */
	public String getCodeProduit() {
		return codeProduit;
	}
	/**
	 * @param codeProduit the codeProduit to set
	 */
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
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
	/**
	 * @return the prixUnitaire
	 */
	public Double getPrixUnitaire() {
		return prixUnitaire;
	}
	/**
	 * @param prixUnitaire the prixUnitaire to set
	 */
	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
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
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CommandeDto)) {
			return false;
		}
		CommandeDto other = (CommandeDto) obj;
		return Objects.equals(code, other.code);
	}
	 
	
	
	
}
