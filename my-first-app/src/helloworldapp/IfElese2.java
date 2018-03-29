package helloworldapp;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElese2 {

	public static void main(String[] args) {
		String number;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enrer un jour de la semaine:");
		number = in.nextLine();
		conversionJourSemaine(number);
	}

	public static void conversionJourSemaine(String jour) {
		int  i=0;
		String semaine [] = {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
		try {
			do {
				i++;
			}while((jour.equalsIgnoreCase(semaine[i]))!=true);
			System.out.println(i+1);
		}catch(ArrayIndexOutOfBoundsException e) {
			try {
			int number=Integer.parseInt(jour);
			if(number<=7 && number>=0) {
				System.out.println(semaine[number]);
			}else {
				System.out.println("entrez des données correctes svp");
			}
			}catch(NumberFormatException exec) {
				System.out.println("entrez des données correctes");
			}
		}
	}
}
