package banque;

import java.util.ArrayList;

import helloworldapp.Operation;
import helloworldapp.Titulaire;

public class Compte {
	public final static float SOLDE=0;
	private float decouverteAutorise;
	private static int nbrCompte;
	private int numeroCompte;
	private Titulaire titulaire;
	private ArrayList<Operation> operations = new ArrayList<Operation>();
	/*
	 * @param titulaire PM (id Sxxx) ou PP (Pxxxx)
	*/
	public Compte(Titulaire titulaire) {
		this.titulaire= titulaire;
		this.initAll();
	}
	public void setTitulaire(Titulaire titulaire) {
		this.titulaire=titulaire;
	}
	public String getProprietaire() {
		return "titulaire "+titulaire.getIdentifiant()+" "+titulaire.getAdresse();
	}
	public void crediter(float credit) {
		operations.add(new Operation(Operation.credit,credit));
	}
	public void debiter(float debit) throws ExceptionDecouvertAutorise  {
		Operation operation = new Operation(Operation.debit,debit);
		float tempSolde = getSolde()+operation.getMontant();
		if(Math.abs(tempSolde)>getDecouvertAutorise()) {
			throw new ExceptionDecouvertAutorise(getDecouvertAutorise(), "Pas autorise");
		}
		operations.add(operation);
	}
	public float getDecouvertAutorise() {
		return this.decouverteAutorise;
	}
	public float getSolde() {
		float solde = SOLDE;
		for(Operation operation : operations) {
			solde+=operation.getMontant();
		}
		return solde;
	}


	public void initAll() {
		if(this.titulaire instanceof Personne ) {
			decouverteAutorise =100;
		}else {
			decouverteAutorise = 1000;
		}
	}
	public void getLeProprietaire() {
		System.out.println("Identifiant :"+titulaire.getIdentifiant()+" Adresse "+titulaire.getAdresse());
	}
	public void visualiser() {
		System.out.println("Identifiant : "+titulaire.getIdentifiant()+" Adresse  "+titulaire.getAdresse()+" numero compte :"+this.numeroCompte+" decouvert authorise "+this.decouverteAutorise);
	}

	public void listerOperation() {
		for(Operation operation : operations) {
			System.out.println(operation.getType()+" "+operation.getMontant());
		}
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

}
