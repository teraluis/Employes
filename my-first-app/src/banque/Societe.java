package banque;

import helloworldapp.Titulaire;

public class Societe implements Titulaire {
	private String raisonSociale;
	private String siegeSociale;
	private String siret;
	

	public Societe(String raisonSociale, String siegeSociale, String siret) {
		super();
		this.raisonSociale = raisonSociale;
		this.siegeSociale = siegeSociale;
		this.siret = siret;
	}



	@Override
	public String getIdentifiant() {
		return this.siret;
	}



	@Override
	public String getAdresse() {
		return this.siegeSociale;
	}
	
	
}
