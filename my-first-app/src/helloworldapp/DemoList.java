package helloworldapp;

import java.util.ArrayList;
import java.util.List;

import banque.Personne;

public class DemoList {

	public static void main(String[] args) {


		Personne stagiaire = new Stagiaire("Yves","nom",29);
		System.out.println(stagiaire.afficher());
	}
	public static void test() {
		List list;
		list = new ArrayList();
		list.add("chaine 1");
		list.add("chaine 2");
		list.add("chaine 3");
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static void test2() {
		ArrayList<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
		stagiaires.add(new Stagiaire("Martha","Nom",30));
		stagiaires.add(new Stagiaire("Samir","Nom",30));
		stagiaires.add(new Stagiaire("Yves","Nom",30));
		
		for(Stagiaire stagiaire : stagiaires) {
			System.out.println(stagiaire.afficher());
		}
	}
	public static void test3() {
		ArrayList stagiaires = new ArrayList();
		stagiaires.add(new Stagiaire("luis","nom",21));
		stagiaires.add(new Stagiaire("martha","nom",21));
		for(int i=0;i< stagiaires.size();i++) {
			Stagiaire stagiaire = (Stagiaire) stagiaires.get(i);
			System.out.println(stagiaire);
		}
	}
}
