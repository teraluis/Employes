package banque;

import java.util.Scanner;

public class TestCompte {

	public static void main(String[] args) {
		Personne personne = new Personne();
		System.out.println(personne.getAdresse());
		Compte compte = new Compte(personne);
		compte.setNumeroCompte(123456789);
		//Scanner in = new Scanner(System.in);
		boolean sortir=false;
		do {
			try {
				sortir=modifierCompte(compte);
			} catch (ExceptionDecouvertAutorise e) {
				System.out.println("decouverte depassé");
			}
		}while(sortir==false);
		System.out.println("fin de programme");
		//in.close();
	}

	public static boolean modifierCompte(Compte compte) throws ExceptionDecouvertAutorise {
		System.out.println("Voulez vous crediter , debiter ou afficher votre compte crediter/debiter/afficher/exit:");
		String oui;
		boolean sortir=false;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		oui = in.next(); //lecture d'une String
		switch(oui) {
		case "crediter" :
			System.out.println("Quel montant :");
			float montant= in.nextFloat();
			compte.crediter(montant);
			break;
		case "debiter" :
			System.out.println("Quel montant :");
			float montantDebit= in.nextFloat();
			compte.debiter(montantDebit);
			break;
		case "exit":
			sortir=true;
			break;
		default :
			System.out.println("decouvert : "+compte.getDecouvertAutorise());
			System.out.println("Historique");
			System.out.print("Solde actuel:");
			System.out.println(compte.getSolde());
			compte.listerOperation();
			compte.visualiser();
			break;
		}
		return sortir;
		
	}
}
