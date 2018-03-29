package helloworldapp;

import java.util.ArrayList;

public class Salle {
	protected int numero;
	protected String nom;
	protected String cours;
	protected ArrayList<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
	
	public Salle(int numero, String nom, String cours) {
		this.numero = numero;
		this.nom = nom;
		this.cours = cours;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public void AjouterStagiaire(Stagiaire stagiaire) {
		stagiaire.setCours(this.cours);
		stagiaires.add(stagiaire);
		
	}
	public void afficherStagiaires() {
		System.out.println("cours : "+this.cours);
		for(Stagiaire stagiaire : this.stagiaires) {
			System.out.println("prenom "+stagiaire.getPrenom()+" nom "+stagiaire.getNom());
		}
	}
	public int nbStagiaires() {
		return stagiaires.size();
	}
	public String toString() {
		return " Salle [numer="+this.numero+" , nom "+this.nom+" ] ";
	}
	
	
}
