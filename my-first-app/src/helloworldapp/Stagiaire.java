package helloworldapp;

import banque.Personne;

public class Stagiaire extends Personne implements IPersonne,Cloneable {
	private String cours;
	private Salle salle;
	public Stagiaire() {
		this.cours = "java";
	}
	
	public Stagiaire(String _nom,String _prenom ,int _age,String cours) {
		super(_nom,_prenom,_age);
		this.cours=cours;
	}
	public Stagiaire(String _nom,String _prenom ,int _age) {
		super(_nom,_prenom,_age);
		this.cours="java";
	}
	public String getCours() {
		return this.cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public String afficher() {
		String affichage = super.afficher();
		return affichage+"Cours : "+salle;
	}
	public void setNom(String nom) {
		super.setNom(nom);
	}
	public void setPrenom(String prenom) {
		super.setPrenom(prenom);
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	@Override
	public String toString() {
		return "Stagiaire : "+this.getNom()+" "+this.getPrenom();
	}


	@Override
	public void seDeplacer() {
		System.out.println("prend le buss");
	}

	@Override
	public void manger() {
		System.out.println("mange des boites de conserve");
	}

	@Override
	public boolean dormir() {
		return false;
	}

	@Override
	public String getIdentifiant() {
		return super.getPrenom()+" ";
	}
}
