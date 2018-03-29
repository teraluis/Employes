package helloworldapp;

abstract public class Vehicule {
	protected String Marque;
	protected int nb_roue;
	protected String couleur;
	protected String moteur;
	
	public Vehicule () {
		this.setMarque(Marque);
		this.setNb_roue(nb_roue);
		this.couleur="noir";
		this.moteur="4 temps";
	}
	

	public Vehicule(String marque, int nb_roue, String couleur, String moteur) {
		Marque = marque;
		this.nb_roue = nb_roue;
		this.couleur = couleur;
		this.moteur = moteur;
	}


	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}

	public int getNb_roue() {
		return nb_roue;
	}

	public void setNb_roue(int nb_roue) {
		this.nb_roue = nb_roue;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMoteur() {
		return moteur;
	}

	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
	
}
