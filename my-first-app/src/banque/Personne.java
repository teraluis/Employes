package banque;

import helloworldapp.Titulaire;

public  class Personne implements Titulaire {
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	
	public Personne() {
		this("luis","manresa",28);
	}


	public Personne(String nom, String prenom, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.setAdresse("28 rue du Moulin");
		this.age=age;
	}


	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}

	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public String afficher() {
		return this.nom+" "+this.prenom+" "+this.age+"\n\r";
	}

	@Override
	public String getIdentifiant() {
		return prenom+nom;
	}
}
