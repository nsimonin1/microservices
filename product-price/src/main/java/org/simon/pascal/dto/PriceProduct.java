/**
 *
 */
package org.simon.pascal.dto;

/**
 * @author nsimonin1
 *
 */
public class PriceProduct {
	private double prix;
	private Boolean actif;
	private Double prixTransport;
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}
	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	/**
	 * @return the prixTransport
	 */
	public Double getPrixTransport() {
		return prixTransport;
	}
	/**
	 * @param prixTransport the prixTransport to set
	 */
	public void setPrixTransport(Double prixTransport) {
		this.prixTransport = prixTransport;
	}

}
