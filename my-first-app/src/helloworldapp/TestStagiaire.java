package helloworldapp;

import java.util.ArrayList;

public class TestStagiaire {

	public static void main(String[] args) {
		Salle salle21 = new Salle(21,"salle d'informatique","java");
		Stagiaire [] listeStagiaires = {new Stagiaire("Luis","Manresa",28),new Stagiaire("Silvan","lalier",30),
				new Stagiaire("Silvan","lalier",30)};
		ArrayList<Stagiaire> listeStagiaires2 = new ArrayList<Stagiaire>();
		for(int i = 0;i<listeStagiaires.length;i++) {
			listeStagiaires2.add(listeStagiaires[0]);
		}
		for(int i = 0;i<listeStagiaires.length;i++) {
			salle21.AjouterStagiaire(listeStagiaires[i]);
		}
		salle21.afficherStagiaires();
		
	}

}
