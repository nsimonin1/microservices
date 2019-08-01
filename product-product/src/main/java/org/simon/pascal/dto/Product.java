/**
 *
 */
package org.simon.pascal.dto;

/**
 * @author nsimonin1
 *
 */
public class Product {
	private String serie;
	private String designation;
	private DetailsProduct details;
	/**
	 * @return the serie
	 */
	public String getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(String serie) {
		this.serie = serie;
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
	 * @return the details
	 */
	public DetailsProduct getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(DetailsProduct details) {
		this.details = details;
	}

}
