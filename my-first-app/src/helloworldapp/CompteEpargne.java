package helloworldapp;

import banque.Compte;

public class CompteEpargne extends Compte {
	private long serialVersionUID;
	private float taux;
	private float interet;
	public CompteEpargne(Titulaire titulaire) {
		super(titulaire);
	}
}
