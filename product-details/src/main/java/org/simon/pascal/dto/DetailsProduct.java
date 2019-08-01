/**
 *
 */
package org.simon.pascal.dto;

/**
 * @author nsimonin1
 *
 */
public class DetailsProduct {
	private String fabricant;
	private String pays;
	private String ville;
	/**
	 * @return the fabricant
	 */
	public String getFabricant() {
		return fabricant;
	}
	/**
	 * @param fabricant the fabricant to set
	 */
	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
}
